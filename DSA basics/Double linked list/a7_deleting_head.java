import java.util.*;
class Node{
  int data;
  Node next;
  Node back;
  Node(int data){
    this.data = data;
  }
  Node(int data,Node next,Node back){
    this.data = data;
    this.next = next;
    this.back = back;
  }
}
class NodeFunc{
  Node convert(int[] arr){
    Node head = new Node(arr[0]);
    Node temp = head;
    for(int i=1;i<arr.length;i++){
      Node crr = new Node(arr[i]);
      temp.next = crr;
      crr.back = temp;
      temp = crr;
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
  Node deleteHead(Node head){
    if(head == null || head.next == null) return null;
    Node temp = head.next;
    head.next = null;
    temp.back = null;
    head = temp;
    return head;
  }
}
public class a7_deleting_head {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    head = nd.deleteHead(head);
    nd.traverse(head);
    sc.close();
  }
}
