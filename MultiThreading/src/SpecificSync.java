class Cook implements Runnable
{
    @Override
    public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + " has entered into the Kitchen");
            Thread.sleep(4000);
            synchronized(this){
                System.out.println(Thread.currentThread().getName() + " has put on the stove.");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " has started cooking while cutting vegetables");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " has finished cooking and went back to room to take some rest!");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();

        }
    }


}
public class SpecificSync
{
    public static void main(String[] args)
    {
        Cook cook1=new Cook();
        Thread th1=new Thread(cook1);
        Thread th2=new Thread(cook1);
        Thread th3=new Thread(cook1);

        th1.setName("Bhavana");
        th2.setName("Vani");
        th3.setName("Veena");

        th1.start();
        th2.start();
        th3.start();


    }
}
