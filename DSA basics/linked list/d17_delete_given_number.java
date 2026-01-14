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
  Node deleteValue(Node head,int n){
    if(head == null) return null;
    if(head.data == n) return head.next;
    Node temp = head;
    while(temp != null){
      if(temp.next.data == n){
        temp.next = temp.next.next;
        return head;
      }
      temp = temp.next;
    }
    return head;
  }
}
public class d17_delete_given_number {
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
    // System.out.println("enter the number you want to delete");
    int num = sc.nextInt();
    head = nd.deleteValue(head, num);
    nd.traverse(head);
    sc.close();
  }
}
