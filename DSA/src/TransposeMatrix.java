import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows");
        int n=sc.nextInt();
        System.out.println("Enter no.of columns");
        int m=sc.nextInt();
        int a[][] = new int[n][m];
        int transpose[][] = new int[m][n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
             transpose[j][i]=a[i][j];
            }
        }
        System.out.println("The transpose of a matrix is");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
