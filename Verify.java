package ArrayBasics;
import java.util.Scanner;
public class Verify {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Verify obj=new Verify();
        int a;
        System.out.println("enter the size of array");
        a=in.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the elements of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("enter the number to be verified");
        int v1,v2;
        v1=in.nextInt();
        v2=in.nextInt();
        in.close();
        obj.verify(arr,v1,v2);
        
    }
    public void verify(int arr[], int v1, int v2){
        boolean found=false;
        boolean found2=false;
        int index1=0, index2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==v1){
                found= true;
                index1=i;
            }
            if(arr[i]==v2){
                found2=true;
                index2=i;
            }
        }
        if(found==true){
        System.out.println("element"+v1+" found at"+index1);
        }else{
            System.out.println("element"+v1+"is not found");
        }
        if(found2==true){
            System.out.println("element"+v2+"is found at"+index2);
        }else{
            System.out.println("element"+v2+"is not found");
        }
    }
}
