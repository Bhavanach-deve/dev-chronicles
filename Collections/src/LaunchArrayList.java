import java.util.*;
public class LaunchArrayList {
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(20.77);
        al.add("Anil");
        al.add('c');
        al.add(true);
        System.out.println(al);

        ArrayList al2=new ArrayList();
        al2.add(10);
        al2.add(20);
        al2.add(1,"Hi");
        System.out.println(al2);
        al2.addAll(al);
        System.out.println(al2);


    }
}
