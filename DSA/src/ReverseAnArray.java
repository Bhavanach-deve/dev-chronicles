import java.util.*;
class Reverse{
    void reverse(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int n= sc.nextInt();
        System.out.println("Enter the numbers to be reversed");
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int right=arr.length-1;
        int left=0;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            right--;
            left++;

        }
        System.out.println("Reversed Array is:");
        for(int rev:arr){
            System.out.print(rev+" ");
        }
    }
}
public class ReverseAnArray
{
    public static void main(String[] args)
    {
        Reverse r=new Reverse();
        r.reverse();

    }
}
