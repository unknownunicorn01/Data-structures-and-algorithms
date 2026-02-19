class parent{
  String name;
  int age;
  parent(){
    this.name = "parent name";
    this.age = 25;
    System.out.println("parent constructor");
  }
  void run(){
    System.out.println("parent run");
  }
  static void parentStatic(){
    System.out.println("hellow parent");
  }
}
class child extends parent{
  String name;
  int age;
  child(){
    this.name = "Child name";
    this.age = 5;
    System.out.println("child constructor");
  }
  void run(){
    System.out.println("child running");
  }
  static void childStatic(){
    System.out.println("hellow child");
  }
}
public class a23_c_reffrence_p_object {
  public static void main(String[] args){
    // child c = new parent();  //this is not allowed
    child c = new child();
    parent p = c; // this is how we can do DOWNCASTING
    System.out.println(p.name);
    System.out.println(p.age);
    p.run();
    
  }
}
