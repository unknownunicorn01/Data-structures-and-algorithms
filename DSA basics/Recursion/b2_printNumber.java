import java.util.*;
public class b2_printNumber {
  public static void numbers(int n){
    if(n == 0) return;
    numbers(n-1);
    System.out.print(n+" ");
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    numbers(n);
    sc.close();
  }
}
