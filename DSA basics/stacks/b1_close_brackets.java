import java.util.*;
class Solution{
  String Brackets(String s, int n){
    // if(n%2 == 1) return "NO";
    Stack<Character> st = new Stack<>();
    for(int i=0;i<n;i++){
      if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
        st.push(s.charAt(i));
      }
      else{
        if(st.isEmpty()) return "NO";
        char ch1 = st.peek();
        char ch2 = s.charAt(i);
        if(ch1 == '(' && ch2 != ')') return "NO";
        if(ch1 == '{' && ch2 != '}') return "NO";
        if(ch1 == '[' && ch2 != ']') return "NO";
        st.pop();
      }
    }
    if(!st.isEmpty()) return "NO";
    return "YES";
  }
}
public class b1_close_brackets {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();
    sc.nextLine();
    String st = sc.nextLine();
    Solution s = new Solution();
    String res = s.Brackets(st,n);
    System.out.println(res);
    sc.close();
  }
}
