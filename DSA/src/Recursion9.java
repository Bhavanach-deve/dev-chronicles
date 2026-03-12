import org.w3c.dom.ls.LSOutput;

public class Recursion9
{
    public static void g(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print("*");
        g(n-1);
    }
    public static void f(int n, int stars){
        if(n<=0) return;
        g(stars);
        System.out.println();
        f(n-1,stars);
    }
    public static void main(String[] args) {
        f(5,5);
    }
}
