package ClassLevelLocking;

public class HSBCBank
{
    static int accountBal=4000;

    synchronized public static void withdrawal(int withdrawal)
    {
        accountBal=accountBal-withdrawal;

    }
    synchronized public static  void deposit(int deposit)
    {
        accountBal=accountBal+deposit;


    }
    synchronized public static void checkBalance()
    {
        System.out.println("The balance in the account is: "+accountBal);

    }


}
