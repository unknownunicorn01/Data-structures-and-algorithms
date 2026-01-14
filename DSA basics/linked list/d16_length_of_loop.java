import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
class NodeFunc{
  Node convert(int[] arr,int n){
    Node head = new Node(arr[0]);
    Node temp = head;
    Node crr = null;
    if(n == 1) crr = head;
    for(int i=0;i<arr.length;i++){
      Node nn = new Node(arr[i]);
      temp.next = nn;
      temp = nn;
      if(n == i+1){
        crr = nn;
      }
    }
    temp.next = crr;
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
  int countLoop(Node head){
    if(head == null) return 0;
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
      fast = fast.next.next;
      slow = slow.next;
      if(fast == slow){
        int num = 1;
        slow = slow.next;
        while(fast != slow){
          slow = slow.next;
          num++;
        }
        return num;
      }
    }
    return 0;
  }
}
public class d16_length_of_loop {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int pos = sc.nextInt();
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr,pos);
    int num = nd.countLoop(head);
    // nd.traverse(head);
    System.out.println(num);
    sc.close();
  } 
}
