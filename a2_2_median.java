import java.util.*;
public class a2_2_median {
  public static int[] Solution(int[] arr, int[] arr2){
    int len = arr.length;
    int len2 = arr2.length;
    int maxLen = Integer.max(len,len2);
    for(int i=1;i<maxLen;i++){
      if(i > arr.length){
        for(int j=0;j<len-i;j++){
          if(arr[j] >= arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          }
        }
      }
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for(int j=0;j<n2;j++){
      arr2[j] = sc.nextInt();
    }
    int[] res = Solution(arr,arr2);
    System.out.println(Arrays.toString(res));
    sc.close();
  }
}
