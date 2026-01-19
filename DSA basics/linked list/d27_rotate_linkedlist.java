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
  int length(Node head){
    Node temp = head;
    int n = 0;
    while(temp != null){
      n++;
      temp = temp.next;
    }
    return n;
  }
  Node rotateNode(Node head,int k){
    if(head == null || head.next == null) return head;
    int len = length(head);
    k = k%len;
    if(k == 0) return head;
    Node dummy = new Node(0);
    dummy.next = head;
    Node fast = head;
    Node slow = dummy;
    while(k-- > 0){
      if(fast == null) fast = head;
      fast = fast.next;
    }
    while(fast != null){
      fast = fast.next;
      slow = slow.next;
    }
    Node nn = slow.next;
    slow.next = null;
    Node temp = nn;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = dummy.next;
    return nn;
  }
}

public class d27_rotate_linkedlist {
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
    head = nd.rotateNode(head,k);
    nd.traverse(head);
    sc.close();
  }
}
