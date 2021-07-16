import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,a=2;
        System.out.println("enter any number");
        n=in.nextInt();
        in.close();
        while(a<n){
            if(n%a==0){
                break;
            }
            a++;
        }
        if(a==n){
            System.out.println(n+"is a prime number");
        }
        else{
            System.out.println(n+"is not a prime number");
        }
    }
}
