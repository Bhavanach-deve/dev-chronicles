import java.util.Scanner;

class Calculator{
    public void division(int a, int b){
        try{
            int result=a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
                System.out.println("Please enter a non-zero number");
        }
    }
}
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        Calculator c=new Calculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        System.out.println("Enter the number:");
        int b=sc.nextInt();
        c.division(a,b);

    }
}
