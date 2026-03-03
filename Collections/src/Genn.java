import java.util.*;

public class Genn {
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        List<Integer> ll=new LinkedList<>();
        Set<Integer>t=new TreeSet<>();

    }
    public static Iterable<Integer>getIntegers()//Iterable is the parent of all the collection hence you can  call any collection
    {
        return new TreeSet<Integer>();
    }
    public static List<Integer>getInteger() //Only it's class and child of it's class are called.
    {
        return new ArrayList<Integer>();
    }
}
