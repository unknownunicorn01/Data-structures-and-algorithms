import java.util.*;
public class b4_increase_decrease {
  public static void decrease(int n){
    if(n == 0) return;
    System.out.println(n);
    decrease(n-1);
  }
  public static void increase(int n){
    if(n == 0) return;
    increase(n-1);
    System.out.println(n);
  }
  public static void patern(int n){
    decrease(n);
    increase(n);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    patern(n);
    sc.close();
  }
}
