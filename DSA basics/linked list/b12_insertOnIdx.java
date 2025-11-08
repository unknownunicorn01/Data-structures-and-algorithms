import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class b12_insertOnIdx {
  public static Node convert(int[] arr){
    Node head = new Node(arr[0]);
    Node temp = head;
    for(int i=1;i<arr.length; i++){
      Node nn = new Node(arr[i]);
      temp.next = nn;
      temp = nn;
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
  public static Node InsertIdx(Node head,int idx,int k){
    Node nn = new Node(k);
    if(head == null){
      return nn;
    }
    if(idx == 1){
      nn.next = head;
      return nn;
    }
    
    Node temp = head;
    int c = 1;
    while(c < idx -1  && temp != null){
      temp = temp.next;
      c++;
    }
    if(temp == null){
      return null;
    }
    nn.next = temp.next.next;
    temp.next = nn;
    // nn.next = temp.next.next;
    return head;

  }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int[] arr = new int[num];
      for(int i=0;i<num;i++){
        arr[i] = sc.nextInt();
      }
      Node head = convert(arr);
      System.out.println("enter the index: ");
      int idx = sc.nextInt();
      System.out.println("enter the value: ");
      int val = sc.nextInt();
      head = InsertIdx(head,idx,val);
      traverse(head);
      sc.close();
  }
}
