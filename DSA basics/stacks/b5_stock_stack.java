import java.util.*;
class Solution{
  int[] stock(long[] arr,int n){
    Stack<Integer> st = new Stack<>();
    int[] res = new int[arr.length];
    for(int i=0;i<n;i++){
      while(!st.isEmpty() && arr[i] >= arr[st.peek()]){
        st.pop();
      }
      if(st.isEmpty()){
        res[i] = 1+1;
      }
      else{
        res[i] = i - st.peek(); 
      }
      st.push(i);
    }
    return res;
  }
}
public class b5_stock_stack {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] arr = new long[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextLong();
    }
    Solution sol = new Solution();
    int[] res = sol.stock(arr,n);
    System.out.println(Arrays.toString(res));
    sc.close();
  }
}
