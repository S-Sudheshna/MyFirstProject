package ArrayBasics;
import java.util.Scanner;
public class Average_of_array_elements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Average_of_array_elements obj= new Average_of_array_elements();
        int a;
        System.out.println("enter the size of an array");
        a=in.nextInt();
        int n[]=new int[a];
        System.out.println("enter the values of array");
        for(int i=0;i<a;i++){
            n[i]=in.nextInt();
        }
        in.close();
        obj.Add(n);
    
        }
        public void Add(int NewArr[]){
            int i=0;
            for(int j=0;j<NewArr.length;j++){
                i=i+NewArr[j];
            }
            System.out.println("sun of integer values in array is"+i);
            System.out.println("sum of integer values in array is"+(i/NewArr.length));
    }
}
