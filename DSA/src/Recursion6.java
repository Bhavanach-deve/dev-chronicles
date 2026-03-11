import java.util.Scanner;

public class Recursion6
{
    public static int fibonacci(int n)
    {
        if(n==0||n==1)
        return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        fibonacci(n);
        System.out.println(fibonacci(n));


    }
}
