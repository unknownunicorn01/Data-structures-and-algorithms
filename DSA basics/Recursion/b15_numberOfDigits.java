import java.util.*;
public class b15_numberOfDigits {
  public static int number(int n){
    if(n == 0) return 0;
    return 1 + number(n/10);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(number(n));
    sc.close();
  }
}
