class Static{
    static int a,b,c; //Static variables
    int x,y,z;  // instance variable.
    static{
        System.out.println("this is a static initialization block");
        a=30;
        b=40;
        c=100;
        }
    static void disp(){
        System.out.println("Hello All");
    }
}
public class Main{
    public static void main(String[] args) {
        Static.disp();

    }
}