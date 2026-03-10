import java.util.Scanner;

public class Recursion1 {
    public static int recursion (int n){
        if (n==1){
            return 1;
        }
        return n * recursion(n-1);

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find it's factorial:");
        int n=sc.nextInt();
        System.out.println("The factorial of entered number is: "+recursion(n));

    }
}
