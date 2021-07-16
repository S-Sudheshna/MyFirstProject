package StaticBasics;
public class Static_in_Instance {
    int p=5;
    char c='h';
    static int a=7;
    static String s="HAI";
    public static void hello5(){
        System.out.println("in static function hello ");
        Static_in_Instance obj=new Static_in_Instance();
        System.out.println("printng instance variables in static methods c =" +obj.c);
        System.out.println();
        
    }
    public static void welcome5(){
        System.out.println();
        System.out.println("welcome to static topic");
        Static_in_Instance k = new Static_in_Instance();
        System.out.println("printing  instance variables in static methods p =" +k.p);
        
        
    }
    public static void main(String[] args) {
        Static_in_Instance obj=new Static_in_Instance();
         hello5();
         welcome5();
         obj.prime5(a);
         obj.Con5(s);
     }  
     public void prime5(int hi){
         System.out.println();
        int a=2;
        while(a<hi){
            if(hi%a==0){
                break;
            }
            a++;
        }
        if(a==hi){
            System.out.println("static variable  " +a+ " is a prime number");
        }else{
            System.out.println("not prime");
        }
        
    }
    public void Con5(String C){
        System.out.println();
        System.out.println("printing the static variable in non static method   "+C);

    }
}
