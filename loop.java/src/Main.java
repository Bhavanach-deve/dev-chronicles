import java.util.*;
public class Main{
    public static void main(String[] args) {
        //int arr[][]=new int[4][5];
        int arr[][]=new int[3][];
        arr[0]=new int[4];
        arr[1]=new int[5];
        arr[2]=new int[2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Kindly enter the class marks"+ i + "Student" + j);
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
                System.out.println();
            }
        }

    }