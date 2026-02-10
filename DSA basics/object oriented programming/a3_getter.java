class person{
  int age;
  String name;
  void info(){
    System.out.println("name of perosn is "+ name +" and age is "+age);
  }
  int get_age(){
    return age;
  }
}
public class a3_getter {
  public static void main(String[] ags){
    person p1 = new person();
    p1.age = 19;
    p1.name = "Shikhar";
    System.out.println(p1.get_age()); // this will call getter function and return age of person
  }
}
