import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal Amount:");
        int amount=sc.nextInt();
        System.out.println("Enter rate of Interest:");
        double r=sc.nextDouble();
        System.out.println("Enter time period:");
        double t=sc.nextDouble();
        double si=(amount*r*t)/100;
        System.out.println("Your simple interest is:"+si);
    }
}
