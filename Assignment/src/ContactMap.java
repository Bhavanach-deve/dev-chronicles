import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Contacts{
    String number;
    String name;
    String email;

    public Contacts(String name,String number,String email){
        this.name=name;
        this.number=number;
        this.email=email;
    }
    public String toString(){
        return "Name:"+name+", PhoneNumber:"+number+", Email:"+email;
    }
}

public class ContactMap {
    static HashMap<String, Contacts> cl = new HashMap<>();

    //Add PhoneNumber
    public static void addPhNo(String name, String number, String email) {
        cl.put(name, new Contacts(name, number, email));
        System.out.println("Contact added Successfully");
    }

    public static void getContacts(String name) {
        if (cl.containsKey(name)) {
            System.out.println(cl.get(name));
        } else {
            System.out.println("Contact not found");
        }
    }

    public static void removeContact(String name) {
        if (cl.containsKey(name)) {
            cl.remove(name);
            System.out.println("Contact removed successfully");
        } else {
            System.out.println("Contact not found");
        }
    }

    //Display Details
    public static void displayDetails() {
        if (cl.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }
        for (Map.Entry<String, Contacts> entry : cl.entrySet()) {
            System.out.println(cl);
        }
    }
        public static void main (String[]args)
        {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("1. Add contact details:");
                System.out.println("2. Display Contacts");
                System.out.println("3. View contacts by name:");
                System.out.println("4. Remove Contact Details");
                System.out.println("Enter choice");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        sc.nextLine();

                        System.out.println("Enter Phone Number:");
                        String number = sc.nextLine();

                        System.out.println("Enter email:");
                        String email = sc.nextLine();
                        sc.nextLine();

                        addPhNo(name, number, email);
                        break;

                    case 2:
                        displayDetails();
                        break;

                    case 3:
                        System.out.println("Enter name to search:");
                        String searchName = sc.nextLine();
                        getContacts(searchName);
                        break;

                    default:
                        System.out.println("Invalid choice");

                }

            }


        }
    }