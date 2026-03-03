import java.security.KeyStore;
import java.sql.SQLOutput;
import java.util.*;

class Passport
{
    private String name;
    private String city;
    private String country;

    public Passport(String name,String city,String country) {
        super();
        this.name=name;
        this.city=city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Passport[" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ']';
    }
}

public class LaunchMap3
{
    public static void main(String[] args)
    {
        Passport pass1=new Passport("Ram","Hyderabad","India");
        Passport pass2=new Passport("HAnuman","Hyderabad","India");
        Passport pass3=new Passport("Ansh","Dubai","UAE");

        Integer id1=Integer.valueOf(101);
        Integer id2=Integer.valueOf(102);
        Integer id3=Integer.valueOf(103);

        HashMap<Integer,Passport>hm=new HashMap<>();
        hm.put(id1,pass1);
        hm.put(id2,pass2);
        hm.put(id3,pass3);
        //System.out.println(hm);
        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly Enter your Passport Number");
        Integer userN=sc.nextInt();

        Set entry=hm.entrySet();
        Boolean flag=false;
        Iterator itr=entry.iterator();
        while(itr.hasNext())
        {
            Map.Entry keyValue=(Map.Entry)itr.next();
            Integer key=(Integer)keyValue.getKey();
            if(userN==key)
            {
                System.out.println("Please find your passport details below");
                System.out.println(keyValue.getValue());
                flag=true;
            }

        }
        if(flag==false)
        {
            System.out.println("Unable to fetch your information based on passport id given");
        }


    }
}
