import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Profession //Creating your own Annotation type
{
    String stream();
    int years();

}
@Profession(stream="Electronics and Communication Engineering",years=4)
class Engineer
{
    private int semesters;

    public int getSemesters() {
        return semesters;
    }

    public void setSemesters(int semesters) {
        this.semesters = semesters;
    }

    public Engineer()
    {

    }
}
public class Annotation2
{
    public static void main(String[] args)
    {
        Engineer e=new Engineer();
        e.setSemesters(8);
        System.out.println(e.getSemesters());

    }
}
