class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class b7_deleteHead {
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
  public static Node deleteHead(Node head){
    if(head == null){
      return null;
    }
    head = head.next;
    return head;
  }
  public static void main(String[] args){
    int[] arr = {8,7,5,2,4};
    Node head = convert(arr);
    System.out.println(head.data);
    head  = deleteHead(head);
    System.out.println(head.data);
  }
}
