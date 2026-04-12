import java.util.*;
class StackArrays{
  int[] arr;
  int top;
  StackArrays(int x){
    this.arr = new int[x];
    this.top = -1;
  }
  void push(int n){
    if(top == arr.length){
      System.out.println("top size reached");
      return;
    }
    top++;
    arr[top] = n;
  }
  void pop(){
    if(top == -1){
      System.out.println("stack is empty");
      return;
    }
    arr[top] = 0;
    top--;
  }
  void peek(){
    if(top == -1){
      System.out.println("stack is empty");
      return;
    }
    System.out.println(arr[top]);
  }
  Boolean isEmpty(){
    if(top == -1) return true;
    return false;
  }
}
public class a3_stack_using_array {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    StackArrays st = new StackArrays(n);
    st.push(3);
    st.push(4);
    st.push(5);
    st.peek();
    st.pop();
    st.peek();
    System.out.println(st.isEmpty());
    sc.close();
  }
}
