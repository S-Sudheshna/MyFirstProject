import java.util.Scanner;
public class LargestIf {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int a,b,c;
      System.out.println("enter any three numbers");
      a=in.nextInt();
      b=in.nextInt();
      c=in.nextInt();
      in.close();
        if(a>b){
          if(a>c){
            System.out.println("a ="+a+"is the largest number");
          }
          else{
            System.out.println("c ="+c+"is the largest number");
         }
      }else{
        if(b>c){
          System.out.println("b ="+b+"is the largest number");
        }
        else{
          System.out.println("c ="+c+" is the largest number");
        }
      }
  }  
}
