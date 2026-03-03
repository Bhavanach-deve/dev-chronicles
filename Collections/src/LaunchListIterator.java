import java.util.ArrayList;
import java.util.ListIterator;

public class LaunchListIterator {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(20);
        al.add(12);
        al.add(60);
        al.add(4);
        System.out.println(al);
//        ListIterator litr=al.listIterator();
//        while(litr.hasNext())
//        {
//            System.out.println(litr.next());
//        }
       ListIterator litr=al.listIterator(al.size());
       while(litr.hasPrevious())
       {
           System.out.println(litr.previous());


       }
    }
}
