
public class Calling_Static_in_Instance {
    int p=5;
    char c='h';
    static int a=7;
    static String s="welcome to static function";
    public static void hello2(){
        System.out.println("in static function hello ");
        Calling_Static_in_Instance obj=new Calling_Static_in_Instance();
        System.out.println("printng instance variables in static methods c =" +obj.c);
        System.out.println();
        
        
    }
    public static void welcome2(){
        System.out.println();
        System.out.println("welcome to static topic");
        Calling_Static_in_Instance k = new Calling_Static_in_Instance();
        System.out.println("printing  instance variables in static methods p =" +k.p);
        
        
    }
    public static void main(String[] args) {
        Calling_Static_in_Instance obj = new Calling_Static_in_Instance();
        obj.prime2(a);
         obj.Con2(s);
    }
    public void prime2(int hi){
        int a=2;
        while(a<hi){
            if(hi%a==0){
                break;
            }
            a++;
        }
        if(a==hi){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        System.out.println("calling a Static function from instance function");
        hello2();
        
    }
    public void Con2(String C){
        System.out.println("calling this function from static function and printing static variable   "+C );
        System.out.print("calling static function welcome frm instance function ");
        welcome2();
    }

}
