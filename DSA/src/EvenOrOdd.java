import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Integer number 1");
            int a=sc.nextInt();
            if(a%2==0){
                System.out.println("The entered number is an Even number");
            }
            else{
                System.out.println("The entered number is an Odd number");
            }
        }
    }
