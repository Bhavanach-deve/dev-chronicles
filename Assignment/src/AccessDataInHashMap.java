import java.util.*;

public class AccessDataInHashMap
{
    public static void main(String[] args)
    {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1,"Bhavana");//Key and value= Entry-->Inner interface of Map Interface.
        hm.put(2,"Aryan");
        hm.put(3,"Vani");
        hm.put(4,"Anil");
        System.out.println(hm);//Printing the map.
        //How do we access?
        String data=hm.get(3);
        System.out.println(data);//Accessing only single type of Data
        System.out.println("I want to access everything. For that use collectio if you are using collection iterator can be used to access elements");
        Collection<String> values=hm.values();
        Iterator<String> itr=values.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("****************");
        Set<Integer> keys=hm.keySet();
        Iterator<Integer> itr1=keys.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("***********************");
        System.out.println("To access both values and Keys together");
        Set entry=hm.entrySet();
        Iterator itr3=entry.iterator();
        while(itr3.hasNext()){
            Map.Entry pair=(Map.Entry)itr3.next();
            System.out.println("Key "+pair.getKey()+"Value: "+pair.getValue());
        }
    }
}
