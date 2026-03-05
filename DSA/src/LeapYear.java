import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year.");
        int a = sc.nextInt();
        if((a%4==0 && a%100!=0)||(a%400==0)){
            System.out.println("Nice! You've got a leap year.");
        } else
        {
            System.out.println("The entered year is not a leap year.");
        }
    }
}
//To check if a year is leap year the year should be perfectly divisible by 4 and "should not" divisible by 100 or Should be divisible by 400.