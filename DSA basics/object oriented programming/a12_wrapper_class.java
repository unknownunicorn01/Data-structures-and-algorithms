class wrraper{

}
public class a12_wrapper_class {
  public static void main(String[] args){
    //Integer a = new Integer(5);  //this is earlear way to write Integer wraper class in java
    // in new updates this is change and how we have following statement to write 
    Integer a = 5;  //autoboxing  //converting int into Integer type object
    int b = a; //unboxing  //converting Integer class into premotive int 
    System.out.println(a);
    System.out.println(b);

    Integer c = a;
    a++;
    System.out.println(a);
    System.out.println(c);  //make deepcopy of a mean a and c do not reffer to same object in heep
  }
}
