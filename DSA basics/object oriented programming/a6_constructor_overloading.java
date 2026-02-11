class person{
  int age;
  String name;
  //person constructor will run according to the input
  person(){
    name = "Shikhar Dutta";
    age = 19;
    System.out.println(name+ " have age "+age);
  }
  person(String n){
    name = n;
    System.out.println(name+ " have age "+age);
  }
  person(String n,int a){
    name = n;
    age = a;
    System.out.println(name+ " have age "+age);
  }
}
public class a6_constructor_overloading {
  public static void main(String[] args){
    person p = new person();
    person p2 = new person("Ram"); //print age 0 because default age will not work when another contructor is called
    person p3 = new person("Virat Kholi",21);
  }
}
