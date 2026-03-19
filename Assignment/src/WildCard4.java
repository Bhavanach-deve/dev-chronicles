import java.util.ArrayList;
import java.util.List;

public class WildCard4
{
    public static void addNumbers(List<? super Integer> list){
        list.add(10);
        list.add(20);
        list.add(45);

        System.out.println("Numbers Added:"+list);
    }
    public static void main(String[] args) {

        List<Number>numList=new ArrayList<>();
        System.out.println("Before Adding:"+numList);
        addNumbers(numList);
        System.out.println("After adding:"+numList);

    }
}
