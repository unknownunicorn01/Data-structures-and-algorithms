import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class b6_find_Value {
  static Node convert(int[] arr){
    Node head = new Node(arr[0]);
    Node temp = head;
    for(int i=1;i<arr.length;i++)
    {
      Node nn = new Node(arr[i]);
      temp.next = nn;
      temp = nn;
    }
    return head;
  }
  public static Node find(Node head,int val){
    Node temp = head;
    while(temp != null){
      if(temp.data == val){
        return temp;
      }
      temp = temp.next;
    }
    return temp;
  }
  public static int findIdx(Node head, int val){
    Node temp = head;
    int count = 0;
    while(temp != null){
      if(temp.data == val){
        return count;
      }
      count ++;
      temp = temp.next;
    }
    return count;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {11,22,33,44,55};
    Node head = convert(arr);
    int n = sc.nextInt();
    Node info = find(head,n);
    int idx = findIdx(head,n);
    System.out.println("Index of "+n+": "+idx);
    System.out.println("Memory location: "+info);
    sc.close();
  }
}
