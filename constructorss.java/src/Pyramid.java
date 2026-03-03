public class Pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int num=i;
            for(int s=1;s<=i;s++){
                System.out.print(num++ + " ");
            }
            num=num-2;
            for(int s=1;s<i;s++){
                System.out.print(num-- + " ");
            }
            System.out.println();
        }
    }
}
