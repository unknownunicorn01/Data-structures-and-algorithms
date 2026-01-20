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
  Node(int data,Node ahead,Node behind){
    this.data = data;
    this.next = ahead;
    this.next = behind;
  }
}
class NodeFunc{
  Node convert(int[] arr){
    Node head= new Node(arr[0]);
    Node temp = head;
    for(int i=1;i<arr.length;i++){
      Node crr = new Node(arr[i]);
      temp.next = crr;
      crr.back = temp;
      temp = crr;
    }
    return head;
  }
  Node append(Node head , int k){
    Node temp = new Node(k);
    if(head == null){
      return temp;
    }
    temp.next = head;
    head.back = temp;
    head = temp;
    return head;
  }
  void traverse(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }
}
public class a3_insertion_at_head {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    int k = sc.nextInt();
    head = nd.append(head,k);
    nd.traverse(head);
    sc.close();
  }
}
