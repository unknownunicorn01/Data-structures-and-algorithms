import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
class NodeStack{
  Node head;
  NodeStack(){
    this.head = null;
  }
  void push(int n){
    if(head == null){
      head = new Node(n);
      return;
    }
    Node temp = new Node(n);
    temp.next = head;
    head = temp;
    
  }
  void pop(){
    if(head == null){
      System.out.println("Stack is empty");
      return;
    }
    head = head.next;
  }
  void peek(){
    System.out.println(head.data);
  }
  Boolean isEmpty(){
    if(head == null) return true;
    return false;
  }
}
public class a4_stack_using_linkedList {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    NodeStack st = new NodeStack();
    st.push(10);
    st.push(20);
    st.push(30);
    st.peek();
    st.push(40);
    st.peek();
    st.pop();
    st.peek();
    st.pop();
    st.pop();
    st.pop();
    System.out.println(st.isEmpty());
    st.pop(); // will print that stack is empty
    sc.close();

  }
}
