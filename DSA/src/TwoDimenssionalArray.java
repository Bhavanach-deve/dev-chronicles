import java.util.Scanner;

public class TwoDimenssionalArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter no.of columns:");
        int col=sc.nextInt();
        int arr[][]=new int[rows][col];
        System.out.println("Enter elements");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix elements are:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
