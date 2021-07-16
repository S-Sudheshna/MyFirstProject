public class Operators_functions {
    public void add(int a, int b){
        int sum=a+b;
        System.out.println("1. sum of two integers is "+sum);
    }
    public void sub(int a, int b){
        int diff=a-b;
        System.out.println("2. difference between two numbers is"+diff);
    }
    public void multi(int a, int b){
        int mul=a*b;
        System.out.println("3. the multipication of two numbers is "+mul);
    }
    public void division(int a, int b){
        int div=a/b;
        System.out.println("4. the division of two numbers is "+div);
    }
    public void modulo(int a, int b){
        int mod=a%b;
        System.out.println("5. the modolus of two numnbers is "+mod);
    }
    public void Increment(int a,int b){
        int c;
        System.out.println("*. before incrementing a="+a);
        c=a++;
        System.out.println("*. and assiging a value to c="+c);
        System.out.println("6. the preincrement is"+ ++b);
        System.out.println("7. the postincrement is"+a);
    }
    public void decrement(int a,int b){
        int c;
        System.out.println("*. before decrementing a="+a);
        c=a--;
        System.out.println("*. and assiging a value to c="+c);
        System.out.println("8. the predecrement is"+ --b);
        System.out.println("9. the postdecrement is"+a);
    }
    public static void main(String[] args) {
        int a=20,b=10;
        Operators_functions d=new Operators_functions();
        d.add(a,b);
        d.sub(a, b);
        d.multi(a, b);
        d.modulo(a, b);
        d.division(a, b);
        d.Increment(a, b);
        d.decrement(a, b);
    }

    
}
