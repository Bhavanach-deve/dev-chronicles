import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number:");
        int z = sc.nextInt();
        int div=2;
        while(div<=z-1) {
            if (z % div == 0) {
                System.out.println(z+" is not a prime number.");
                return;
            }
            div = div + 1;
        }
            System.out.println(z+" is a prime number!");
        }
    }
