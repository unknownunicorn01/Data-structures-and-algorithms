import java.util.*;

public class b1_recursion {
  public static void Recursion(int n){
    if(n == 0) return;
    Recursion(n-1);
    System.out.println("ACCIOJOB");
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Recursion(n);
    sc.close();
  }  
}
