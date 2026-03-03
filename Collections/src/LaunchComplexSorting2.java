import java.util.ArrayList;
import java.util.Collections;

class Cricketers implements Comparable<Cricketers>
{
    int age;
    String name;
    double avg;

    public Cricketers(int age, String name,double avg) {
        super();
        this.age=age;
        this.name=name;
        this.avg=avg;
    }
    public String toString()
    {
        return "Cricketers[age="+age+", name="+name+", avg="+avg+"]";

    }
    @Override
    public int compareTo(Cricketers o)
    {
        if(this.avg>o.avg)
            return 1;
        else
            return -1;
    }
}
public class LaunchComplexSorting2
{
    public static void main(String[] args)
    {
        Cricketers c1=new Cricketers(35,"Virat",89.99);
        Cricketers c2=new Cricketers(40,"Dhoni",99.99);
        Cricketers c3=new Cricketers(36,"Rohit",82.99);

        ArrayList<Cricketers> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }

}
