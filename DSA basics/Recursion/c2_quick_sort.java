import java.util.*;
public class c2_quick_sort {
  public static void quickSort(int[] arr,int n){
    helper(arr,0,n-1);
    System.out.println(Arrays.toString(arr));
  }
  public static void helper(int[] arr,int l,int r){
    if(l<r){
      int idxParameter = parameter(arr,l,r);
      helper(arr,l,idxParameter - 1);
      helper(arr,idxParameter + 1, r);
    }
  }
  public static int parameter(int[] arr,int l,int r){
    int pivot = arr[l];
    int i = l;
    int j = r;
    while(i<j){
      while(i<=r && arr[i] <= pivot) i++;
      while(j>=l && arr[j] > pivot) j--;
      if(i<j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
      }
    }
    arr[l] = arr[j];
    arr[j] = pivot;
    return j;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    quickSort(arr,n);
    sc.close();
  }
}
