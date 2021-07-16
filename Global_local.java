public class Global_local {
    float a = 1;
    public void my_test(){
        float a=77;
        System.out.println("thi is a local variable of my_test() a="+a);
    }  
    void setup() {
        // Local variable called b. 
        // This variable can't be accessed in other functions.
        float a = 2;
        
        System.out.println("this is a local variable of setup() a="+a);
        my_test();
      }
    public static void main(String[] args) {
        // Global variable
Global_local b=new Global_local();
b.my_test();
System.out.println("this is a global variable a="+b.a);
b.setup();


    }
    
}
