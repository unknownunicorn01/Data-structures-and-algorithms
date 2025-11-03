class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class b8_deleteTail {
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
  static void traverse(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+" " );
      temp = temp.next;
    }
    System.out.println();
  }
  static Node deleteTail(Node head){
    if(head == null || head.next == null){
      return null;
    }
    Node temp = head;
    while(temp.next.next != null){
      temp = temp.next;
    }
    temp.next = null;
    return head;
  }
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    Node head = convert(arr);
    traverse(head);
    deleteTail(head);
    traverse(head); // print linked list after deletion of last index
  }
}
