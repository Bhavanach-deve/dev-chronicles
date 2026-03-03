import java.util.*;
class Alphaa {
    public void calc() throws ArithmeticException {
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
}
public class ThrowsDucking {
    public static void main(String[] args) {
        try {
            System.out.println("Main conncetion established");
            Alphaa a = new Alphaa();
            a.calc();
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught at main method");
        }
        System.out.println("main connection terminated");

    }
}
