import java.util.*;
public class Main{
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1,0,1,0,1,1,1,0};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]==0){
                left++;
            }
            else if(arr[right]==1) {
                right--;
            }
            else{
                int swap=arr[left];
                arr[left]=arr[right];
                arr[right]=swap;

                left++;
                right--;

            }
        }
        for(int array:arr){
            System.out.print(array + " ");
        }
    }
}