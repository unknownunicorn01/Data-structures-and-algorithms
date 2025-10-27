import java.util.*;
public class b28_findEleven {
  public static int inIndex(int[] arr,int n){
    if(n == 0) return 0;
    if(arr[n-1] == 11){
      return 1 + inIndex(arr,n-1);
    }
    else{
      return inIndex(arr,n-1);
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(inIndex(arr,n));
    sc.close();
  }
}
