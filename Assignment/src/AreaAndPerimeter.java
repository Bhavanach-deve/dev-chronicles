import java.util.Scanner;

class Shape {

    public void area() {
        System.out.println("Area calculation");
    }

    public void perimeter() {
        System.out.println("Perimeter calculation");
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    public void perimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}

public class AreaAndPerimeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of rectangle:");
        double l = sc.nextDouble();

        System.out.println("Enter width of rectangle:");
        double w = sc.nextDouble();

        Rectangle r = new Rectangle(l, w);
        r.area();
        r.perimeter();

        System.out.println();

        System.out.println("Enter radius of circle:");
        double rad = sc.nextDouble();

        Circle c = new Circle(rad);
        c.area();
        c.perimeter();
    }
}