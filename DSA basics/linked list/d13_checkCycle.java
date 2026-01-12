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
    for(int i=1;i<arr.length;i++){
      Node nn = new Node(arr[i]);
      temp.next = nn;
      temp = nn;
      if(i == arr.length -1 && n != 0){
        Node temp2 = head;
        while(n > 0){
          n--;
          temp2 = temp2.next;
        }
        nn.next = temp2;
      }
    }
    return head;
  }
  void traverse(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+ " ");
      temp = temp.next;
    }
    System.out.println();
  }
  int length(Node head){
    Node temp = head;
    int len = 0 ;
    while(temp != null){
      temp = temp.next;
      len++;
    }
    return len;
  }
  int check(Node head){
    if(head == null) return 0;
    Node fast = head;
    Node slow = head;
    while(fast != null && fast.next != null){
      fast = fast.next.next;
      slow = slow.next;
      if(slow == fast){
        return 1;
      }
    }
    return 0;
  }
}
public class d13_checkCycle {
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
    // nd.traverse(head);
    int check = nd.check(head);
    System.out.println(check);
    sc.close(); 
  }
}
