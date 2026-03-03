import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Ways to implement and interface 3 ways: implements, "Annonymous inner class" and Lambda expressions.
//class Alphaa implements Comparator<Cricketer>
//{
//    public int compare(Cricketer o1,Cricketer o2)
//    {
//        if(o1.avg>o2.avg)
//            return 1;
//        else
//            return -1;
//    }
//}

class Cricketer
{
    int age;
    String name;
    double avg;

    public Cricketer(int age, String name,double avg) {
        super();
        this.age=age;
        this.name=name;
        this.avg=avg;
    }
    public String toString()
    {
        return "Cricketer[age="+age+", name="+name+", avg="+avg+"]";

    }
}

public class LaunchComplexSoting1
{
    public static void main(String[] args)
    {
        Cricketer c1=new Cricketer(35,"Virat",89.99);
        Cricketer c2=new Cricketer(40,"Dhoni",99.99);
        Cricketer c3=new Cricketer(36,"Rohit",82.99);

        ArrayList<Cricketer>list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);
        //Collections.sort(list);//We get an error here since compiler get's confused based on which I have to sort values?
        //Alphaa a=new Alphaa();
//         Comparator c=new Comparator<Cricketer>()
//        {
//            public int compare(Cricketer o1,Cricketer o2)
//            {
//                if(o1.avg>o2.avg)
//                    return 1;
//                else
//                    return -1;
//            }
//        };
        Comparator<Cricketer>c=(Cricketer o1,Cricketer o2)->{
            {if(o1.avg>o2.avg)
                    return 1;
                else
                    return -1;}

        };
        Collections.sort(list,c);//How to sort the info is there inside Alphaa class go take it and sort.
        System.out.println(list);


    }
}
