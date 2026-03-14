import java.util.Scanner;

public class BasicCalculator
{
    public static void add(int a,int b)
    {
        System.out.println("The addition of two number is: "+(a+b));
        System.out.println("*************************************");
    }
    public static void sub(int a,int b)
    {
        System.out.println("The subtraction of two number is: "+(a-b));
        System.out.println("*************************************");

    }
    public static void mul(int a,int b)
    {
        System.out.println("The product of two number is: "+(a*b));
        System.out.println("*************************************");

    }
    public static void division(int a,int b)
    {
        if (b != 0)
            System.out.println("The quotient of two number when performed division is: "+ (a/b));
        else
            System.out.println("Division not possible (divide by zero)");
        System.out.println("*************************************");
    }
    public static void remainder(int a,int b)
    {
        System.out.println("The remainder of two number when performed division is: "+(a%b));
        System.out.println("*************************************");
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b=sc.nextInt();
        add(a,b);
        sub(a,b);
        mul(a,b);
        division(a,b);
        remainder(a,b);
    }
}
