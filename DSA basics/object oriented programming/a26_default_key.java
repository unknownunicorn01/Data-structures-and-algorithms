import java.util.*;
import a25_encatulation;
class child{
  protected int age;
  String name;
  child(int a,String n){
    this.age = a;
    this.name = n;
  }
  void print(){
    System.out.println("name: "+this.name+" age: "+this.age);
  }
}
class parent extends child{
  parent(int a,String n){
    super(a,n);
  }
  
}

public class a26_default_key {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

  }
}
