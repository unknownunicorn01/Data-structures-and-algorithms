import java.util.*;
class Solution{
  // main code for insertion sort
  void insertion(int[] arr){
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i] >= arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}
public class a1_insertion_sort{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Solution sol = new Solution();
    sol.insertion(arr);
    System.out.println(Arrays.toString(arr));
    sc.close();
  }
}
