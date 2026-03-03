import java.util.Date;

public class LaunchDate1 {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        long timeInMs=date.getTime();
        System.out.println(timeInMs);
    }
}
