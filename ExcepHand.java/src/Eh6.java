import java.util.*;
class UnderAgeException extends Exception
{
    public UnderAgeException(String msg)
    {
        super(msg);
    }

}
class OverAgeException extends Exception
{
    public OverAgeException(String msg)
    {
        super(msg);
    }
}
class Applicant
{
    int age;

    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly enter your age");
        age=sc.nextInt();
    }
    public void verify()throws UnderAgeException,OverAgeException
    {
        if(age>=18 && age<=60)
        {
            System.out.println("Proceed with License Application");
        }
        else if (age<18)
        {
            UnderAgeException uae=new UnderAgeException("Have patience kiddo! Your time will come,wait until then.");
            System.out.println(uae.getMessage());
            throw uae;

        }
        else if(age>60)
        {
            OverAgeException oae=new OverAgeException("Rest Please");
            System.out.println(oae.getMessage());
            throw oae;

        }
    }

}
class RTO
{
    public void initiate()
    {
        Applicant app=new Applicant();
        try{
            app.input();
            app.verify();

        }
        catch(UnderAgeException|OverAgeException e)
        {
            System.out.println("Try Again!");

            try{
                app.input();
                app.verify();

            }
            catch(UnderAgeException|OverAgeException ee)
            {
                System.out.println("You are blocked to apply for license due to age related restrictions ");
            }
        }
    }
}
public class Eh6 {
    public static void main(String[] args) {
        System.out.println("License Appication");
        RTO rto=new RTO();
        rto.initiate();

    }
}
