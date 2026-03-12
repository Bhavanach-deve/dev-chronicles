import java.util.Scanner;
class Tas implements Runnable{
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
class Tas1 implements Runnable
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
class Tas2 implements Runnable{
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
public class CreatingOurOwnThreads1
{
    public static void main(String[] args)
    {
        System.out.println("Application Started");
        Tas t1=new Tas();
        Tas1 t2=new Tas1();
        Tas2 t3=new Tas2();

        Thread thread1=new Thread(t1); //Task is there inside the
        Thread thread2=new Thread(t2); //run() method
        Thread thread3=new Thread(t3); //which is defined by tas, tas1, tas2 whose addresses are t1,t2,t3
//They don't have any life till now to give them life call or invoke the start( ) method.
        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Application Terminated");

    }

}
