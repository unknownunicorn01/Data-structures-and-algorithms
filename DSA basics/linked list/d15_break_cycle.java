import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
class NodeFunc{
  Node convert(int[] arr,int n){
    Node head = new Node(arr[0]);
    Node temp = head;
    Node crr = null;
    if(n == 1){
      crr = head;
    }
    for(int i=1;i<arr.length;i++){
      Node nn = new Node(arr[i]);
      temp.next = nn;
      temp = nn;
      if(n == i){
        crr = nn;
      }
    }
    temp.next = crr;
    return head;
  }
  void traverse(Node head){
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data+ " ");
      temp = temp.next;
    }
    System.out.println();
  }
  Node check(Node head){
    if(head == null) return null;
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
      fast = fast.next.next;
      slow = slow.next;
      if(fast == slow){
        fast = head;
        while(fast != slow){
          if(fast.next == slow.next){
            slow.next = null;
            return head;
          }
          fast = fast.next;
          slow = slow.next;
        }
      }
    }
    return head;
  }
}
public class d15_break_cycle {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int pos = sc.nextInt();
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr,pos);
    head = nd.check(head);
    nd.traverse(head);
    sc.close();
  }
}
