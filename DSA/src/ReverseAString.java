import java.util.Scanner;

public class ReverseAString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of a String:");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        System.out.println("Reversed String is:");
        for(int i=n-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
