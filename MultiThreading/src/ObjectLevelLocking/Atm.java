package ObjectLevelLocking;

public class Atm extends Thread
{
    private HSBCBank bank;
    public Atm(HSBCBank bank)
    {
        this.bank=bank;

    }

    @Override
    public void run()
    {
        System.out.println("Withdrawal");
        bank.withdrawal(400);

    }

}
//We cannot use inheritance here to call the methods as it is already extending threads clas
//We cannot use composition as it will make the classes tightly coupled.
//Hence we use Association