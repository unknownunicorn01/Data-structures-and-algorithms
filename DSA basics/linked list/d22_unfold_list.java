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
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  Node reverse(Node head){
    Node temp = head;
    Node prev = null;
    while(temp != null){
      Node nn = temp.next;
      temp.next = prev;
      prev = temp;
      temp = nn;
    }
    return prev;
  }
  Node unfoldNode(Node head){
    if(head == null || head.next == null) return head;
    Node h1 = head;
    Node h2 = head.next;
    Node t1 = h1;
    Node t2 = h2;
    while(t2 != null && t2.next != null){
      t1.next = t2.next;
      t1 = t1.next;
      t2.next = t1.next;
      t2 = t2.next;
    }
    t1.next = null;
    h2 = reverse(h2);
    t1.next = h2;
    return h1;
  }
}
public class d22_unfold_list {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    head = nd.unfoldNode(head);
    nd.traverse(head);
    sc.close();
  }
}
