import java.util.*;
public class c1_marge_sort {
  public static void marge(int[] arr,int l,int r){
    if(l >= r){ 
      return;
    }
    int mid = l + (r-l)/2;
    marge(arr,l,mid);
    marge(arr,mid+1,r);
    margeSort(arr,l,mid,r);
  }
  public static void margeSort(int[] arr,int l,int mid,int r){
    int idx1 = l;
    int idx2 = mid+1;
    int t = 0;
    int[] temp = new int[r-l +1];
    while(idx1 <= mid && idx2 <= r ){
      // while(arr[idx1] >= arr[idx2]) temp[t++] = arr[idx1++];
      // while(arr[idx2] >= arr[idx1]) temp[t++] = arr[idx2++];
      if (arr[idx1] <= arr[idx2]) temp[t++] = arr[idx1++];
      else temp[t++] = arr[idx2++];

    }
    while(idx1 <= mid){
      temp[t++] = arr[idx1++];
    }
    while(idx2 <= r){
      temp[t++] = arr[idx2++];
    }
    for(int i=0;i<temp.length;i++){
      arr[l+i] = temp[i];
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    marge(arr,0,n-1);
    System.out.println(Arrays.toString(arr));
    sc.close();
  }
}
