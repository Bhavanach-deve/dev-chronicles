import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LaunchNewDateAndTimeAPI
{
    public static void main(String[] args)
    {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfYear());
        System.out.println("*****************************");
        LocalDate dob=LocalDate.of(2002,06,24);
        System.out.println(dob);
        System.out.println("******************************");
        LocalTime time=LocalTime.now();
        System.out.println(time);
        System.out.println("*******************************");
        LocalDateTime timeDate= LocalDateTime.now();
        System.out.println(timeDate);

    }
}
