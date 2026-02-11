class person{
  String name;
  int age;
  person(String name,int age){
    //name  = name;
    //age = age; //if we write like this this will put value of argument in argument not in attribute
    this.name = name;
    this.age = age; // this will put value of argument in atribute
  }
  void info(){
    System.out.println(this); //this reffer to the address of the object
    System.out.println("person name is: "+ this.name +" and age of person is: "+ this.age);
  }
}
public class a7_this_keyword {
  public static void main(String[] args){
    person p = new person("Shikhar Dutta",19);
    p.info();
  }
}
