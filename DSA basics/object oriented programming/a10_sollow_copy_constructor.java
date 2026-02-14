class Student{
  String name;
  int age;
  int roll;
  String geneder;
  Student(){
    this.name = "shikhar Dutta";
    this.age = 19;
    this.roll = 4;
    this.geneder = "Male";
  }
  void print(){
    System.out.println(this.name+" "+this.age+" "+this.roll+" "+this.geneder);
  }
}
public class a10_sollow_copy_constructor {
  public static void main(String[] args){
    Student s1 = new Student();
    //Sollow copy
    Student s2 = s1; // both will point at same memory location in heep memory;
    s1.print();
    s2.print();
    System.out.println(s1 == s2); // this will print true
    s1.age = 20;
    // in both age is change because s2 carry same reffrence
    s1.print();
    s2.print();
  }
}
