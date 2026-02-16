class Human{
  String name;
  int age;
  //int count; // by default count will be 0;
  static int count; //because we created count as static variable it can be accessed by class name
  // we dont need to create object to access this variable because this is static
  Human(String n,int age){
    this.name = n;
    this.age = age;
    Human.count += 1; // we access static variable or methord by Class_Name.variable; or Class_Name.methord;
  }
  void sayHellow(){
    System.out.println(this.name+" "+this.age+" "+Human.count);
  }
  static void sayHi(){
    System.out.println("this is a static methord and count = "+Human.count);
  }
}
public class a14_satatic_keyword {
  //main is a static methord, which run at strting of code, and all object are created in this, so if main is not static which mean no oject will be able to create and nothing will work
  public static void main(String[] args){
    
    System.out.println(Human.count); // we can access this without creating object
    Human.count++;
    System.out.println(Human.count);
    Human h1 = new Human("A",19);
    Human h2 = new Human("B",20); // count will be one plus every time object is created
    //because count is a static variable;
    Human.sayHi(); // we call it like this because this is a static methord in a class
    System.out.println(Human.count); // count will be increased because count is a static variable
  }
}
