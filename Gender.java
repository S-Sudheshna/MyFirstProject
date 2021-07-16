import java.util.Scanner;
public class Gender {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a;
        System.out.println("enter your gender (M/m) or (F/f) ");
        a=in.next().charAt(0);
        in.close();
        switch(a){
            case 'M' :
            case 'm' : 
                   System.out.println( "male");
                   break;
            case 'F' :
            case 'f' :
                  System.out.println("female");
                  break;
            
        }
    }
}

