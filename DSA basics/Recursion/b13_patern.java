import java.util.*;
public class b13_patern {
  public static void row(int j){
    if(j == 0) return;
    System.out.print("* ");
    row(j-1);
  }
  public static void patern(int n){
    if(n == 0) return;
    patern(n-1);
    row(n);
    System.out.println();
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    patern(n);
    sc.close();
  }
}
