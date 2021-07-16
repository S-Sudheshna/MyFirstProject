import java.util.Scanner;

public class Input {
   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int a,b;
       System.out.println("enter two numbers");
       a=in.nextInt();
       b=in.nextInt();
       in.close();
       
       if(a==b){
       System.out.println("Equal");
       }
       else{
       System.out.println("not equal");
       }
       
   } 
}
