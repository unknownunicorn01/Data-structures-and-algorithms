class Human{
  String name;
  int age;
  static int count;
  Human(String n,int a){
    this.name = n;
    this.age = a;
    Human.count ++;
  }
  static void sayHi(){  //this is a static methord, we can call it inside any static and non static methord
    System.out.println("hi");
  }
  void SayHellow(){
    //this is a non static methord, we can not call it everyware withotu reffrence
    System.out.println("Hellow");
  }
  static void callStatic(){
    Human.sayHi(); // this will work because this is a static methord
    //static work inside static 
  }
  void callNonStatic(){
    this.SayHellow(); // this will work because we have taken reffrence
    //non static work inside non static and static only with reffrence
    Human.sayHi(); 
    //static methord can be called inside non static methord
  }

  
}
public class a15_static_keyword {
  public static void main(){
    Human.callStatic();
  }
}
