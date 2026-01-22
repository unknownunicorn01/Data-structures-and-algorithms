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
    temp.next = head;
    return head;
  }
  void traverse(Node head){
    Node temp = head;
    do{
      System.out.print(temp.data + " ");
      temp = temp.next;
    }while(temp != head);
    System.out.println();
  }
  Node insertion(Node head,int k){
    Node val = new Node(k);
    if(head == null){
      head = val;
      head.next = head;
      return head;
    }
    Node temp = head;
    while(temp.next != head){
      temp = temp.next;
    }
    temp.next = val;
    val.next = head;
    return head;
  }
}
public class b2_insertion_at_end {
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
    head = nd.insertion(head,k);
    nd.traverse(head);
    sc.close();
  }
}
