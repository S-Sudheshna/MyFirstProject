import java.util.Scanner;
public class EvenWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Sta_rt,E_nd;
        System.out.println("enter the starting range ");
        Sta_rt=in.nextInt();
        System.out.println("enter the ending range");
        E_nd=in.nextInt();
        in.close();
        while(Sta_rt<=E_nd){
            if(Sta_rt%2==0){
                System.out.println(Sta_rt+" is even");
            }
            Sta_rt++;
        }
    }
}
