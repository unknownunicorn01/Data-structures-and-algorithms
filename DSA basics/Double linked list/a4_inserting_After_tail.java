import java.util.*;
class NodeFunc{
  Node convert(int[] arr){
    Node head = new Node(arr[0]);
    Node temp = head;
    for(int i=1;i<arr.length;i++){
      Node crr = new Node(arr[i]);
      temp.next = crr;
      crr.back = temp;
      temp = crr;
    }
    return head;
  }
  void traverse(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }
  Node append(Node head,int k){
    Node temp = new Node(k);
    if(head == null) return temp;
    Node tail = head;
    while(tail.next != null){
      tail = tail.next;
    }
    tail.next = temp;
    temp.back = tail;
    return head;
  }
}
public class a4_inserting_After_tail {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    NodeFunc nd = new NodeFunc();
    Node head = nd.convert(arr);
    head = nd.append(head,k);
    nd.traverse(head);
    sc.close();
  }
}
