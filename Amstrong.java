import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,sum=0,r,n;
        System.out.println("enter any number");
        a=in.nextInt();
        in.close();
        n=a;
        while(n>0){
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
    if(a==sum){
        System.out.println(" amstrong");
    }else{
        System.out.println("Not amstrong");
    }
}
}
