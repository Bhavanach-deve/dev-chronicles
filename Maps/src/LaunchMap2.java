import java.util.*;

interface Alpha
{
    interface Beta
    {
        static void disp(){
            System.out.println("Static method of an inner interface");
        }
    }
}
public class LaunchMap2
{
    public static void main(String[] args)
    {
        //Alpha.Beta.disp();
        HashMap<Integer,String> hm1=new HashMap<>();
        hm1.put(1,"java");//Entry---> It is the inner interface of the Map interface.
        hm1.put(2,"Microservices");
        hm1.put(3,"CoreJava");
        hm1.put(4,"logic");
        hm1.put(5,"Syntax");
        System.out.println(hm1);//printing the values of Map
        String data=hm1.get(3);//Accessing single-data
        System.out.println(data);
        System.out.println("*******************Now I wnat to access every data");
        Collection<String>values=hm1.values();//As values can be on any type that's why we have return type as Collection
        Iterator<String>it=values.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("*********");
        Set<Integer> keys=hm1.keySet();
        Iterator<Integer>itr=keys.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("*****");
        Set entry=hm1.entrySet();
        Iterator itr3=entry.iterator();
        while(itr3.hasNext())
        {
            Map.Entry pair=(Map.Entry) itr3.next();
            System.out.println("Key:"+pair.getKey()+"Values:"+pair.getValue());
        }




    }
}
