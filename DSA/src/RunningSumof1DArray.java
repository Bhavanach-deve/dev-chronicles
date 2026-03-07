import java.util.Scanner;

public class RunningSumof1DArray
{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Elements");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements to find their running sum");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        System.out.println("Running Sum Array:");
        for(int nums: arr){
            System.out.println(nums+" ");
        }

    }
}
