package ClassLevelLocking;

public class Gpay extends Thread {


        @Override
        public void run()
        {
            System.out.println("Deposit");
            HSBCBank.deposit(10000);

        }

    }
