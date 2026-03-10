import java.util.Scanner;

public class Recursion2
{
    public static void num(int n,int i){
        if(i>10)
            return;
            System.out.println(n+"x"+i+"="+(n*i));
            num(n,i+1);
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        num(n,1);
    }
}
