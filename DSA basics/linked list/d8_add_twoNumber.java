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
  Node add(Node h1,Node h2){
    Node t1 = reverse(h1);
    Node t2 = reverse(h2);
    int carry = 0;
    int val =0;
    Node res = new Node(0);
    Node temp = res;
    while(t1 != null || t2 != null){
      val = 0;
      if(t1 != null){
        val += t1.data;
        t1 = t1.next;
      }
      if(t2 != null){
        val += t2.data;
        t2 = t2.next;
      }
      val += carry;
      Node nn = new Node(val%10);
      temp.next = nn;
      temp = nn;
      carry = val/10;
    }
    if(carry != 0){
      Node nn = new Node(carry);
      temp.next = nn;
      temp = nn;
    }
    res = res.next;
    return reverse(res);
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
}


public class d8_add_twoNumber {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    NodeFunc nd = new NodeFunc();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Node h1 = nd.convert(arr);
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0;i<n2;i++){
      arr2[i] = sc.nextInt();
    }
    Node h2 = nd.convert(arr2);
    // nd.traverse(head);
    Node rev = nd.add(h1,h2);
    nd.traverse(rev);
    sc.close();

  }
}
