import java.util.Scanner;

public class MatrixMultiplication
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows of 1st matrix");
        int r1=sc.nextInt();
        System.out.println("Enter no.of columns of 1st matrix");
        int c1=sc.nextInt();
        System.out.println("Enter no.of rows of 2nd matrix");
        int r2=sc.nextInt();
        System.out.println("Enter no.of rows of 2nd matrix");
        int c2=sc.nextInt();
        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int result[][] = new int[r1][c2];

        if(c1!=r2) {
            System.out.println("Matrix multiplication not possible");
        }
        System.out.println("Enter elements of 1st matrix:");

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of 2nd matrix");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    result[i][j]=result[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


    }
}
