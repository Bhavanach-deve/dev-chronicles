import java.util.Scanner;

class Minimum{
    void min()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int n= sc.nextInt();
        System.out.println("Enter the elements");
        int []arr=new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];

        for(int i=0;i<n;i++)
        {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min+" is the minimum value of an array");

    }
}
public class MinElementOfAnArray
{
    public static void main(String[] args)
    {
        Minimum m=new Minimum();
        m.min();

    }
}
