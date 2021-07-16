package ArrayBasics;
import java.util.Scanner;
public class EvenOddArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EvenOddArray obj=new EvenOddArray();
        int a;
        System.out.println("enter the size of array");
        a=in.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the elements of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        obj.Even(arr);
    }
    public void Even(int arr[]){
        int count=0;
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                
                count++;
            }else{
                
                count1++;
            }
        }
        System.out.println("the number of even number are:"+count);
        System.out.println("the number of odd numbers are:"+count1);
    }
}
