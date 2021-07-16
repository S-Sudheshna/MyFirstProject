public class Calling_instance_in_Static {
    int p=5;
    char c='h';
    static int a=7;
    static String s="HAI";
    public static void hello1(){
        System.out.println("in static function hello ");
        Calling_instance_in_Static obj=new Calling_instance_in_Static();
        System.out.println("printng instance variables in static methods c =" +obj.c);
        System.out.println();
        obj.prime1(7);
        
    }
    public static void welcome1(){
        System.out.println();
        System.out.println("welcome to static topic");
        Calling_instance_in_Static k = new Calling_instance_in_Static();
        System.out.println("printing  instance variables in static methods p =" +k.p);
        k.Con1(s);
        
        
    }
    public static void main(String[] args) {
        hello1();
        welcome1();
    }
    public void prime1(int hi){
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
    public void Con1(String C){
        System.out.println("calling this function from static function and printing static variable   "+C );

    }

}
