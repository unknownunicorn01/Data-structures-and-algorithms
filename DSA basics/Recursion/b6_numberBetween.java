import java.util.*;
public class b6_numberBetween {
  public static void numbers(int a,int b){
    if(a > b) return;
    numbers(a,b-1);
    System.out.println(b);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    numbers(a,b);
    sc.close();
  }
}
