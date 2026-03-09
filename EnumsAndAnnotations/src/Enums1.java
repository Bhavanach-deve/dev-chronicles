enum Week{
    MON, TUES, WED, THURS, FRI, SAT, SUN
}
public class Enums1 {
    public static void main(String[] args)
    {
        Week week=Week.THURS;
        System.out.println(week);
        int index= Week.THURS.ordinal();
        System.out.println(index);
        Week[] days=Week.values();
        for(Week w:days){
            System.out.println(w.ordinal()+"-"+w);
        }

    }
}
