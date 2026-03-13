package ClassLevelLocking;

public class PhonePay extends Thread {
    private HSBCBank bank;
    public PhonePay(HSBCBank bank){
        this.bank=bank;
    }

    @Override
    public void run()
    {
        System.out.println("Balance check");
        HSBCBank.checkBalance();

    }

}

