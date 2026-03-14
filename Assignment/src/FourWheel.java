import javax.sql.rowset.CachedRowSet;
import java.util.Scanner;

class Cars
{
    String makeAndModel;
    int year;

    Cars(String m,int y){
        this.makeAndModel=m;
        this.year=y;
    }
    void display(){
        System.out.println("The Make & model:"+makeAndModel);
        System.out.println("The year is:"+year);
        System.out.println("******************************************");
    }

}
public class FourWheel
{
    public static void main(String[] args)
    {
        Cars c1=new Cars("Rolls Royce Phantom",2020);
        Cars c2=new Cars("Tata Nexon",2024);

        c1.display();
        c2.display();



    }
}
