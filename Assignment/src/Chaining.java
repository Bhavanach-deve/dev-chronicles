class Products{
    private String name;
    private float quantity;
    private double price;

    public Products(String name,float quantity){
        this(name,quantity,110);

    }
    public Products(String name,float quantity,double price){
        this.name=name;
        this.quantity=quantity;
        this.price=price;

    }
    public double amount(){
        return quantity*price;
    }
    public void display(){
        System.out.println("Product name:"+name);
        System.out.println("Quantity:"+quantity);
        System.out.println("Price per unit:"+price);
    }
}

public class Chaining
{
    public static void main(String[] args)
    {

        Products p1 = new Products("ToorDaal", 2.2f);
        p1.display();
        System.out.println("Amount to be paid: " + p1.amount());

        System.out.println();

        Products p2 = new Products("Pulses", 3.5f, 95);
        p2.display();
        System.out.println("Amount to be paid: " + p2.amount());

    }
}
