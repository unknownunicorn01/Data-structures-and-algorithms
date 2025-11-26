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
  Node deleteNode(Node head,int num){
    if(head == null){
      return null;
    }
    
    Node temp = head;
    if(head.data == num){
      return temp.next;
    }
    while(temp != null && temp.next.data != num){
      temp = temp.next;
    }
    if(temp == null){
      System.out.println("invalid number");
      return head;
    }
    temp.next = temp.next.next;
    return head;
  }
}
public class d5_problem {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int num = sc.nextInt();
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    nd.traverse(head);
    head = nd.deleteNode(head, num);
    nd.traverse(head);
    sc.close();
  }
}
