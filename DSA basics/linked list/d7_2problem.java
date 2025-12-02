import java.util.*;
class Node {
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
  Node mergeSort(Node h1, Node h2) {
    Node dummy = new Node(-1);
    Node tail = dummy;

    while (h1 != null && h2 != null) {
        if (h1.data <= h2.data) {
            tail.next = h1;
            h1 = h1.next;
        } else {
            tail.next = h2;
            h2 = h2.next;
        }
        tail = tail.next;
    }

    if (h1 != null) tail.next = h1;
    else tail.next = h2;

    return dummy.next;
}
}
public class d7_2problem {
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
    for(int i=0;i<n;i++){
      arr2[i] = sc.nextInt();
    }
    Node head2 = nd.convert(arr2);
    Node head3 = nd.mergeSort(head,head2);
    nd.traverse(head3);
    sc.close();
  }
}
