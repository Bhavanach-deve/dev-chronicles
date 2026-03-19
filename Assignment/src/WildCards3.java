import java.util.Arrays;
import java.util.List;

public class WildCards3
{
    public static double sum(List<? extends Number> list){
        double total=0;

        for(Number num:list){
            total=total+num.doubleValue();
        }
        return total;
    }

    public static void main(String[] args)
    {
        List<Integer>intList= Arrays.asList(10,20,30);
        List<Double>doubleList=Arrays.asList(1.5,2.5,3.5);

        System.out.println("Sum of Integer:"+sum(intList));
        System.out.println("Sum of Doubles:"+sum(doubleList));

    }
}
