class person{
  String name;
  int age;
  person(){
    this.name = "shikhar";
    this.age = 20;
  }
  person(int x){
    this.age = x;
  }
  person(String name,int age){
    this.name = name;
    this.age = age;
  }
}
public class a2_linkList {
  public static void main(String[] args){
    person p1 = new person(12);
    System.out.println(p1.name);  // this will print null because there is no string in where only age is called in function
    person p2;
    p2 = p1;
    System.out.println(p2.age); // this p1 will contain the element of p1
    person p3 = new person("Shikhar Dutta",19);
    System.out.println(p3.name+" "+p3.age); // this will call another function with name and age in input
  }
}
