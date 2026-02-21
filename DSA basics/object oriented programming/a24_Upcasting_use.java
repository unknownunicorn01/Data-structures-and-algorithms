class person{
  String name;
  int age;
  person(String n,int a){
    this.name = n;
    this.age = a;
  }
  void print(){
    System.out.println("Hellow world");
  }
}
class eng extends person{
  int eng_id;
  eng(String name,int a,int e){
    super(name,a);
    this.eng_id = e;
  }
  void print(){
    System.out.println("name is " +super.name+" age = "+super.age+" engeneering id = "+this.eng_id);
  }
}
class doc extends person{
  String degree;
  doc(String n,int a,String d){
    super(n,a);
    this.degree = d;
  }
  void print(){
    System.out.println("name is "+super.name+" age = "+super.age+" degree = "+this.degree);
  }
}
public class a24_Upcasting_use {
  public static void main(String[] args){
    person p1 = new eng("A",20,100);
    person p2 = new eng("A",20,100);
    person p3 = new eng("A",20,100);
    person[] arr = {p1,p2,p3};
    for(person p: arr){
      p.print();  //this is only print when print function is present in both child and parent
    }
  }
}
