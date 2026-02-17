class parent{
  int count;
  parent()
  {
    this.count = 10;
  }
  void print(){
    System.out.println(this.count); // print count parent count attribute
  }
  static void sayHi(){
    System.out.println("Hii");
  }
}
class child extends parent{
  int count; //this is child instence
  child(){
    this.count = 20; // this will set child count attirbute
    super.count = 10; //this will set parent attribute
  }
  void print(){
    //this is child print methote
    System.out.println(this.count);
  }
  static void sayHi(){
    System.out.println("child hi");
  }
}
public class a19_parents_instance {
  public static void main(String[] args){
    child c1 = new child();
    c1.print();
    child.sayHi(); //this will also print child sayHi methord because child class was created before parent instance in child class
  }
}
