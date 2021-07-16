import java.util.Scanner;
public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,n;
        System.out.println("enter any number");
        a=in.nextInt();
        in.close();
        n=a%2;
        switch(n){
            case 0 : System.out.println(a+"is a even number");
            case 1 : System.out.println(a+"is odd number");
            
        }
    }
}
