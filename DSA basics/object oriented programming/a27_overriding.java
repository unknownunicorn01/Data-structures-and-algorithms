class parent{
  void invest(){
    System.out.println("inverst in FD");
  }
}
class child extends parent{
  //we use override key word to tell compuler that this methord is overriding parent methord
  @Override //if we dont write this, that will be ok to, but it is a good practic
  void invest(){
    System.out.println("Inverst in cripto");
  }
}
public class a27_overriding {
  public static void main(String[] args){
    child c = new child();
    c.invest();
  }
}
