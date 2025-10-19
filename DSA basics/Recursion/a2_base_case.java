import java.util.Scanner;

//breaking complex problems into simple small problem until we can solve it is known as base case

public class a2_base_case {
  public static void calculator(int a,int b){
    //in this function we call multiple fucntion in one function
    System.out.println("sum = " + sum(a,b));
    //each function even first function will wait till the called function is in execution
    System.out.println("multiplication = " + multiply(a,b));
    System.out.println("division = " + divide(a,b));
    System.out.println("subtraction = " + subtract(a,b));

  }
  public static int sum(int a,int b){
    return a+b;
  }
  public static int multiply(int a,int b){
    return a*b;
  }
  public static float divide(int a,int b){
    return (float)a/(float)b;
  }
  public static int subtract(int a,int b){
    return a-b;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    calculator(a,b);
    sc.close();
  }
}
