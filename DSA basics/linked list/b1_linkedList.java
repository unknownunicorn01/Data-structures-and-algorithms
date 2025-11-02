class Node{
  int data;
  Node next;
  Node(int data){
  this.data = data;
  }
}
public class b1_linkedList {
  public static void main(String[] args){
    Node p = new Node(81);
    System.out.println(p); // print memory location
    System.out.println(p.data);  // output: 81 
    System.out.println(p.next);  // output: null because no node after 81
    Node q = new Node(1);  // we create a new object in defferent memory location 
    p.next = q; // we store the location of q in next to p not p become head node
    System.out.println(p.next.data);  // this is how we can access the node with head node
    System.out.println(q.data); // will print one 

  }  
}
