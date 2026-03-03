import java.util.*;
public class LaunchLinkedList {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add("Java");
        ll.add("Hyd");
        ll.add(20);
        System.out.println(ll);
        ll.addFirst("Jai");
        ll.addLast("Ram");
        ll.add(1,"Shree Ram");
        System.out.println(ll);
        System.out.println(ll.peek());
        System.out.println(ll);
        System.out.println(ll.poll());
        System.out.println(ll);

    }
}
