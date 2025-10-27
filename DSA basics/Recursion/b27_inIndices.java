import java.util.*;
public class b27_inIndices {
  public static void inIndex(int[] arr,int n,int k){
    if(n == 2*arr.length) return;
    int num = n - arr.length;
    if(arr[num] == k){
      System.out.print(num+" ");
    }
    inIndex(arr,n+1,k);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    inIndex(arr,n,k);
    sc.close();
  }
}
