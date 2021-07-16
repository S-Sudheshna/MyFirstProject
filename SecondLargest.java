package ArrayBasics;
import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SecondLargest obj=new SecondLargest();
        int a;
        System.out.println("enter the size of array");
        a=in.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the elements of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        obj.second_largest(arr);
    }

   
    public void second_largest(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
        }
        System.out.println("second largest element"+arr[arr.length-2]);
       
    }
    }

