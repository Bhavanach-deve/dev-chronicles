import java.util.*;
class InvalidCustomerException extends Exception
{
    public InvalidCustomerException(String msg)
    {
        super(msg);
    }

}
class Atm
{
    private int acc=4545;
    private int pw=1234;

    int accountNo;
    int password;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Account Number");
        accountNo=sc.nextInt();
        System.out.println("Enter the password");
        password=sc.nextInt();

    }
    public void verify() throws InvalidCustomerException
    {
        if (acc == accountNo && pw == password) {
            System.out.println("You can Withdraw the amount ");
        }
        else
        {
           InvalidCustomerException ice=new InvalidCustomerException("Invalid Credentials!");
            System.out.println(ice.getMessage());
           throw ice;
            //throw new InvalidCustomerException("Invalid Credentials!");
        }
    }
}
class Bank {
    public void initiate() {
        Atm atm = new Atm();
        try {
            atm.input();
            atm.verify();
        }
        catch(InvalidCustomerException ice)
        {
            System.out.println("try again ");
            try {
                atm.input();
                atm.verify();
            }
            catch(InvalidCustomerException ice2)
            {
                System.out.println("You have one more chance please enter details correctly");
                try {
                    atm.input();
                    atm.verify();
                }
                catch(InvalidCustomerException ice3)
                {
                    System.out.println("You are a legend cannot be given any more chances");

                }

            }

        }
    }

}
public class LaunchEh5 {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.initiate();
    }
}
