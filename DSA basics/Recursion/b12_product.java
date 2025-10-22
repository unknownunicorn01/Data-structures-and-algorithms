import java.util.*;

//doing multiplication using recursion
public class b12_product {
  public static int product(int a,int b){
    return funA(a)*funB(b);
  }
  public static int funA(int a){
    return a;
  }
  public static int funB(int b){
    return b;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(product(a,b));
    sc.close();
  }
}
