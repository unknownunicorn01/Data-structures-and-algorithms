import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){ // constructor
    this.data = data;  // accessing data in class by this keyword
  }
}
public class d1_problem {
  //converting into linked list
  static Node convertNode(int[] arr){
    Node head = new Node(arr[0]);
    Node temp = head;
    for(int i=1;i<arr.length;i++){
      Node nn = new Node(arr[i]);
      temp.next = nn;
      temp = nn;
    }
    return head;
  }
  public static void traverseReverse(Node head){
    Node temp = head;
    if(temp == null) return;
    traverseReverse(temp.next);
    System.out.print(temp .data+" ");
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Node head = convertNode(arr);
    traverseReverse(head);
    sc.close();
  }
}
