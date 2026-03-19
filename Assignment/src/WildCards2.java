import java.util.*;
public class WildCards2
{
    public static void displayList(List<?>list){
        System.out.println("Displaying List Contents:");

        for(Object obj:list){
            System.out.println(obj);
        }

        System.out.println("--------------");
    }

    public static void main(String[] args)
    {
        List<Integer>intList=Arrays.asList(10,20,3,0);
        List<Double>doubleList=Arrays.asList(1.2,2.3,3.9,45.5);
        List<String>stringList=Arrays.asList("WildCards");

        displayList(intList);
        displayList(stringList);
        displayList(doubleList);



    }

}
