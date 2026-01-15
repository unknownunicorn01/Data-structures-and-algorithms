import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class c1_deleteIdx {
  public static Node convert(int[] arr){
    Node head = new Node(arr[0]);
    Node temp = head;
    for(int i=1;i<arr.length;i++){
      Node nn = new Node(arr[i]);
      temp.next = nn;
      temp = temp.next;
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
  public static Node DeleteIdx(Node head,int k){
    if(head == null){
      return null;
    }
    if(k == 0){
      head = head.next;
      return head;
    }
    Node temp = head;
    Node prev = null;
    int c = 0;
    while(temp != null && c<k){
      prev = temp;
      temp = temp.next;
      c++;
    }
    if(temp == null){
      return head;
    }
    prev.next = prev.next.next;
    return head;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Node head = convert(arr);
    // traverse(head);
    int num = sc.nextInt();
    head = DeleteIdx(head,num);
    traverse(head);
    sc.close();

  }
}
