import java.util.Scanner;

public class DayOfTheWeek
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7 to check the day of the week:");
        int a = sc.nextInt();
        switch(a){
            case 1: a=1;
                System.out.println("Monday");
                break;
            case 2: a=2;
                System.out.println("Tuesday");
                break;
            case 3: a=3;
                System.out.println("Wednesday");
                break;
            case 4: a=4;
                System.out.println("Thursday");
                break;
            case 5: a=5;
                System.out.println("Friday");
                break;
            case 6: a=6;
                System.out.println("Saturday");
                break;
            case 7: a=7;
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Oops! the range exceeds");


        }

    }
}
