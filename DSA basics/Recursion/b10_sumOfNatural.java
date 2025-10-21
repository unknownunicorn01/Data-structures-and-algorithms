import java.util.*;
public class b10_sumOfNatural {
  public static int sum(int m){
    if(m == 1) return 1;
    return m + sum(m-1);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    System.out.println(sum(m));
    sc.close();
  }
}
