import java.util.*;
class Node{
  Node next;
  int data;
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
  Node removeDuplicate(Node head){
    if(head == null) return null;
    // if(head.data == head.next.data && head.next.next == null) return head.next;
    Node temp = head;
    while(temp.next != null){
      if(temp.data == temp.next.data) temp.next = temp.next.next;
      else{
        temp = temp.next;
      }
    }
    return head;
  }
}
public class d19_remove_duplicate_sortedlist {
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
    head = nd.removeDuplicate(head);
    nd.traverse(head);
    sc.close();
  }
}
