import java.util.*;
public class b22_bigestOfArray {
  public static int bigest(int[] arr,int n){
    if(n == 0) return Integer.MIN_VALUE;
    int num = arr[n-1];
    return Math.max(num,bigest(arr,n-1));
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(bigest(arr,n));
    sc.close();
  }
}
