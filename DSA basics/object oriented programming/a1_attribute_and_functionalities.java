class person{
  int age;
  String name;
  void talk(){
    System.out.println("can talk");
  }
}
public class a1_attribute_and_functionalities{
  public static void main(String[] args){
    // bellow is the object which is a real world entity and take space in memory
    person p1 = new person();
    // p1 is refrence variable to the object and contain address of the object
    p1.name = "Shikhar";
    p1.age = 19;
    person p2 = new person();
    p2.name = "ayush";
    p2.age = 20;
    p1.talk();
    p2.talk();
  }
}