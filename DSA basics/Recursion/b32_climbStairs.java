import java.util.*;
public class b32_climbStairs {
  public static void stairs(int n,String str){
    if(n == 0){
      System.out.println(str);
      return;
    }
    if(n-1 >= 0) stairs(n-1,str+"1");
    if(n-2 >= 0) stairs(n-2,str+"2");
    if(n-3 >= 0) stairs(n-3,str+"3");
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    stairs(n,"");
    sc.close();
  }
}
