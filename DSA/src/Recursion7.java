import java.util.Scanner;

public class Recursion7
{
    public static void array(int[]arr,int index){
        if(index>=arr.length)
            return;
        System.out.print(arr[index]+" ");
        array(arr,index+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of an Array:");
        int l=sc.nextInt();
        int[]arr=new int[l];
        System.out.println("Enter elements:");
        for(int i = 0; i < l; i++)
        {
            arr[i] = sc.nextInt();
        }

        array(arr, 0);
    }
}
