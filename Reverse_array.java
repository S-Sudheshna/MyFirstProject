
import java.util.Scanner;
public class Reverse_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Reverse_array obj = new Reverse_array();
        int a;
        System.out.println("enter size of array");
        a=in.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        obj.Reverse(a,arr);
    }
    public void Reverse(int a, int arr[]){
        int Newarr[]=new int[a];
        for(int i=arr.length-1,k=0;i>=0;i--){
            Newarr[k]=arr[i];
            k++;
        }
        System.out.println("reverse of array");
        for(int i=0;i<Newarr.length;i++){
            System.out.println(Newarr[i]);
        }
    }

}
