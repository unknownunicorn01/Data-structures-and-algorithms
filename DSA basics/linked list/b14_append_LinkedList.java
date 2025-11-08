import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class b14_append_LinkedList
 {
  static Node convert(int[] arr){
    Node head = new Node(arr[0]);
    Node temp = head;
    for(int i=1;i<arr.length;i++){
      Node nn = new Node(arr[i]);
      temp.next = nn;
      temp = nn;
    }
    return head;
  }
  static void traverse(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  static Node append(Node head,int val){
    Node nn = new Node(val);
    if(head == null){
      return nn;
    }
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = nn;
    return head;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,4,5};
    Node head = convert(arr);
    traverse(head);
    System.out.print("enter the value: ");
    int val = sc.nextInt();
    head = append(head,val);
    traverse(head);
    sc.close();
  }
}
