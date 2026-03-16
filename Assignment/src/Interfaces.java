import java.util.Scanner;

interface Shapes
{
    void area();
    void perimeter();
}

class Square implements Shapes
{
    double side;

    Square(double side)
    {
        this.side = side;
    }

    public void area()
    {
        System.out.println("Area of Square: " + (side * side));
    }

    public void perimeter()
    {
        System.out.println("Perimeter of Square: " + (4 * side));
    }
}

class Triangle implements Shapes
{
    double a, b, c;

    Triangle(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void area()
    {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of Triangle: " + area);
    }

    public void perimeter()
    {
        System.out.println("Perimeter of Triangle: " + (a + b + c));
    }
}

public class Interfaces
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();

        Square sq = new Square(side);
        sq.area();
        sq.perimeter();

        System.out.println();

        System.out.println("Enter sides of triangle:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Triangle t = new Triangle(a, b, c);
        t.area();
        t.perimeter();
    }
}