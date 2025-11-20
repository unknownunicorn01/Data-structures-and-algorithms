import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}

public class d2_problem {
  public static Node convert(int[] arr){
    Node head = new Node(arr[0]);
    Node temp = head;
    for(int i=1;i<arr.length;i++){
      Node nn = new Node(arr[i]);
      temp.next = nn;
      temp = nn; 
    }
    return head;
  }  
  static void traverse(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  public static int lengthNode(Node head){
    int n = 0;
    Node temp = head;
    while(temp != null){
      temp = temp.next;
      n++;
    }
    return n;
  }
  static Node removeIdx(Node head,int idx){
    if(head == null){
      return null;
    }
    int len = lengthNode(head);
    Node temp = head;
    if(idx == len){
      head = head.next;
      return head;
    }
    int c = 0;
    while(c<len-idx -1){
      temp = temp.next;
      c++;
    }
    temp.next = temp.next.next;
    return head;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int idx  = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Node head  = convert(arr);
    // traverse(head);
    // System.out.println(lengthNode(head));
    // System.out.println("Enter the index: ");
    
    head = removeIdx(head,idx);
    traverse(head);
    sc.close();
  }
}
