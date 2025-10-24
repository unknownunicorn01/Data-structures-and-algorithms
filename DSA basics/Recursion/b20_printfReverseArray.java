import java.util.*;
public class b20_printfReverseArray {
  public static void reverseArr(int[] arr,int n){
    if(n == 0) return;
    System.out.print(arr[n-1]+" ");
    reverseArr(arr,n-1);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    reverseArr(arr,n);
    sc.close();
  }
}
