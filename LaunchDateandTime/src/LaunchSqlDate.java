import java.sql.Date;

public class LaunchSqlDate {
    public static void main(String[] args)
    {
        long timeInMs=1771665194088L;
        Date date=new Date(timeInMs);
        System.out.println(date);

    }
}
