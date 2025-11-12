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
      Node nn = new Node(arr[i]);
      temp.next = nn;
      temp = nn;
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
  Node marge(Node h1,Node h2){
    Node temp = h1;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = h2;
    return h1;
  }
}
public class b16_margingLinkedList{
  public static void main(String[] args){
    NodeFunc nd = new NodeFunc();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Node h1 = nd.convert(arr);
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0;i<n2;i++){
      arr2[i] = sc.nextInt();
    }
    Node h2 = nd.convert(arr2);
    Node head = nd.marge(h1, h2);
    nd.traverse(head);
    System.out.print("h1 = ");
    nd.traverse(h1);
    System.out.print("h1 = ");
    nd.traverse(h2);
    sc.close();
  }
}