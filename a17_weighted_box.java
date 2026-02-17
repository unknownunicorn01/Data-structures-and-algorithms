class box{
  int length;
  int base;
  int height;
  box(){
    this.length = 0;
    this.base = 0;
    this.height = 0;
  }
  box(int l,int b,int h){
    this.length = l;
    this.base = b;
    this.height = h;
  }
}
class Weighted_box extends box{
  int weight;
  Weighted_box(int w){
    this.weight = w;
  }
  void print(){
    System.out.println("length ="+this.length +" base ="+this.base+" height ="+this.height+" weight="+this.weight);
  }
}
public class a17_weighted_box {
  public static void main(String[] args){
    box box= new box(2,3,4);
    Weighted_box wbox= new Weighted_box(100);
    wbox.print();
  } 
}
