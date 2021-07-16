package ArrayBasics;
import java.util.Scanner;
public class Remove_position_value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Remove_position_value obj=new Remove_position_value();
        int a,n;
        System.out.println("enter the size of an array");
        a=in.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the values of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("enter the position of the element to be removed");
        n=in.nextInt();
        in.close();
        obj.Position_remove(arr,n);
    }
    public void Position_remove(int Newarr[],int x){
        int arr1[]=new int[Newarr.length];
        for(int i=0,k=0;i<Newarr.length;i++){
            if(i!=x){
                arr1[k]=Newarr[i];
                k++;
            }
        }
        System.out.println("after removing the element");
        for(int i=0;i<arr1.length-1;i++){
            System.out.println(arr1[i]);
        }
    }
}
