import java.util.Scanner;

public class ReverseAGivenNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int a= sc.nextInt();
        //int n=1234;
        int ans=0;
        while(a>0)
        {
            int rem=a%10;
            ans=ans*10+rem;
            a=a/10;
        }
        System.out.println("The reversed number is"+ans);

    }
}
