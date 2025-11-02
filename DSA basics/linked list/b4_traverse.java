class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class b4_traverse {
  static Node convert(int[] arr){
      Node head = new Node(arr[0]);
      Node temp = head;
      for(int i= 1;i<arr.length;i++){
        Node nn = new Node(arr[i]);
        temp.next = nn;
        temp = temp.next;
      }
      return head;
    }
    public static void traverce(Node head){
      Node temp = head;
      while(temp != null){
        System.out.print(temp.data+" ");
        temp = temp.next;
      }
    }
    public static void main(String[] args){
      int[] arr = {1,2,3,4,5};
      Node head = convert(arr);
      traverce(head);
  }
}
