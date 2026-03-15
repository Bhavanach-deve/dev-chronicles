class Product {
    String name;
    float quantity;
    double price;

    public Product(String name, float quantity) {
        this.name = name;
        this.quantity = quantity;
        System.out.println("Name of the product is:" + name + "Quantity you have selected is" + quantity);
    }

    public Product(float quantity, String name) {
        this.quantity = quantity;
        this.name = name;
        System.out.println("The Quantity of the product is" + quantity+"Name of the product is: "+ name);
    }
    public double amount(){
        price=quantity*110;
        return price;
    }
}


public class Constructors
{
    public static void main(String[] args)
    {
        Product p1=new Product("ToorDaal",2.2f);
        System.out.println("The amount to be paid is"+p1.amount());

        Product p2=new Product(3.5f,"Pulses");
        System.out.println("The amount to be paid is"+p2.amount());

    }

}
