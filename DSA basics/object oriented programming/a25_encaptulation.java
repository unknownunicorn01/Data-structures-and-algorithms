import java.util.*;
class employee{
  String name;
  //to achive encaptulation we use private key 
  //so no one can change it outside class
  private int salary;
  int pos;
  employee(String name,int salary,int pos){
    this.name = name;
    this.salary = salary;
    this.pos = pos;
  }
  //setter methord
  void setSalary(int salary,int p){
    if(salary < 0){
      System.out.println("Salary can not be negetive");
      return;
    }
    if(p <= pos){
      System.out.println("you can't change salary");
      return;
    }
    this.salary = salary;
  }
  //getter methord to get salary
  void getSalary(int p){
    if(p<=pos){
      System.out.println("you cant see salary");
      return;
    }
    System.out.println(this.salary);
  }
}
public class a25_encaptulation {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you possition in numer: ");
    int p  =sc.nextInt();
    employee e = new employee("Shikhar Dutta",100000,1);
    // System.out.println(e.salary); // this will show error
    //to access salary we need to be in higher rank in job
    e.setSalary(200000,p); //here we can set salary if we are in bigger rank 
    e.getSalary(p);
    sc.close();
  }
}
