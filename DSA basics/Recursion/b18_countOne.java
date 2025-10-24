import java.util.*;
public class b18_countOne {
  public static int ones(int n){
    if(n == 0) return 0;
    if( n % 10 == 1) return 1 + ones(n/10);
    return 0 + ones(n/10);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(ones(n));
    sc.close();
  }
}
