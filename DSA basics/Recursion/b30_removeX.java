import java.util.*;
public class b30_removeX {
  public static void removeX(String str){
    int n = str.length();
    helper(str,n);
  }
  public static void helper(String str,int n){
    if(n == 0) return;
    helper(str,n-1);
    if(str.charAt(n-1) != 'x'){
      System.out.print(str.charAt(n-1));
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    removeX(str);
    sc.close();
  }
}
