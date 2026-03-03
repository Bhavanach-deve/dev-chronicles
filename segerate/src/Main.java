import java.sql.SQLOutput;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        int arr[]={0,0,0,1,0,1,0,1,1,1};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            arr[i]=0;
            System.out.print(arr[i]+" ");
        }
        System.out.println("There are "+count +" "+"no.of 0's" );
        for(int i=count;i<arr.length;i++) {
            arr[i] = 1;
            System.out.print(arr[i]+" ");
        }
        System.out.println(count +" "+ "of 1's");

    }
}