import java.util.*;
class Solution{
  public void Solution(String s,String[] arr){
    int oneWrong = 0;
    for(int i=0;i<arr.length;i++){
      oneWrong = 0;
      if(s.length() == arr[i].length()){
        for(int j=0;j<s.length();j++){
          if(arr[i].charAt(j) != s.charAt(j)){
            oneWrong++;
          }
        }
      }
      if(oneWrong == 1){
        System.out.println(arr[i]);
      }
    }
  }
}
public class c_problem{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    String[] arr = new String[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextLine();
    }
    Solution obj = new Solution();
    obj.Solution(s,arr);
    sc.close();
  }
}