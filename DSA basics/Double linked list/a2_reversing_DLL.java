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
    this.back = behind;
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
      System.out.print(temp.data+ " ");
      temp = temp.next;
    }
    System.out.println();
  }
  void reverse(Node head){
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    while(temp != null){
      System.out.print(temp.data+ " ");
      temp = temp.back;
    }
  }
}
public class a2_reversing_DLL {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    nd.reverse(head);
    sc.close();
  }
}
