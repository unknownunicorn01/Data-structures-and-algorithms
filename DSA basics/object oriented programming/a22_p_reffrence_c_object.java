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
public class a22_p_reffrence_c_object {
  public static void main(String[] args){

    parent p = new child(); //refrence will be of parent but object will be of child
    //parent instance will be created in memory in runtime
    System.out.println(p.name); //parent attribtue will be printed
    System.out.println(p.age);//parent attribute will be printed
    //because parent reffrence is taken so it will check in parent first

    p.run(); //in methord is a deffrence case because while checking methord it will check the object which is child object
    //and static mthord will also print of child
    child.childStatic();

    //but opposit of it is not possible
    
  }
}
