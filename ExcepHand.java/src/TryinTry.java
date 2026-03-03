import java.util.*;
class A{
    public void calc(){
        try{
            int a= 20;
            int b=2;
            int result= a/b;
            System.out.println(result);
            try{
                int c= 20;
                int e=0;
                int results= c/e;
                System.out.println("please enter non-zero");

            }
            catch(ArithmeticException e){
                System.out.println("enter non-zero");
            }
            System.out.println("After catch");
        }
        catch(Exception e){
            System.out.println(" General");
        }
        finally{
            System.out.println("Inside outer finally");
        }
    }
}
public class TryinTry {
    public static void main(String[] args) {
        A a=new A();
        a.calc();
    }
}
