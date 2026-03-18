abstract class blueprint{
  abstract void color();
  abstract void name();
  abstract void mileage();
}
class cars extends blueprint{
  @Override
  void color(){
    System.out.println("color : red");
  }
  @Override()
  void name(){
    System.out.println("name is BWM");
  }
  @Override
  void mileage(){
    System.out.println("Mileage is 20Km/hr");
  }
}
public class a29_abstraction {
  public static void main(String[] args){
    cars c = new cars();
    c.color();
    c.name();;
    c.mileage();
  }
}
