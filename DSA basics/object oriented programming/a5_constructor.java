class person {
  int age;
  String name;
  person(){
    //we can also give by default value to attributes by constructor
    age = 18;
    name = "Shikhar Dutta";
    System.out.println("Constructor running"); //this line will run by default when class is called
  }
}
public class a5_constructor {
  public static void main(String[] args){
    person p = new person();
    System.out.println(p.name+" have age "+p.age);
  }
}
