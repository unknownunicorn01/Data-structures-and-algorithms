import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class b13_pepend_LinkedList {
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
  static Node prependNode(Node head,int val){
    Node nn = new Node(val);
    nn.next = head;
    return nn;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,4,5};
    Node head = convert(arr);
    traverse(head);
    System.out.print("enter the value: ");
    int val = sc.nextInt();
    head = prependNode(head, val);
    traverse(head);
    sc.close();

  }
}
