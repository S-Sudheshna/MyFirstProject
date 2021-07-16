package ArrayBasics;
import java.util.Scanner;
public class Specific_value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Specific_value obj= new Specific_value();
        int a,y;
        System.out.println("enter the size of an array");
        a=in.nextInt();
        int n[]=new int[a];
        System.out.println("enter the values of array");
        for(int i=0;i<a;i++){
            n[i]=in.nextInt();
        }
        System.out.println("enter the element to find the index");
        y=in.nextInt();
        in.close();
        obj.Specific(n,y);
    
        }
        public void Specific(int NewArr[],int X){
            boolean b=false;
            int i;
           for( i=0;i<NewArr.length;i++){
               if(NewArr[i]==X){
                   b=true;
                   break;
               }

           }
           if(b==true){
               System.out.println("element found");
           }else{
               System.out.println("element not found");
           }
           
    }
}
