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
      temp.next = new Node(arr[i]);
      temp = temp.next;
    }
    temp.next = head;
    return head;
  }
  void traverse(Node head){
    if(head == null) return;
    Node temp = head;
    do{
      System.out.print(temp.data+" ");
      temp = temp.next;
    }while(temp != head);
    System.out.println();
  }
  Node deleteTail(Node head){
    if(head == null || head.next == head) return null;
    if(head.next.next == head){
      head.next = head;
      return head;
    }
    Node temp = head;
    while(temp.next.next != head){
      temp = temp.next;
    }
    temp.next = head;
    return head;
  }
}
public class b3_delete_end_node {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    head = nd.deleteTail(head);
    nd.traverse(head);
    sc.close();
  }
}
