import java.util.Scanner;

    class Tasks1 extends Thread{
        @Override
        public void run(){
            results();
        }
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
    class Tasks2 extends Thread
    {
        @Override
        public void run(){
            try
            {
                salutations();
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
        public void salutations() throws InterruptedException {
            System.out.println("Printing Salutations Started!");
            for(int i=0;i<4;i++) {
                System.out.println("Hey Java Developers!");
                Thread.sleep(3000);
            }
            System.out.println("Printing Salutations ended!");

        }
    }
    class Tasks3 extends Thread{
        @Override
        public void run(){
            try {
                quotes();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        public void quotes() throws InterruptedException {
            System.out.println("Printing quote Started!");
            for (int i = 0; i < 4; i++) {
                System.out.println("Life is manifestation of where your energy is flowing....");
                Thread.sleep(3000);
            }
            System.out.println("Printing quote ended!");
        }
    }
public class CreatingOurOwnThreads     //Extending one predefined class called Thread class
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Application Started");


        Tasks1 t1=new Tasks1();  //You have created
        Tasks2 t2=new Tasks2();  // new
        Tasks3 t3=new Tasks3();  //Threads

        t1.start();   // Giving
        t2.start();   // Life to
        t3.start();  // The Threads

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Application Terminated");

    }

}
//It will make sure one thing CPU's time will not get wasted!