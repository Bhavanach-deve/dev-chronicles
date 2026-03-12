class Library implements Runnable
{
    String res1=new String("Java");
    String res2=new String("DSA");
    String res3=new String("SpringBoot");


    public void run()
    {
        String name=Thread.currentThread().getName();
        if(name.equals("s1"))
        {
            try
            {
                System.out.println("Student 1 as entered library");
                Thread.sleep(4000);//Searching for book
                synchronized(res1) //Locking the resources
                {
                    System.out.println("Student1 has acquired resources "+res1);  //After searching it wil search for another resources
                    Thread.sleep(4000); //Will read the resources and release them
                    synchronized(res2)
                    {
                        System.out.println("Student1 has acquired resources "+res2);  //After searching it wil search for another resources
                        Thread.sleep(4000);
                        synchronized (res3) {
                            System.out.println("Student1 has acquired resources " + res3);  //After searching it wil search for another resources
                            Thread.sleep(4000);
                        }
                    }
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();

            }

        } else
        {
            try
            {
                System.out.println("Student 2 as entered library");
                Thread.sleep(4000);//Searching for book
                synchronized(res1) //Locking the resources
                {
                    System.out.println("Student2 has acquired resources "+res1);  //After searching it wil search for another resources
                    Thread.sleep(4000); //Will read the resources and release them
                    synchronized(res2)
                    {
                        System.out.println("Student2 has acquired resources "+res2);  //After searching it wil search for another resources
                        Thread.sleep(4000);
                        synchronized (res3) {
                            System.out.println("Student2 has acquired resources " + res3);  //After searching it wil search for another resources
                            Thread.sleep(4000);
                        }
                    }
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();

            }

        }

    }

}
public class DeadLock
{
    public static void main(String[] args)
    {
        Library lib=new Library();

        Thread t1=new Thread(lib);
        Thread t2=new Thread(lib);

        t1.setName("s1");
        t2.setName("s2");

        t1.start();
        t2.start();
    }
}
