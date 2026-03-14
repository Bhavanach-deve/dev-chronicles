import java.util.Scanner;

class Car {
    String makeAndModel;
    int year;

    void setDetails(String m,int y)
    {
        makeAndModel=m;
        year=y;

    }
    void display(){
        System.out.println("Car Model:"+makeAndModel);
        System.out.println("Year:"+year);
        System.out.println("******************************");
    }

}
public class FourWheeler
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Car c1=new Car();
        System.out.println("Enter Car's make and Model");
        String model1=sc.nextLine();
        System.out.println("Enter year:");
        int year1=sc.nextInt();

        c1.setDetails(model1,year1);
        c1.display();

        Car c2=new Car();
        System.out.println("Enter Car's make and Model:");
        String model2=sc.nextLine();
        System.out.println("Enter year:");
        int year2=sc.nextInt();

        c2.setDetails(model2,year2);
        c2.display();

    }
}
