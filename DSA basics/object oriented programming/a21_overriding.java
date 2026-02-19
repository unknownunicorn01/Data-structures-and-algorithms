class parent{
  parent(){
    System.out.println("hellow wolrd");
  }
  void saving(){
    System.out.println("invest in FD");
  }
}
class child extends parent{
  child(){
    System.out.println("hii"); //both constructor will be called default
  }
  void saving(){
    System.out.println("invest in cripto");
  }
}
public class a21_overriding {
  public static void main(String[] args){
    child c = new child();
    c.saving(); //here child will override parent saving methord, because child class is created on runtime
  }
}
