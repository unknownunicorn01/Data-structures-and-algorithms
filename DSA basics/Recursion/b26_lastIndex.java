import java.util.*;
public class b26_lastIndex {
  public static int lastIdx(int[] arr,int n,int k){
    if(n == 0) return -1;
    if(arr[n-1] == k){
      return n-1;
    }
    return lastIdx(arr,n-1,k);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    System.out.println(lastIdx(arr,n,k));
    sc.close();
  }
}
