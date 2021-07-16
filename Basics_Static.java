
public class Basics_Static {
    int p=5;
    char c='m';
    static int a=10;
    static String s="HAI";
    public static void hello(){
        System.out.println("in static function hello ");
        }
    public static void welcome(){
        System.out.println("welcome to static topic");
        
    }
    public static void main(String[] args) {
         Basics_Static obj2=new Basics_Static();
        hello();
        welcome();
        obj2.prime(obj2.p);
        obj2.Con(obj2.c);
        }
    public void prime(int hi){
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
    public void Con(char C){
        int b;
        b=(int)C;
        System.out.println("the Ascii value of "+C+"is"+b);

    }
}
