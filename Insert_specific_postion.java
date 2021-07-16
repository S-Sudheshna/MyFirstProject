
import java.util.Scanner;
public class Insert_specific_postion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Insert_specific_postion obj=new Insert_specific_postion();
        int a,n,y;
        System.out.println("enter the size of an array");
        a=in.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the values of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("enter the position of the element to be inserted");
        n=in.nextInt();
        System.out.println("enter the element to be inserted");
        y=in.nextInt();
        in.close();
        obj.Insert(a,arr,n,y);
    }
    public void Insert(int a,int arr[],int x, int y){
        int Narr[]=new int[a+1];
        for(int i=0;i<a+1;i++){
            if(i<=x-1){
                Narr[i]=arr[i];
            }else if(i==x){
                Narr[i]=y;
            }else{
                Narr[i]=arr[i-1];
            }
        }
        System.out.println("after inserting the element");
        for(int i=0;i<Narr.length;i++){
            System.out.println("arr["+i+"]"+Narr[i]);
        }
    }
}
