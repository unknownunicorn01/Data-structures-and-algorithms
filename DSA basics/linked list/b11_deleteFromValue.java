import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class b11_deleteFromValue {
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
  public static Node deleteVal(Node head,int n){
    if(head == null){
      return null;
    }
    if(head.data == n){
      head = head.next;
      return head;
    }
    Node temp = head;
    Node prep = null;
    while(temp != null && temp.data != n){
      prep = temp;
      temp = temp.next;
    }
    if(temp == null){
      return head;
    }
    prep.next = prep.next.next;
    return head;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,4,5};
    Node head = convert(arr);
    traverse(head);
    System.out.print("enter the number: ");
    int num = sc.nextInt();
    head = deleteVal(head,num);
    traverse(head);
    // head = head.next;
    // System.out.println("head: "+head.data+" and number: "+num);
    sc.close();
  }
}
