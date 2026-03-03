import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={1,2,3,9,8,7,5};
        int largest=-1;
        int secondLargest=-1;
        int tl=-1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>largest){
//                largest=arr[i];
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>secondLargest && arr[i]!=largest){
//                secondLargest=arr[i];
//            }
//        }
//        System.out.println(secondLargest);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest&&arr[i]>secondLargest){
                secondLargest=arr[i];

            }
            else if(arr[i]<secondLargest && arr[i]>tl){
                tl=arr[i];
            }
        }
        System.out.println(tl);
    }
}
