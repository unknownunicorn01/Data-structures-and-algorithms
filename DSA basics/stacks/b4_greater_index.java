import java.util.*;
class Solution{
  long[] greater(long[] arr){
    Stack<Integer> st = new Stack<>();
    long[] res = new long[arr.length];
    for(int i=0;i<arr.length;i++){
      while(!st.isEmpty() && arr[i] > arr[st.peek()]){
        res[st.pop()] = arr[i];
      }
      st.push(i);
    }
    while(!st.isEmpty()){
      res[st.pop()] = -1;
    }
    return res;
  }
}
public class b4_greater_index {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] arr = new long[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Solution sol = new Solution();
    long[] res = sol.greater(arr);
    System.out.println(Arrays.toString(res));
    sc.close();
  }
}
