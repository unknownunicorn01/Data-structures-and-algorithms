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
  Node Zero(Node head){
    if(head == null || head.next == null) return head;
    Node one = new Node(1);
    Node zero = new Node(0);
    Node temp0 = zero;
    Node temp1 = one;
    Node crr = head;
    while(crr != null){
      if(crr.data == 0){
        temp0.next = crr;
        temp0 = temp0.next;
      }
      else{
        temp1.next = crr;
        temp1 = temp1.next;
      }
      crr = crr.next;
    }
    temp1.next = null;
    temp0.next = one.next;
    return zero.next;
  }
}
public class d24_sort_zero_one{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    // nd.traverse(head);
    head = nd.Zero(head);
    nd.traverse(head);
    sc.close();
  }
}