import java.util.*;
public class b10_deleteFromNode_2 {
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
  public static void traverse(Node head){
    Node temp = head;
    while(temp!= null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  public static Node deleteIdx(Node head,int k){
    if(head == null){
      return head;
    }
    if(k == 1){
      head = head.next;
      return head;
    }
    Node temp = head;
    for(int i=1;i<k-1;i++){
      temp = temp.next;
    }
    temp.next = temp.next.next;
    return head;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,4,5};
    Node head = convert(arr);
    traverse(head);
    System.out.print("enter the index: ");
    int num = sc.nextInt();
    head = deleteIdx(head,num);
    traverse(head);
    sc.close();
  }
}
