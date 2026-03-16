abstract class BankAccount{
    double balance;
    abstract void deposit(double amount);
    abstract void withdrawal(double amount);
    abstract void displayBalance();
}
class SavingsAccount extends BankAccount{
    public void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("Deposited in Savings Account:"+amount);

    }
    public void withdrawal(double amount)
    {
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Withdrawn from Savings Account"+amount);
        }
        else {
            System.out.println("Insufficient Balance");
        }

    }
    void displayBalance()
    {
        System.out.println("Savings Account Balance:"+balance);

    }
}
class CheckingAccount extends BankAccount{
    public void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("Deposited in Checking Account:"+amount);

    }
    void withdrawal(double amount)
    {
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Withdrawn from Savings Account"+amount);
        }
        else {
            System.out.println("Insufficient Balance");
        }

    }
    void displayBalance()
    {
        System.out.println("Checking account balance"+balance);

    }
}


public class Banks {
    public static void main(String[] args)
    {
        SavingsAccount s=new SavingsAccount();
        s.deposit(5000);
        s.withdrawal(10000);
        s.displayBalance();

        System.out.println();

        CheckingAccount c=new CheckingAccount();
        c.deposit(2000);
        c.withdrawal(1000);
        c.displayBalance();

    }
}
