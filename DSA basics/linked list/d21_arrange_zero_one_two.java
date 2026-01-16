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
      System.out.print(temp.data+ " ");
      temp = temp.next;
    }
    System.out.println();
  }
  Node arrange(Node head){
    Node temp = head;
    Node zero = new Node(0);
    Node one = new Node(1);
    Node two = new Node(2);
    Node temp0 = zero;
    Node temp1 = one;
    Node temp2 = two;
    while(temp != null){
      if(temp.data == 0 ){
        temp0.next = temp; 
        temp0 = temp0.next;
      }
      if(temp.data == 1 ){
        temp1.next = temp; 
        temp1 = temp1.next;
      }
      if(temp.data == 2 ){
        temp2.next = temp; 
        temp2 = temp2.next;
      }
      temp = temp.next;
    }
    temp0.next = (one != null) ? one.next : two.next;
    temp1.next = two.next;
    temp2.next = null;
    return zero.next;
  }
}
public class d21_arrange_zero_one_two {
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
    head = nd.arrange(head);
    nd.traverse(head);
    sc.close();
  }
}
