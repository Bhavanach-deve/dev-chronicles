import java.util.*;
class Alpha1 {
    public void calc() throws ArithmeticException {
        System.out.println("Alpha connection established.");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numerator for division:");
            int n = sc.nextInt();
            System.out.println("Enter the denomiator for division");
            int d = sc.nextInt();
            int result = n % d;
            System.out.println("Result is" + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Handled in Alpha only");
            throw e;

        }
        finally
        {
            System.out.println("Alpha connection terminated.");
        }
    }
}
public class EHandler2 {
    public static void main(String[] args) {
        try {
            System.out.println("Main conncetion established");
            Alpha1 a = new Alpha1();
            a.calc();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught by main method");

        }
        System.out.println("main connection terminated");

    }
}

