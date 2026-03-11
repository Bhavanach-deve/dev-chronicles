import java.util.Scanner;

class Task1{
    public void results(){
        System.out.println("Results declaration started!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Roll.No:");
        int r=sc.nextInt();
        System.out.println("Enter your Name:");
        String name=sc.next();
        System.out.println("Here are your Results:");
        System.out.println("Results declaration ended!");
    }

}
class Task2
{
    public void salutations() throws InterruptedException {
        System.out.println("Printing Salutations Started!");
        for(int i=0;i<4;i++) {
            System.out.println("Hey Java Developers!");
            Thread.sleep(3000);
        }
        System.out.println("Printing Salutations ended!");

    }

}
class Task3{
    public void quotes() throws InterruptedException {
        System.out.println("Printing quote Started!");
        for (int i = 0; i < 4; i++) {
            System.out.println("Life is manifestation of where your energy is flowing....");
            Thread.sleep(3000);
        }
        System.out.println("Printing quote ended!");
    }
}

public class Thread2
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Application initialized");
        Task1 t1=new Task1();
        Task2 t2=new Task2();
        Task3 t3=new Task3();




        System.out.println("Application ended!");

    }
}
//CPU Time is getting wasted when the user doesn't provide the required information.