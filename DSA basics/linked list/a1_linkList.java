class person{
  //this store in memory as heep
  String name;
  int age;
  person(){  // this class is known as constructor
    this.name = "shikhar";  // this is what we are atoring in out memory
    this.age = 20;

  }
}
public class a1_linkList{
  public static void main(String[] args){
    // p1 is a refrence variable
    person p1 = new person(); // new create new object and p1 refers to that memory location

    System.out.println(p1); // this will print the address of p1
    System.out.println(p1.name); // this will take tha name function through the p1 refrence variable
    System.out.println(p1.age);
  }
}