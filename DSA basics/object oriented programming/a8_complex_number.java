import java.util.*;
class complex{
  int rl;
  int img;
  complex(){
    this.rl = 0;
    this.img = 0;
  }
  complex(int rl,int img){
    this.rl = rl;
    this.img = img;
  }
  complex plus(complex c2){
    int real = this.rl + c2.rl;
    int imaginary = this.img + c2.img;
    complex c3 = new complex(real,imaginary);
    return c3;
  }
  complex subtract(complex c2){
    int real = this.rl - c2.rl;
    int imaginary = this.img - c2.img;
    complex c3 = new complex(real,imaginary);
    return c3;
  }
  complex multiply(complex c2){
    int real = this.rl*c2.rl - (this.img * c2.img);
    int imaginary = this.img*c2.rl + c2.img*this.rl;
    complex c3 = new complex(real,imaginary);
    return c3;
  }
  void print(){
    if(this.img < 0){
      System.out.println(this.rl + " - i"+(-1)*this.img);
    }
    else{
      System.out.println(this.rl + " + i"+this.img);
    }
  }
}
public class a8_complex_number {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int rl1 = sc.nextInt();
    int img1 = sc.nextInt();
    int rl2 = sc.nextInt();
    int img2 = sc.nextInt();
    complex c1 = new complex(rl1,img1);
    complex c2 = new complex(rl2,img2);
    
    System.out.print("enter 1 to plus, 2 for subrtact and 3 for multiplication: ");
    int op = sc.nextInt();
    if(op == 1){
      complex c3 = c1.plus(c2);
      c3.print();
    }
    else if(op == 2){
      complex c3 = c1.subtract(c2);
      c3.print();
    }
    else if(op == 3){
      complex c3 = c1.multiply(c2);
      c3.print();
    }
    else{
      System.out.println("invalit operator");
    }
    sc.close();
  }
}

