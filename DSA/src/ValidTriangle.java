import java.util.*;
public class ValidTriangle {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st angle");
        a=sc.nextInt();
        System.out.println("Enter the 2nd angle");
        b=sc.nextInt();
        System.out.println("Enter the 3rd angle");
        c=sc.nextInt();
        int sumOfAllSidesOfATriangle=a+b+c;
        if(sumOfAllSidesOfATriangle==180 && a>0 && b>0 &&c>0){
            System.out.println("The entered triangle forms a Valid Triangle");
        }
        else{
            System.out.println("Triangle cannot be formed with the entered values");
        }

    }
}
//To form a vaild triangle the sum of the sides =180 and each of the side is greater than 0(a>0)