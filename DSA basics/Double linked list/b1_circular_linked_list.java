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
    Node temp = head;
    do{
      System.out.print(temp.data+ " ");
      temp = temp.next;
    }
    while(temp != head);
    System.out.println();
  }
}
public class b1_circular_linked_list {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    nd.traverse(head);
    sc.close();
  }
}
