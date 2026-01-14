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
  Node reverse(Node head){
    if(head == null){
      return head;
    }
    System.out.print(head.data+" ");
    return reverse(head.next);
  }

}
public class b18reverse_linked_ByRecursion {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    NodeFunc nd = new NodeFunc();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Node head = nd.convert(arr);
    Node h1 = nd.reverse(head);
    // nd.traverse(head);
    // nd.traverse(h1);
    sc.close();
  }
}
