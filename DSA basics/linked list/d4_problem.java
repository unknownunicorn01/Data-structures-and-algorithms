import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
class NodeFunc{
  Node convert(int[] arr){
    Node head = new Node(arr[0]);
    Node temp = head;
    for(int i=1;i<arr.length;i++){
      Node nn = new Node(arr[i]);
      temp.next = nn;
      temp = nn;
    }
    return head;
  }
  void traverse(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  Node deleteNode(Node head,int idx){
    if(head == null){
      return null;
    }
    Node temp = head;
    if(idx == 1){
      temp = head.next;
      return temp;
    }
    int c = 1;
    while(c<idx -1){
      temp = temp.next;
      c++;
    }
    temp.next = temp.next.next;
    return head;
  }
}
public class d4_problem {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the index: ");
    int idx = sc.nextInt();
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    head = nd.deleteNode(head,idx);
    nd.traverse(head);
    sc.close();
  }
}
