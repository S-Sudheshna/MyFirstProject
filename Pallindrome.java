import java.util.Scanner;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,n,sum=0,r;
        System.out.println("enter any numner");
        a=in.nextInt();
        in.close();
        n=a;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(a==sum){
            System.out.println(a+"is a pallindrome");
        }
        else{
            System.out.println(a+"is not a pallindrome");
        }

    }
}
