import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Sorting0s1sInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an Array:");
        int n = sc.nextInt();
        System.out.println("Enter elements 0's and 1's only");
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            if(arr[left]==0){
                left++;
            }
            else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                right--;
            }
        }
        System.out.println("Sorted Array is:");
        for(int sort:arr){
            System.out.print(sort+" ");
        }
    }
}

