
public class Instance_Static {
    int p=5;
    char c='h';
    static int a=7;
    static String s="HAI";
    public static void hello4(){
        System.out.println("in static function hello ");
        Instance_Static obj=new Instance_Static();
        System.out.println("printng instance variables in static methods c =" +obj.c);
        System.out.println();
        
    }
    public static void welcome4(){
        System.out.println();
        System.out.println("welcome to static topic");
        Instance_Static k = new Instance_Static();
        System.out.println("printing  instance variables in static methods p =" +k.p);
        
        
    }
    public static void main(String[] args) {
        hello4();
        welcome4();
    }
    public void prime4(int hi){
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
        
    }
    public void Con4(char C){
        int b;
        b=(int)C;
        System.out.println("the Ascii value of "+C+"is"+b);

    }
}
