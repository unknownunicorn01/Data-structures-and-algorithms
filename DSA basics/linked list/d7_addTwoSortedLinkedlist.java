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
  Node margeNode(Node h1,Node h2){
    Node head = new Node(h1.data);
    Node temp = head;
    Node t1 = h1;
    while(t1.next != null){
      t1 = t1.next;
      Node nn = new Node(t1.data);
      temp.next = nn;
      temp = nn;
    }
    temp.next = h2;
    return head;
  }
  Node margeSort(Node h1, Node h2){
    Node head = margeNode(h1,h2);
    Node temp1 = head;
    Node temp2 = head;
    while(temp1 != null){
      temp2 = head;
      while(temp2 != null){
        if(temp1.data <= temp2.data){
          int temp = temp1.data;
          temp1.data = temp2.data;
          temp2.data = temp;
        }
        temp2 = temp2.next;
      }
      temp1 = temp1.next;
    }
    return head;
  }
}
public class d7_addTwoSortedLinkedlist {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    NodeFunc nd = new NodeFunc();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Node head = nd.convert(arr);
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0;i<n2;i++){
      arr2[i] = sc.nextInt();
    }
    Node head2 = nd.convert(arr2);
    Node head3 = nd.margeSort(head, head2);
    nd.traverse(head3);
    // Node head3 = nd.margeNode(head,head2);
    // nd.traverse(head3);
    sc.close();
  }
}
