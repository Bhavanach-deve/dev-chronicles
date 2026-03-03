import java.util.TreeSet;

public class LaunchTreeSet {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(1);
        ts.add(25);
        ts.add(50);
        ts.add(100);
        System.out.println(ts);
        System.out.println(ts.ceiling(45));
        System.out.println(ts.higher(50));
        System.out.println(ts.floor(45));
        System.out.println(ts.lower(30));
    }
}
