import java.util.*;
public class b25_firstIndex {
  public static int inIndex(int[] arr,int n,int k){
    if(n == 2*arr.length) return -1;
    int num = n - arr.length;
    if(arr[num] == k){
      return num;
    }
    return inIndex(arr,n+1,k);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    System.out.println(inIndex(arr,n,k));
    sc.close();
  }
}
