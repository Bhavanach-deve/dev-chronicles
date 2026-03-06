import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int digits = 0;

        int temp = num;

        // Count digits
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;

        // Armstrong logic
        while (temp != 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 0; i < digits; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }
    }
}