import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIForEach
{
    public static void main(String[] args)
    {
        List<Integer> l=new ArrayList<>();

        l.add(15);
        l.add(7);
        l.add(81);
        l.add(60);
        l.add(100);
        System.out.println(l);
//        Collections.sort(l);
//        System.out.println(l);

        Stream<Integer> streamData1=l.stream(); //Creating the Stream of the data so that my original data won't change.
        Stream<Integer> streamData2=streamData1.sorted();
        streamData2.forEach(n-> System.out.println(n));
        System.out.println(l);


    }
}
