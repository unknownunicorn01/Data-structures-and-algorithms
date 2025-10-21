import java.util.*;
public class b9_powerCalculate {
  public static long power(long a,long b){
    if(b == 0) return 1;
    return a*power(a,b-1);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    System.out.println(power(a,b));
    sc.close();
  }
}
