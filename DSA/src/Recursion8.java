import java.util.*;
public class Recursion8
{
    public static int rob(int[] arr,int index)
    {
        if(index>=arr.length) return 0;
        return Math.max(arr[index]+rob(arr,index+2),0+rob(arr,index+1));

    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,1};
        System.out.println(rob(arr,0));

    }
}
