import java.util.*;
class Solution{
  public int maxArea(int[] height){
    int left = 0, right = height.length -1, area = 0, maxArea = 0;
        
    while (left < right) {
      int min = Math.min(height[left], height[right]);
      area = min * (right-left);
      maxArea = Math.max(area, maxArea);
      while (left<right && height[left] <= min) {
        left++;
      }
      while (left<right && height[right] <= min) {
        right--;
      }
    }
    return maxArea;
  }
}
public class a3_3_maxHeight {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] height = new int[n];
    for(int i=0;i<n;i++){
      height[i] = sc.nextInt();
    }
    Solution solution = new Solution();
    System.out.println(solution.maxArea(height));
    sc.close();
  }
}
