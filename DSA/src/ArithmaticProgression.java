import java.util.*;
public class ArithmaticProgression{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        int sum = (n * (2 * a + (n - 1) * d)) / 2;

        System.out.println("Sum of AP = " + sum);
    }
}
