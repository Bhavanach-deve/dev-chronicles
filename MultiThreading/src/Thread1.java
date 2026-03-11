public class Thread1
{
    public static void main(String[] args) throws InterruptedException { //Setting name and priority to a main thread
        System.out.println("Thread concept initialized");
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        Thread.sleep(3000);
        thread.setName("Chilukeshwaram");
        thread.setPriority(3);
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println("Thread concept ended");

    }
}
