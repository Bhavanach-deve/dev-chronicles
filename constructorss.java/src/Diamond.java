//import java.util.*;
//public class Diamond {
//    public static void main(String[] args) {
//        int arr[] = {3,3,1,1,3,2,2,2,2,1};
//        int n = arr.length;
//        Arrays.sort(arr);
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i]==1) {
//                count++;
//            }
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println("There are" +" "+ count + " no.of 1's");
//        count = 0;
//        for(int j=0;j<n;j++){
//            if(arr[j]==2){
//                count++;
//            }
//        }
//        System.out.println("There are" +" "+ count + " no.of 2's");
//        count = 0;
//        for(int s=0;s<n;s++){
//            if(arr[s]==3){
//                count++;
//            }
//        }
//        System.out.println("There are" +" "+ count + " no.of 3's");
//    }
//
//}
import java.util.*;
public class Diamond{
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,2,3};
        int count1=0;
        int count2=0;
        int count3=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)count1++;
            else if(arr[i]==2)count2++;
            else if(arr[i]==3)count3++;
            System.out.print(arr[i]+ " " );

        }
        System.out.println();
        System.out.println("1's are" + count1);
        System.out.println("2's are" + count2);
        System.out.println("3's are" + count3);
    }
}