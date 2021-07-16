package ArrayBasics;
import java.util.Scanner;
public class Index_of_Element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Index_of_Element obj= new Index_of_Element();
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
        obj.In_dex(n,y);
    
        }
        public void In_dex(int NewArr[],int X){
            boolean b=false;
            int i;
           for( i=0;i<NewArr.length;i++){
               if(NewArr[i]==X){
                   b=true;
                   break;
               }

           }
           if(b==true){
               System.out.println(i+" is the index of" +X);
           }else{
               System.out.println("element not found");
           }
           
            
    }
}
