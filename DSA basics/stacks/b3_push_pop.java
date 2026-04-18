import java.util.*;
class Solution{
  Boolean valid(int[] arr1,int[] arr2){
    // if(arr2.length > arr1.length) return false;
    // Stack<Integer> st = new Stack<>();
    // int i=0,j=0;
    // while(i != arr1.length && j != arr2.length){
    //   if(i < arr1.length){
    //     st.push(arr1[i]);
    //     i++;
    //   }
    //   while(j < arr2.length && !st.isEmpty() && arr2[j] == st.peek()){
    //     st.pop();
    //     j++;
    //   }
    // }
    // if(st.isEmpty()) return true;
    // return false;

    // leet code method
    int n = arr1.length;
    Stack<Integer> st = new Stack<>();
    int i=0,j=0;
    while(i < n && j < n){
      if(!st.isEmpty() && arr2[j] == st.peek()){
        st.pop();
        j++;
      }
      else if(i<n){
        st.push(arr1[i]);
        i++;
      }
      else{
        return j==n;
      }
    }
    return true;
  }
}
public class b3_push_pop {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr1 = new int[n];
    for(int i=0;i<n;i++){
      arr1[i] = sc.nextInt();
    }
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0;i<n2;i++){
      arr2[i] = sc.nextInt();
    }
    Solution s = new Solution();
    Boolean ans = s.valid(arr1,arr2);
    System.out.println(ans);
    sc.close();
  }
}
