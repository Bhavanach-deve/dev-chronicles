import java.util.ArrayList;
import java.util.Iterator;

public class LaunchIterator {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(20);
        al.add(12);
        al.add(60);
        al.add(4);
        System.out.println(al);
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
