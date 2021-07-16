

public class Calling_Variables_in_Main {
    int p=5;
    char c='m';
    static int a=10;
    static String s="HAI";
    public static void hello3(){
        System.out.println("in static function hello ");
        }
    public static void welcome3(){
        System.out.println("welcome to static topic");
        
    }
    public static void main(String[] args) {
        Calling_Variables_in_Main obj2=new Calling_Variables_in_Main();
        System.out.println("Static variables");
        System.out.println("a="+a);
        System.out.println("s="+s);
        System.out.println("instance variables");
        System.out.println("p="+obj2.p);
        System.out.println("c="+obj2.c);


    }
    public void prime3(int hi){
        int a=2;
        while(a<hi){
            if(hi%a==0){
                break;
            }
            a++;
        }
        if(a==hi){
            System.out.println("P= "+hi+"is prime");
        }else{
            System.out.println("not prime");
        }
        
    }
    public void Con3(char C){
        int b;
        b=(int)C;
        System.out.println("the Ascii value of "+C+"is"+b);

    }
}
