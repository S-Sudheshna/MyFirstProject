
import java.util.Scanner;
public class Returnarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Returnarray obj=new Returnarray();
        int a;
       
        System.out.println("enter the size of array");
        a=in.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the values of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        int arr1[]=obj.Find(arr);
        for(int i=0;i<arr1.length;i++){
            if(arr[i]!=0){
                System.out.println(arr1[i]);
            }
        }
    }
    public int[] Find( int arr[]){
        System.out.println("after deleting the duplicate values");
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]==arr[j])&&(i!=j)){
                    arr[j]='\0';
                }
            }
        }
        return arr;
    }
}
