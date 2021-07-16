package ArrayBasics;
import java.util.Scanner;
public class Missing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       Missing obj=new Missing();
        int a;
        System.out.println("enter the size of array");
        a=in.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the elements of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        obj.Check(arr);
    }
    
    public void Check(int arr[]){
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
        int j=0;
        for(int i=1;i<=100;i++){
               if(j<arr.length && i==arr[j])
                     j++;
               else
                     System.out.print(i+" ");
               
        }
    }
}
