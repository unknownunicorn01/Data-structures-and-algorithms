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
      System.out.print(temp.data+ " ");
      temp = temp.next;
    }
    System.out.println();
  }
  int length(Node head){
    int n = 0;
    Node temp = head;
    while(temp != null){
      n++;
      temp = temp.next;
    }
    return n;
  }
  Node subtraction(Node h1,Node h2){
    int num1 = toNum(h1) - toNum(h2);
    num1 = Math.abs(num1);
    Node head = new Node(num1/10);
    Node temp = head;
    num1 = num1/10;
    while(num1 != 0){
      Node nn = new Node(num1/10);
      temp.next = nn;
      temp = nn;
      num1 /= 10;
    }
    return reverse(head);
  }
  int toNum(Node head){
    Node temp = head;
    int n = 0;
    while(temp != null){
      n = n*10 + temp.data;
    }
    return n;
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
public class d9_subtrace_node {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    
    // Node rev = nd.reverse(head);
    // nd.traverse(rev);
    sc.close();
  } 
}
