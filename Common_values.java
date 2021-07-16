
import java.util.Scanner;
public class Common_values {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Common_values obj= new Common_values();
        int a;
        System.out.println("enter the size for arrays");
        a=in.nextInt();
        int arr1[]=new int[a];
        int arr2[]=new int[a];
        System.out.println("enter the values of array 1");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=in.nextInt();
        }
        System.out.println("enter the values of array 2");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=in.nextInt();
        }
        in.close();
        obj.Common(arr1, arr2);
    }
    public void Common(int arr1[], int arr2[]){
        System.out.println("common values are");
        int j=0;
        for(int i=0;i<arr1.length;i++){
           for(j=0;j<arr2.length;j++){
               if(arr1[j]==arr2[i]){
                  System.out.println(arr2[i]);
               }
           }
        }
    }
}
