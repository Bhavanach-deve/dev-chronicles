import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollections1
{
    public static void main(String[] args)
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(100);
        list.add(299);
        list.add(400);
        list.add(50);
        list.add(24);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<String>list2=new ArrayList<>();
        list2.add("Jai");
        list2.add("Shree");
        list2.add("Ram");
        list2.add("Hanuman Chants");
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);




    }
}
