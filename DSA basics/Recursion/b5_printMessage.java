import java.util.*;
public class b5_printMessage {
  public static void message(int n){
    if(n == 0) return;
    message(n-1);
    System.out.println("AccioSchool");
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    message(n);
    sc.close();
  }
}
