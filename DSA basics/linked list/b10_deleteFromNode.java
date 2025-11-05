import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class b10_deleteFromNode {
  static Node convert(int[] arr){
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
    while(temp!= null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  public static Node deleteIdx(Node head,int n){
    if(head == null){
      return head;
    }
    if(n == 1){
      head = head.next;
      return head;
    }
    Node temp = head;
    Node prep = null;
    int c = 1;
    while(c != n){
      prep = temp;
      temp = temp.next;
      c++;
    }
    prep.next = prep.next.next;
    return head;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,4,5};
    Node head = convert(arr);
    traverse(head);
    System.out.print("enter the index: ");
    int num = sc.nextInt();
    head = deleteIdx(head,num);
    traverse(head);
    sc.close();
  }
}