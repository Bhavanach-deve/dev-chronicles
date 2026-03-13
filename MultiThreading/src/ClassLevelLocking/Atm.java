package ClassLevelLocking;

public class Atm extends Thread
{

    @Override
    public void run()
    {
        System.out.println("Withdrawal");
        HSBCBank.withdrawal(400);

    }

}
//We cannot use inheritance here to call the methods as it is already extending threads clas
//We cannot use composition as it will make the classes tightly coupled.
//Hence we use Association