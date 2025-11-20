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
      temp  = nn;
    }
    return head;
  }
  void traverse(Node head){
    Node temp = head;
    while(temp !=null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  Node insert(Node head,int idx,int n){
    if(head == null){
      return null;
    }
    Node nn = new Node(n);
    if(idx == 0){
      nn.next = head;
      return nn;
    }
    Node temp = head;
    int c = 0;
    while(c<idx -1 && temp != null){
      temp = temp.next;
      c++;
    }
    if(temp == null){
      System.out.println("invalid index");
      return head;
    }
    nn.next = temp.next;
    temp.next = nn;
    return head;
  }
}
public class d3_problem {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    NodeFunc nd = new NodeFunc();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Node head = nd.convert(arr);
    nd.traverse(head);
    System.out.println("Enter the number: ");
    int val = sc.nextInt();
    System.out.println("Enter the index: ");
    int idx = sc.nextInt();
    head = nd.insert(head,idx,val);
    nd.traverse(head);
    sc.close();

  }
}
