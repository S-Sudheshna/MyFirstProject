package ArrayBasics;
import java.util.Scanner;
public class Min_Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Min_Max obj=new Min_Max();
        int a;
        System.out.println("enter the size of array");
        a=in.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the elements of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        obj.min_Max(a, arr);
    }

   
    public void min_Max(int a, int arr[]){
        int max,min;
        max=arr[a-1];
        min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }else if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("maximum element"+max);
        System.out.println("minimum element"+min);
    }
}
