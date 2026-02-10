class person{
  int age;
  String name;
  void info(){
    System.out.println("name of person is "+ name+ " and age is "+age);
  }
  //setter and getter give you controle of your code
  void setter_name(String name){
    this.name = name;
  }
  void setter(int age){
    if(age < 0){
      System.out.println("age can not be negetive");
      return;
    }
    this.age = age;
  }
}
public class a4_setter {
  public static void main(String[] args){
    person p1 = new person();
    p1.setter_name("Shikhar");
    p1.setter(19);
    p1.setter(-1); 
    p1.info();
  }
}
