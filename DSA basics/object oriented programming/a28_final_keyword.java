class parent{
  //using final keyword mean this methord can not be override
  final void print(){
    System.out.println("this method can not be override");
  }
}
final class finalParent{
  void print(){
    System.out.println("this class can not be inharitated");
  }
}
class child extends parent{
  // void print(){ this methor can be name print because we use this name parent class
  void childprint(){
    System.out.println("this is in child");
  }
}
public class a28_final_keyword {
  public static void main(String[] args){
    child c = new child();
    finalParent p = new finalParent();
    p.print();
    c.print();
  }
}
