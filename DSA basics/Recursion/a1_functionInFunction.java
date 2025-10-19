import java.util.*;
public class a1_functionInFunction{
  public static void fun(String str){
    System.out.println(str);
    System.out.println(lengthFun(str));  //here we call another funciton in one function 
  }
  public static int lengthFun(String str){
    return str.length();
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you name");
    String str = sc.nextLine();
    fun(str);
    sc.close();
  }
}