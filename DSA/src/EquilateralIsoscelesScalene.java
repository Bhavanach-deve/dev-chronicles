import java.util.Scanner;

public class EquilateralIsoscelesScalene
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side angle 1:");
        int a=sc.nextInt();
        System.out.println("Enter side angle 2:");
        int b=sc.nextInt();
        System.out.println("Enter side angle 3:");
        int c=sc.nextInt();
        if(a==b && b==c && c==a)
        {
            System.out.println("It's an Equilateral Triangle");
        }
        else if((a==b|| b==c || c==a))
        {
            System.out.println("It is an Isosceles Triangle");
        } else if(a!=b && b!=c && c!=a)
        {
            System.out.println("It is a Scalene Triangle");
        }
        else{
            System.out.println("Enter a valid condition");
        }
    }
}
