class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}

public class b2_linkedList {
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
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    Node val = convert(arr);
    System.out.println(val.data);
    System.out.println(val.next.data);
    System.out.println(val.next.next.data);
    
  }
}
