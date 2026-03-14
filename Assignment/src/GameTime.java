import java.util.Random;
import java.util.Scanner;

public class GameTime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int num=random.nextInt(50)+1;//Random number between 1-100
        int chances=5;
        int guess;
        System.out.println("Welcome to number guessing game:");
        System.out.println("Guess the number between 1 to 51");
        System.out.println("You have "+chances+" chances");

        for(int i=0;i<=chances;i++){
            System.out.println("Enter your guess:");
            guess=sc.nextInt();

            if(guess==num){
                System.out.println("Hurray! You guessed the number!");
                System.out.println("You guess the number in "+i+" attempts");
                return;
            }
            if(guess>num)
            {
                System.out.println("Hint: Number is lower");
            }
            else
            {
                System.out.println("Hint number is Higher");
            }

            System.out.println("Remaining chances "+(chances-i));

        }
        System.out.println("Game Over!");
        System.out.println("The correct number is "+num);
    }

}
