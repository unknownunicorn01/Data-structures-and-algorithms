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
      System.out.print(temp.data +" ");
      temp = temp.next;
    }
    System.out.println();
  }
  Node partition(Node head,int n){
    if(head == null || head.next == null) return head;
    Node dummy = new Node(0);
    dummy.next = head;
    Node temp = dummy;
    Node sml = new Node(0);
    Node small = sml;
    while(temp.next != null){
      if(temp.next.data < n){
        small.next = temp.next;
        small = small.next;
        temp.next = temp.next.next;
      }
      else{
        temp = temp.next;
      }
    }
    small.next = dummy.next;
    return sml.next;
  }
}
public class d23_partition {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int num = sc.nextInt();
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    // nd.traverse(head);
    head = nd.partition(head, num);
    nd.traverse(head);
    sc.close();
  }
}
