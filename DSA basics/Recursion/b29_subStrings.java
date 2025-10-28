import java.util.*;
public class b29_subStrings {
  public static void subString(String str){
    int start = 0;
    helper(str,start,start);
  }
  public static void helper(String str,int start,int end){
    if(start == str.length()) return;
    if(end == str.length()){
      helper(str,start+1,start+1);
      return;
    }
    System.out.print(str.substring(start,end)+" ");
    helper(str,start,end+1);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    subString(str);
    sc.close();
  }
}
