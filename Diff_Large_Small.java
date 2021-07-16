
import java.util.Scanner;
public class Diff_Large_Small {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Diff_Large_Small  obj=new Diff_Large_Small ();
        int a;
        System.out.println("enter the size of array");
        a=in.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the elements of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        obj.Diff(arr);
    }

   
    public void Diff(int arr[]){
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
        temp= arr[arr.length-1]-arr[0];
        System.out.println("the difference between the largest and smallest value is "+temp);
       
    }
    }

