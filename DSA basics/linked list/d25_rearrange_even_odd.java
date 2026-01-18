import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
class NodeFunc{
  Node convert(int n){
    Scanner sc = new Scanner(System.in);
    Node head = new Node(sc.nextInt());
    Node temp = head;
    while(n-- > 1){
      temp.next = new Node(sc.nextInt());
      temp = temp.next;
    }
    sc.close();
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
  Node partition(Node head){
    Node even = new Node(0);
    Node odd = new Node(0);
    Node temp2 = even;
    Node temp1 = odd;
    Node crr = head;
    while(crr != null){
      if(crr.data%2 == 0){
        temp2.next = crr;
        temp2 = temp2.next;
      }
      else{
        temp1.next = crr;
        temp1 = temp1.next;
      }
      crr = crr.next;
    }
    temp1.next = null;
    temp2.next = odd.next;
    return even.next;
  }
}
public class d25_rearrange_even_odd {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(n);
    head = nd.partition(head);
    nd.traverse(head);
    sc.close();
  }
}
