
import java.util.Scanner;
public class Copy_Elements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Copy_Elements obj= new Copy_Elements();
        int a;
        System.out.println("enter the size of an array");
        a=in.nextInt();
        int n[]=new int[a];
        System.out.println("enter the values of array");
        for(int i=0;i<a;i++){
            n[i]=in.nextInt();
        }
        in.close();
        System.out.println("before copying");
        for(int i=0;i<n.length;i++){
        System.out.println(n[i]);
        }
        obj.Copy(n);
    
        }
        public void Copy(int NewArr[]){                         
            int Arr[]= new int[NewArr.length];
            for(int i=0,k=0;i<NewArr.length;i++){
                    Arr[k]=NewArr[i];
                    k++;
            }
            System.out.println("After copying");
            for(int i=0;i<Arr.length;i++){
                System.out.println(Arr[i]);
            }
           
    }
}
