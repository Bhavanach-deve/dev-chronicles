import java.util.Scanner;

public class Recursion4
{
    public static int natural(int a){
        if(a==0)
        {
            return 1;
        }
        System.out.println(a);
        return natural(a-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println(natural(a));
    }
}
