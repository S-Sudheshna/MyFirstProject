
import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Duplicate obj=new Duplicate();
        int a;
        System.out.println("enter the size of array");
        a=in.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the values of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        obj.duplicate(arr);
    }
    public void duplicate( int arr[]){
        System.out.println("duplicate values are");
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]==arr[j])&&(i!=j)){
                    System.out.println(arr[j]);
                }
            }
        }
    }

}
