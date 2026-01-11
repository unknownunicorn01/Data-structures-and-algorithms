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
  String palendrome(Node head){
    Node temp = head;
    Node temp2 = reverse(temp);
    while(temp != null){
      if(temp.data != temp2.data){
        return "NO";
      }
      temp = temp.next;
      temp2 = temp2.next;
    }
    return "YES";
  }
}
public class d10_palendrome {
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
    System.out.println(nd.palendrome(head));
    sc.close();
  }
}
