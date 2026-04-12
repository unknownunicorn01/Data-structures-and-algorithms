import java.util.*;
public class a1_stack_push_pop{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<n;i++){
      st.push(sc.nextInt());
    }
    System.out.println("Top element is: "+st.peek());
    System.out.println("Size of stack is: "+st.size());
    System.out.println("is stack empty: "+st.isEmpty());
    while(!st.isEmpty()){
      st.pop();
    }
    System.out.println("now after empty stack");
    System.out.println("Now is the stack empty: "+st.isEmpty());
    sc.close();
  }
}