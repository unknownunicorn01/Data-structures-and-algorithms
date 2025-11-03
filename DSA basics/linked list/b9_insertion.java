import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class b9_insertion {
  public static Node convert(int[] arr){
    Node head = new Node(arr[0]);
    Node temp = head;
    for(int i=1;i<arr.length;i++){
      Node nn = new Node(arr[i]);
      temp.next = nn;
      temp = temp.next;
    }
    return head;
  }
  public static void traverse(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  public static Node insertNode(Node head,int num){
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    Node p  = new Node(num);
    temp.next = p;
    return head;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,4,5};
    Node head = convert(arr);
    traverse(head);
    System.out.println("done");
    System.out.println("Enter the number you want to insert: ");
    int num = sc.nextInt();
    insertNode(head,num);
    traverse(head);
    sc.close();
  }
}
