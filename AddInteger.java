
import java.util.Scanner;
public class AddInteger {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    AddInteger obj= new AddInteger();
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
        System.out.println("sum of integer values in array is"+i);
    }
}
