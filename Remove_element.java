package ArrayBasics;
import java.util.Scanner;
public class Remove_element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Remove_element obj= new Remove_element();
        int a,y;
        System.out.println("enter the size of an array");
        a=in.nextInt();
        int n[]=new int[a];
        System.out.println("enter the values of array");
        for(int i=0;i<a;i++){
            n[i]=in.nextInt();
        }
        System.out.println("enter the element to be removed");
        y=in.nextInt();
        in.close();
        obj.Remove(n,y);
    
        }
        public void Remove(int NewArr[],int X){                         
            int Arr[]= new int[NewArr.length-1];
            for(int i=0,k=0;i<NewArr.length;i++){
                if(NewArr[i]!=X){
                    Arr[k]=NewArr[i];
                    k++;
                }
            }for(int i=0;i<Arr.length;i++){
                System.out.println(Arr[i]);
            }
           
    }
}
