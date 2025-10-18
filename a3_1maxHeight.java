import java.util.*;
class Solution{
  public int water(int[] arr){
    int n = arr.length;
    int big = -1;
    int num;
    for(int i=0;i<n;i++){
      // int left = i;
      // int right = arr.length-1;
      for(int j=0;j<arr.length;j++){
        if(j==i){
          continue;
        }
        if(arr[j] > arr[i]){
          num = arr[i];
        }
        else{
          num = arr[j];
        }
        int def = i-j;
        if(def < 0){
          def = def*(-1);
        }
        if(num*(def) > big){
          big = num*(def);
        }
        else{
          continue;
        }
      }
    }
    return big;
  }
}
public class a3_1maxHeight{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Solution solution = new Solution();
    int res = solution.water(arr);
    System.out.println(res);
    sc.close();
  }
}
