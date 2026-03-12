class Cooking implements Runnable
{
    @Override
    synchronized public void run(){
        try
        {
            System.out.println(Thread.currentThread().getName()+" has entered into the Kitchen");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+" has put on the stove.");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+" has started cooking while cutting vegetables");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+" has finished cooking and went back to room to take some rest!");
        }
        catch(Exception e)
        {
            e.printStackTrace();

        }
    }


}
public class SynchronizedThread
{
    public static void main(String[] args)
    {
        Cooking cook1=new Cooking();
        Thread t1=new Thread(cook1);
        Thread t2=new Thread(cook1);
        Thread t3=new Thread(cook1);

        t1.setName("Bhavana");
        t2.setName("Vani");
        t3.setName("Veena");

        t1.start();
        t2.start();
        t3.start();


    }
}
