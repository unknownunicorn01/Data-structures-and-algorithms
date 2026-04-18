import java.util.*;
class Solution{
  Boolean Parenthesis(int n,String s){
    if(s.charAt(0) == ')') return false;
    if(s.charAt(n-1) == '(') return false;
    Stack<Character> left = new Stack<>();
    Stack<Character> star =  new Stack<>();
    for(int i=0;i<n;i++){
      if(s.charAt(i) == '(') left.push('(');
      if(s.charAt(i) == '*') star.push('*');
      if(s.charAt(i) == ')') {
        if(left.isEmpty() && star.isEmpty()){
          return false;
        }
        if(!left.isEmpty()) {
          left.pop();
        }
        else {
          star.pop();
        }
      }
    }
    while(!left.isEmpty()){
      if(star.isEmpty()) return false;
      left.pop();
      star.pop();
    }
    return true;
  }
}
public class b2_valid_breaket {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    Solution s = new Solution();
    Boolean correct = s.Parenthesis(n,str);
    System.out.println(correct);
    sc.close();
  }
}
