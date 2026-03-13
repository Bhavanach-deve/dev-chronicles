package ClassLevelLocking;

public class LaunchOLL
{
    static void main(String[] args)
    {
        HSBCBank bank1=new HSBCBank();
        HSBCBank b2=new HSBCBank();

        Atm atm=new Atm();
        atm.setName("ATM Thread");

        Gpay pay=new Gpay();
        pay.setName("GPAY Thread");

        PhonePay ppay=new PhonePay(b2);
        ppay.setName("PhonePay Thread");

        atm.start();
        pay.start();
        ppay.start();



    }
}

