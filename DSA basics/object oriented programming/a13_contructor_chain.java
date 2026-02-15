class student{
  String name;
  int age;
  int roll;
  student(int age,int roll){
    this.age = age;
    this.roll = roll;
  }
  student(String name,int age,int roll){
    this(age,roll); //this is contructor chainging, insted of writing whole function again we call constructor insted
    /*
      few rules
        1 constructor can be called only in first line of contructor
        2 only one constructor can be call inside constructor
        3 atleat one contructor should not contain any contructor inside it otherwise it can cause recursive contructor invocation
        4 contructor inside class can be write in any seriece
    */
    this.name = name;
  }
  void print(){
    System.out.println(this.name + " have age "+this.age+" and roll number: "+this.roll);
  }
}
public class a13_contructor_chain {
  public static void main(String[] args){
    tudent s1 = new student("Shikhar Dutta",19,20);
    s1.print();
  }
}
