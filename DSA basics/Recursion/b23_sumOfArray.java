import java.util.*;
public class b23_sumOfArray {
  public static int sum(int[] arr,int n){
    if(n == 0) return 0;
    int num = arr[n-1];
    return num + sum(arr,n-1);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(sum(arr,n));
    sc.close();
  }
}
