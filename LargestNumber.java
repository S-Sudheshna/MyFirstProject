import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c,temp,largest;
        System.out.println("enter any three numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        in.close();
        temp=a>b?a:b;
        largest=c>temp?c:temp;
        System.out.println(largest+" is the largest number");

        }
    }

