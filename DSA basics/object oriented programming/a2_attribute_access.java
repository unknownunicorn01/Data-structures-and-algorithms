import java.util.*;
class person{
  int age;
  String name;
  void walk(){
    System.out.println(name+"can walk"); // in this we see that methord in java have access to attributes
  }
  void info(){
    System.out.println("name of person is "+ name + " and age is "+ age);
  }
  void cook(int time){
    //like this we can even get input from user
    System.out.println(name+ "can coock in " + time+" minutes");
  }
}

public class a2_attribute_access {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    person p1 = new person();
    p1.name = "Shikhar";
    p1.age = 19;
    p1.info();
    person p2 = new person();
    //p2 will not contain anything so it will return null
    System.out.println(p2.name + " " + p2.age);
    p2 = p1; // this way we can store information of p1 into p2
    System.out.println(p2.name + " " + p2.age);
    //bellow is the code to give input in class
    p1.cook(10);
    sc.close();

  }
}
