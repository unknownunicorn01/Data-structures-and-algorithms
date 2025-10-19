import java.util.*;
public class b3_reverseNumber {
  public static void reverse(int n){
    if(n == 0) return;
    System.out.print(n+" ");
    reverse(n-1);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    reverse(n);
    sc.close();
  }
}
