import java.util.*;

public class FindIndex
{
    public static int findIndex(int arr[],int k){
    for(int i=0;i<arr.length;i++) {
        if (arr[i] == k) {
            return i+1;
        }
    }
    return -1;
}
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of elements in an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to search:");
        int k=sc.nextInt();

        int index= FindIndex.findIndex(arr,k);
        if(index!=-1)
            System.out.println("element found at index "+index);
        else
            System.out.println("element not found");

    }
}