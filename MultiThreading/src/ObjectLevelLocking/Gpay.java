package ObjectLevelLocking;

public class Gpay extends Thread {
        private HSBCBank bank;
        public Gpay(HSBCBank bank)
        {
            this.bank=bank;

        }

        @Override
        public void run()
        {
            System.out.println("Deposit");
            bank.deposit(10000);

        }

    }
