import java.util.*;
class Node{
  int data;
  Node next;
  Node back;
  Node(int data){
    this.data = data;
    this.next = null;
    this.back = null;
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
  Node removeTail(Node head){
    if(head == null || head.next == null) return null;
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    Node prev = temp.back;
    temp.back = null;
    prev.next = null;
    return head;
  }
}
public class a8_remove_tail_Node {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    head = nd.removeTail(head);
    nd.traverse(head);
    sc.close();
  }
}
