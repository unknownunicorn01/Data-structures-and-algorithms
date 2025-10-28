import java.util.*;
public class b31_phoneNumbers {
  public static void phone(String str){
    String[] map = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    helper(str,"",map);
  }
  public static void helper(String str,String n,String[] map){
    if(str.length() == 0){
      System.out.println(n);
      return;
    }
    char c = str.charAt(0);
    String interp = map[c-'0'];
    for(int i=0;i<interp.length();i++){
      helper(str.substring(1),n + interp.charAt(i),map);
    }

  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    phone(n);
    sc.close();
  }
}
