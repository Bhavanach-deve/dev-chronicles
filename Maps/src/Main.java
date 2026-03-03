//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.HashMap;
class Telusko
{
    private Integer id;
    private String courseName;
}



public class Main {
    public static void main(String[] args)
    {
        HashMap h=new HashMap();
        //put method checks if the data is there it will add data if and only if there is no data.
        //do we have something that can add to your MAP based on index based adding in it the answer is no.
        // We have a key and value.Object type of key object type of value.
        h.put(1,"Java");
        h.put(2,"Springboot");
        h.put(3,"Microservices");
        System.out.println(h);
    }
}
