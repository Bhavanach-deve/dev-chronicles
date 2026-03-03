import java.util.*;
class Farmer{
    static float roi;
    static
    {
        roi=2.1f;
    }
    {
        float pa;
        float td;
        float si;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pa");
        pa = sc.nextFloat();
        System.out.println("Enter the td");
        td = sc.nextFloat();
        si=(pa*td*roi)/100;
        System.out.println("The Simple interest is"+ si);
    }
}
public class Emmploye{
    public static void main(String[] args) {
        Farmer f1=new Farmer();
        Farmer f2=new Farmer();
        Farmer f3=new Farmer();


    }
}
