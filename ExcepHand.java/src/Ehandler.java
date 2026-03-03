import java.util.*;
class Alpha{
    public void calc(){
        try{
            System.out.println("Alpha connection established.");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numerator for division:");
            int n = sc.nextInt();
            System.out.println("Enter the denomiator for division");
            int d = sc.nextInt();
            int result = n % d;
            System.out.println("Result is" + result);
            System.out.println("Alpha connection terminated.");
        }
        catch(Exception e){
            System.out.println("Please enter non-zero number");
            calc();

        }
    }

}
class Beta{
    public void disp(){
        Alpha a=new Alpha();
        System.out.println("Beta Connection Established");
        a.calc();
        System.out.println("Beta Connection Terminated");
    }
}
public class Ehandler {
    public static void main(String[] args) {
        Beta b = new Beta();
        System.out.println("Main connection established");
        b.disp();
        System.out.println("Main connection Terminated.");
    }
}
