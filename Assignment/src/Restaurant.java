import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Menu{
    String dishes;
    String prices;

    public Menu(String dishes,String prices){
        this.dishes=dishes;
        this.prices=prices;
    }
    public String toString(){
        return "Dish:"+dishes+"| Price:"+prices;
    }

}

public class Restaurant
{
    static HashMap<String,Menu>menu=new HashMap<>();

    public static void addDishes(Menu m){
        menu.put(m.dishes,m);
        System.out.println("Dishes added successfully");
    }
    public static void displayMenu()
    {
        if(menu.isEmpty())
        {
            System.out.println("No dishes yet.");
            return;
        }

//        for(Map.Entry<String, Menu> entry : menu.entrySet())
//        {
//            System.out.println(entry.getValue());
//        }
        for(Menu m:menu.values()){
            System.out.println(m);
        }
    }

    public static void updateDishes(String dishes,String prices)
    {
        if(menu.containsKey(dishes))
        {
            menu.put(dishes, new Menu(dishes,prices));
            System.out.println("Price updated successfully.");
        }
        else
        {
            System.out.println("Dish not found.");
        }
    }
//Remove dishes
    public static void removeDish(String dishes)
    {
        if(menu.containsKey(dishes))
        {
            menu.remove(dishes);
            System.out.println("Dish removed successfully.");
        }
        else
        {
            System.out.println("Dish not found.");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1. Display Menu:");
            System.out.println("2. Add new Dish:");
            System.out.println("3. Update prices:");
            System.out.println("4. Remove the dish:");
            System.out.println("5. Exit");

            System.out.println("Enter the choice:");
            int choice=sc.nextInt();
            sc.nextLine();


            switch(choice)
            {
                case 1:
                    displayMenu();
                    break;
                case 2:
                    System.out.println("Enter the name of the Dish:");
                    String dish=sc.nextLine();

                    System.out.println("Enter the price of the Dish:");
                    String rate=sc.nextLine();

                    addDishes(new Menu(dish,rate));
                    break;

                case 3:
                    System.out.println("Enter Dish name:");
                    String uprice=sc.nextLine();

                    System.out.println("Enter new price of the dish:");
                    String udish=sc.nextLine();

                    updateDishes(udish,uprice);
                    break;

                case 4:
                    System.out.println("Enter the Dish name to be removed:");
                    String rDish=sc.nextLine();
                    removeDish(rDish);
                    break;

                case 5:
                        System.out.println("Exiting");
                        return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
