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

  //bellow are the function to access the parent attribute
  void parentSayHi(){
    super.sayHi();  //this will access paretn static methord
  }
  void parentPrint(){
    super.print();
  }
}
public class a20_access_parent_attribute {
  public static void main(String[] args){
    child c = new child();
    c.print();
    c.parentPrint();
    child.sayHi();
    c.parentSayHi();
  }
}
