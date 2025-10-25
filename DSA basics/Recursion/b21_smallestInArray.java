import java.util.*;
public class b21_smallestInArray {
  public static int small(int[] arr,int n){
    if(n < 1) return Integer.MAX_VALUE;
    int num = arr[n-1];
    return Math.min(num,small(arr,n-1));
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(small(arr,n));
    sc.close();
  }
}
