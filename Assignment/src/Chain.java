class Productss {

    private String name;
    private int quantity;
    private double price;

    // Default constructor
    Productss() {
        name = "Unknown";
        quantity = 0;
        price = 0;
    }

    // Constructor with 2 parameters
    Productss(String name, int quantity) {
        this(name, quantity, 110);
    }

    // Constructor with all parameters
    Productss(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Method to calculate total amount
    public double amount() {
        return quantity * price;
    }

    // Method to display details
    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total Amount: " + amount());
        System.out.println("-------------------------");
    }
}

public class Chain {

    public static void main(String[] args) {

        Productss p1 = new Productss("ToorDaal", 2);
        Productss p2 = new Productss("Pulses", 3, 95);
        Productss p3 = new Productss();

        p1.display();
        p2.display();
        p3.display();
    }
}