import java.util.*;
class Solution{
  public int maxArea(int[] height){
    int left = 0;
    int right = height.length -1;
    int max = 0;
    while(left<right){
      int length = Math.min(height[left],height[right]);
      int width = right-left;
      int area = length*width;
      max = Math.max(max,area);
      if(height[left] < height[right]){
        left++;
      }
      else{
        right--;
      }
    }
    return max;
  }
}
public class a3_2_maxHeight{
  public  static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] height = new int[n];
    for(int i=0;i<height.length;i++){
      height[i] = sc.nextInt();
    }
    Solution solution = new Solution();
    System.out.println(solution.maxArea(height));
    sc.close();
  }
}