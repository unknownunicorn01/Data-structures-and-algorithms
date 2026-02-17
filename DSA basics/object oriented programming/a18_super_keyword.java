class box{
  int l;
  int b;
  int h;
  box(){
    this.l =0;
    this.b =0;
    this.h =0;
  }
  box(int l,int b,int h){
    this.l = l;
    this.b = b;
    this.h = h;
  }
  void sayHi(){
    System.out.println("Hii");
  }
}
class Weight_box extends box{
  int w;
  Weight_box(){
    //we can use super keyword to access attributes of parent class
    super.l = 0;
    super.b = 0;
    super.h = 0;
  }
  Weight_box(int l,int b,int h,int w){
    super(l,b,h); // like this we can even use constructor of parent class
    this.w = w;
  }
  void print(){
    System.out.println("length = "+super.l+" base = "+super.b+" height = "+super.h+" weight = "+this.w);
  }
  void sayHello(){
    super.sayHi(); // like this we can even access methord of parent class
  }
}
public class a18_super_keyword {
  public static void main(String[] args){
    Weight_box wb1 = new Weight_box(2,3,4,5);
    wb1.sayHello();
    wb1.print();
  }
}
