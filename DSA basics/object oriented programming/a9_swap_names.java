import java.util.*;
class person{
  String name;
  int age;
  person(String name,int age){
    this.name = name;
    this.age = age;
  }
  void print(){
    System.out.println(this.name + " : "+this.age);
  }
}
public class a9_swap_names {
  static void swap(person p1,person p2){
    String name = p1.name;
    p1.name = p2.name;
    p2.name = name;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    int age = sc.nextInt();
    person p1 = new person(name,age);
    sc.nextLine();
    String name2 = sc.nextLine();
    int age2 = sc.nextInt();
    person p2 = new person(name2,age2);
    p1.print();
    p2.print();
    //bellow is one methord 
    // person p3 = p1;
    // p1 = p2;
    // p2 = p3;

    swap(p1,p2);
    p1.print();
    p2.print();
    sc.close();

  }
}
