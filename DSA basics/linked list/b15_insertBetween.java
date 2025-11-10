import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class b15_insertBetween {
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
  public static Node insertVal(Node head,int idx,int k){
    Node nn = new Node(k);
    if(head == null){
      return null;
    }
    if(idx == 1){
      nn.next = head;
      return nn;
    }
    int c = 1;
    Node temp = head;
    while(temp != null && c < idx - 1){
      temp = temp.next;
      c++;
    }
    if(temp == null){
      return head;
    }
    nn.next = temp.next;
    temp.next = nn;
    return head;

  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[] = {1,2,3,4,5};
    Node head = convert(arr);
    traverse(head);
    System.out.print("Enter the index: ");
    int idx = sc.nextInt();
    System.out.print("Enter the value: ");
    int val = sc.nextInt();
    head = insertVal(head,idx,val);
    traverse(head);
    sc.close();
  }
}
