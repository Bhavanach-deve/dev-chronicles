import java.util.ArrayList;
import java.util.Scanner;

class Library {

    ArrayList<String> books = new ArrayList<>();

    // Add book
    void addBook(String book) {
        books.add(book);
        System.out.println(book + " added to library.");
    }

    // Display books
    void displayBooks() {
        System.out.println("\nAvailable Books:");
        for(String book : books){
            System.out.println(book);
        }
    }

    // Checkout book
    void checkoutBook(String book) {
        if(books.contains(book)){
            books.remove(book);
            System.out.println(book + " has been issued.");
        } else {
            System.out.println("Book not available.");
        }
    }

    // Return book
    void returnBook(String book) {
        books.add(book);
        System.out.println(book + " returned to library.");
    }
}

public class CollageLibrary {

    public static void main(String[] args) {

        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\n------ Library Menu ------");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Checkout Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    System.out.println("Enter book name:");
                    String book = sc.nextLine();
                    lib.addBook(book);
                    break;

                case 2:
                    lib.displayBooks();
                    break;

                case 3:
                    System.out.println("Enter book to checkout:");
                    String issue = sc.nextLine();
                    lib.checkoutBook(issue);
                    break;

                case 4:
                    System.out.println("Enter book to return:");
                    String ret = sc.nextLine();
                    lib.returnBook(ret);
                    break;

                case 5:
                    System.out.println("Exiting Library System...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}