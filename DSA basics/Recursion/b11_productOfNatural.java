import java.util.*;
public class b11_productOfNatural {
  public static long product(long n){
    if(n == 1) return 1;
    return n*product(n-1);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    System.out.println(product(n));
    sc.close();
  }
}
