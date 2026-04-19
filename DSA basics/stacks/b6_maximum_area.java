import java.util.*;
class Solution{
  int maxArea(int[] arr){
    Stack<Integer> a = new Stack<>();
    int max = -1;
    for(int i=0;i<arr.length;i++){
      if(a.isEmpty()){
        a.push(i);
      }
      if(arr[i] > arr[a.peek()]){
        a.push(i);
      }
      else if(arr[i] < arr[a.peek()]){
        int area = arr[a.peek()] * (i - a.peek());
        if(area >= max){
          max = area;
        }
        a.pop();
      }
      else{
        if(i == arr.length - 1){
          int area = arr[a.peek()] * (i - a.peek() + 1);
          if(area >= max){
            max = area;
          }
        }
        continue;
      }
    }
    return max;
    
  }
}
public class b6_maximum_area {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Solution sol = new Solution();
    int area = sol.maxArea(arr);
    System.out.println(area);
    sc.close();
  }
}
