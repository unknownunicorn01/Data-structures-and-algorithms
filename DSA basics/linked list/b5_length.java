class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class b5_length {
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
  static void traverse(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println(); // for printing next line after traverse
  }
  public static int countNodeLength(Node head){
    Node temp = head;
    int count = 0;
    while(temp != null){
      count++;
      temp = temp.next;
    }
    return count;
  }
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    Node head = convert(arr);
    traverse(head);
    int count = countNodeLength(head);
    System.out.println("Length: "+count);
  }
}
