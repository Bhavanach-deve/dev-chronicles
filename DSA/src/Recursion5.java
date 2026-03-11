import java.util.Scanner;

public class Recursion5
{
    public static void increasing(int a)
{
    if(a==0){
        return;
    }
    increasing(a-1);
    System.out.println(a);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find the next natural number:");
        int a=sc.nextInt();
        increasing(a);

    }
}
