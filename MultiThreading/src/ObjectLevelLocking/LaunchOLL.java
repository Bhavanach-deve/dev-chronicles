package ObjectLevelLocking;

public class LaunchOLL
{
    static void main(String[] args)
    {
        HSBCBank bank1=new HSBCBank(5000);

        Atm atm=new Atm(bank1);
        atm.setName("ATM Thread");

        Gpay pay=new Gpay(bank1);
        pay.setName("GPAY Thread");

        PhonePay ppay=new PhonePay(bank1);
        ppay.setName("PhonePay Thread");

        atm.start();
        pay.start();
        ppay.start();



    }
}

