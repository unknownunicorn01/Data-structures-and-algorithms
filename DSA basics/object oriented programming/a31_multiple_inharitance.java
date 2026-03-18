interface animal{
  void leg();
  void run();
  void eat();
  void sleep();
}
interface human{
  void leg();
  void speek();
  void sleep();
  void learn();
}
class humanBeing implements animal,human{ //like this we can have multiple inharitance
  public void leg(){
    System.out.println("have 2 legs");
  }
  public void run(){
    System.out.println("can run");
  }
  public void eat(){
    System.out.println("eat both plan and animal");
  }
  public void speek(){
    System.out.println("can comunicate");
  }
  public void sleep(){
    System.out.println("sleep at nught");
  }
  public void learn(){
    System.out.println("learn by interacting with each other");
  }
}
public class a31_multiple_inharitance {
  public static void main(String[] args) {
    humanBeing hb = new humanBeing();
    hb.eat();
    hb.sleep();
    hb.run();
    hb.learn();
  }
}
