import java.util.*;
class Node{
  Node next;
  Node back;
  int data;
  Node(int data){
    this.data = data;
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
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  Node insert(Node head,int k){
    Node val = new Node(k);
    if(head == null) return null;
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    Node prev = temp.back;
    val.next = temp;
    prev.next = val;
    val.back = prev;
    temp.back = val;
    return head;
  }
}

public class a5_insert_before_tail {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    head = nd.insert(head, k);
    nd.traverse(head);
    sc.close();
  }
}
