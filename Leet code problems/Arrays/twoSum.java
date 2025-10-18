import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
      for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length;j++){
          if(i==j){
            continue;
          }
          int total = nums[i] + nums[j];
          if(total == target){
            return new int[]{i,j};
          }
        }
      }
      return new int[]{-1};
    }
}
public class a1_twoSum{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i=0;i<n;i++){
      nums[i] = sc.nextInt();
    }
    int targ = sc.nextInt();
    Solution solution = new Solution();
    int[] arr = solution.twoSum(nums,targ);
    System.out.println(Arrays.toString(arr));
    sc.close();
  }
}
