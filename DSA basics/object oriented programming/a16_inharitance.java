class Person{
  String name;
  int age;
  Person(){
    this.name = "Shikhar";
    this.age = 19;
  }
  //we cant use just one constructor with parameters on parent class
  // Person(String n,int a){
  //   this.name = n;
  //   this.age = a;
  // }
}
class developer extends Person{
  void print(){
    System.out.println("hellow world");
  }
}
public class a16_inharitance {
  public static void main(String[] args){
    Person p1 = new Person();
    developer d1 = new developer();
    System.out.println(p1.name +" is person name and age is: "+p1.age);
    //d1 can access to every attribut in person class
    System.out.println(d1.name + " developer age is : "+d1.age);
  } 
}
