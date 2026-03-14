import java.util.Scanner;

public class Palindromes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String to check if it is a palindrome:");
        String s=sc.nextLine();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                System.out.println(s+" is not a palindrome");
                break;
            }
            left++;
            right--;
        }
        System.out.println(s+" is a palindrome!");
    }
}
