import java.util.*;
public class b33_climbing_stairs {
  public static int stair(int n,int x){
    if(n-1 >= 0) stair(n-1,x++);
    if(n-2 >= 0) stair(n-2,x+=2);
    if(n-3 >= 0) stair(n-3,x+=3);
    return x;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(stair(n,0));
    sc.close();
  }
}
