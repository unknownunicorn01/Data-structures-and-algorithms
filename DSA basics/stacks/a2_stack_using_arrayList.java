import java.util.*;
class StackArray{
  ArrayList<Integer> st;
  int top;
  StackArray(){
    this.st = new ArrayList<>();
    this.top = -1;
  }
  void push(int x){
    st.add(x);
    top++;
  }
  void pop(){
    if(top < 0) return;
    st.remove(top);
    top--;
  }
  void peek(){
    if(top >= 0){
      System.out.println(st.get(top));
    }
    return;
  }
  void isEmpte(){
    if(top == -1){
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }
  }
}
public class a2_stack_using_arrayList {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StackArray st = new StackArray();
    st.push(1);
    st.push(2);
    st.peek();
    st.pop();
    st.peek();
    st.isEmpte();
    sc.close();
  }
}
