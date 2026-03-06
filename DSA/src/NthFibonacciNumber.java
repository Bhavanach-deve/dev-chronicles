import java.util.Scanner;

public class NthFibonacciNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check its nth Fibonacci number.");
        int n=sc.nextInt();
        int prev=0;
        int curr=1;
        int next=0;
        if(n==0){
            System.out.println("Fibonacci number at position " + n + " is " + prev);
        }
        else if(n==1){
            System.out.println("Fibonacci number at position " + n + " is " +curr);
        }
        else {
            for (int i = 2; i < n; i++) {
                next = prev + curr;
                prev = curr;
                curr = next;
            }
            System.out.println("Fibonacci number at position " + n + " is " + curr);
        }
    }
}
