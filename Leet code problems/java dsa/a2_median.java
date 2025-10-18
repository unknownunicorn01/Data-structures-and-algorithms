import java.util.*;
class Solution{
  public float median(int[] arr, int[] arr2){
    int len = arr.length+arr2.length;
    int[] mat = new int[len];
    for(int i=0;i<arr.length;i++){
      mat[i] = arr[i];
    }
    for(int i=0;i<arr2.length;i++){
      mat[arr.length+i] = arr2[i];
    }
    for(int i=1;i<mat.length;i++){
      for(int j=0;j<mat.length-i;j++){
        if(mat[j] > mat[j+1]){
          int temp = mat[j];
          mat[j] = mat[j+1];
          mat[j+1] = temp;
        }
      }
    }
    if(mat.length % 2 == 1){
      return mat[(mat.length+1)/2];
    }
    else{
      return ((float)mat[mat.length/2] + (float)mat[mat.length/2 + 1])/2;
    }
  }
}
public class a2_median {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n2 = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int[] arr2 = new int[n2];
    for(int i=0;i<n2;i++){
      arr2[i] = sc.nextInt();
    }
    Solution solution = new Solution();
    float median = solution.median(arr,arr2);
    System.out.println(median);
    sc.close();
  }
}
