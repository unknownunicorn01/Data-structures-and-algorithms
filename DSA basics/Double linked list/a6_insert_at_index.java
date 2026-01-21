import java.util.*;
class Node{
  int data;
  Node next;
  Node back;
  Node(int data){
    this.data = data;
    this.next = null;
    this.back = null;
  }
  Node(int data,Node ahead,Node behind){
    this.data = data;
    this.next = ahead;
    this.back = behind;
  }
}
class NodeFunc{
  Node convert(int[] arr){
    Node head = new Node(arr[0]);
    Node temp = head;
    for(int i=1;i<arr.length;i++){
      Node crr = new Node(arr[i]);
      temp.next = crr;
      crr.back = temp;
      temp = crr;
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
  Node prepend(Node head,int k){
    Node val = new Node(k);
    if(head == null) return val;
    val.next = head;
    head.back = val;
    return val;
  }
  Node insert(Node head,int num,int k){
    if(head == null) return head;
    if(k == 1){
      return prepend(head,num);
    }
    Node val = new Node(num);
    Node temp = head;
    for(int i=0;i<k-1;i++){
      if(temp == null) return head;
      temp = temp.next;
    }
    Node prev = temp.back;
    val.next = temp;
    prev.next = val;
    temp.back = val;
    val.back = prev;
    return head;
  }
}
public class a6_insert_at_index {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int val = sc.nextInt();
    int k = sc.nextInt();
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    head = nd.insert(head,val,k);
    nd.traverse(head);
    sc.close();
  }
}
