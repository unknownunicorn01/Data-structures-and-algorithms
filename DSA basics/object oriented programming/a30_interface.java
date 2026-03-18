interface shikhar{
  static void print(){
    System.out.println("hellow world");
  }
    void run();
    void speek();
    void eat();
}
class parent implements shikhar{
  public void run(){
    System.out.println("can run");
  }
  public void speek(){
    System.out.println("can speek");
  }
  public void eat(){
    System.out.println("can eat");
  }
}
public class a30_interface {
  public static void main(String[] args){
    shikhar p = new parent();
    p.run();
    p.eat();
    p.speek();
  }
}
