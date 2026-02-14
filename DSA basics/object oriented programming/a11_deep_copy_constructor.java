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
  //bellow is the methord to make deep copy of a constructor
  Student(Student s){
    this.name = s.name;
    this.age = s.age;
    this.roll = s.roll;
    this.geneder = s.geneder;
  }
  void print(){
    System.out.println(this.name+" "+this.age+" "+this.roll+" "+this.geneder);
  }
}
public class a11_deep_copy_constructor {
  public static void main(String[] args){
    Student s1 = new Student();
    Student s2 = new Student(s1);
    s1.print();
    s2.print();
    System.out.println(s2 == s1); //this will print false
    s1.age = 20; // not only s1 setail will be change because s2 is deep copy
    s1.print();
    s2.print();
  }
}
