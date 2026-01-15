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
  Node removeNumber(Node head){
    Node dummy = new Node(0);
    dummy.next = head;
    Node temp = dummy;
    Node crr = head;
    while(crr != null){
      if(crr.next != null && crr.data == crr.next.data){
        while(crr.next != null && crr.data == crr.next.data){
          crr.next = crr.next.next;
        }
        temp.next = crr.next;
      }
      else{
        temp = temp.next;
      }
      crr = crr.next;
    }
    return dummy.next;
  }
}
public class d20_remove_duplicate_number {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    NodeFunc nd = new NodeFunc();
    Node head =nd.convert(arr);
    // nd.traverse(head);
    head = nd.removeNumber(head);
    nd.traverse(head);
    sc.close();
  }
}
