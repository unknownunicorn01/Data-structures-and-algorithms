import java.util.*;
public class b16_countSeven {
  public static int count(int n){
    if(n == 0 ) return 0;
    if(n%10 == 7) return 1 + count(n/10);
    return 0 + count(n/10);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(count(n));
    sc.close();
  }
}
