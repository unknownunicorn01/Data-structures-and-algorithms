import java.util.*;
public class b24_palendromeArray {
  public static boolean palendrome(int[] arr,int n){
    int res = isPalendrome(arr,0,n-1);
    if(res == 1){
      return true;
    }
    return false;
  }
  public static int isPalendrome(int[] arr,int start,int end){
    if(start > end){
      return 1;
    }
    if(arr[start] != arr[end]){
      return -1;
    }
    return isPalendrome(arr,start+1,end-1);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(palendrome(arr,n));
    sc.close();
  }
}
