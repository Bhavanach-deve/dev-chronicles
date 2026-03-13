class Producer extends Thread
{
//dependecny Injection
    Queue q;
    int i=1;

    public Producer(Queue q)
    {
        this.q=q;

    }

    public void run()
    {
        while (true) {
            q.produce(i++);
        }
    }


}

class Consumer extends Thread
{
    Queue q;
    int i=1;

    public Consumer(Queue q)
    {
        this.q=q;

    }
    public void run() {
        while (true) {
            q.consume();
        }
    }
}
class Queue
{
    int data;
    boolean indicator=false; //default value of flag
    synchronized public void produce(int i)
    {
        try
        {
            if(indicator==true)
            {
                System.out.println("Producer is in wait state");
                wait();

            }
            else {
                data = i;
                System.out.println("I have Produced Data" + data);
                indicator=true;
                notify();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    synchronized public void consume()
    {
        try {
            if (indicator==false)
            {
                System.out.println("Consumer is in wait state");
                wait();

            } else {
                System.out.println("I have Consumed Data" + data);
                indicator=false;
                notify();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
public class InterThreadCommunication
{
    public static void main(String[] args)
    {
        Queue q=new Queue();

//        Producer prod=new Producer(q);
//        Consumer c=new Consumer(q);
//
//        prod.start();
//        c.start();

//Anonymous class
        new Producer(q).start();
        new Consumer(q).start();
    }
}
