import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

class Television{
    public void display()
    {
        System.out.println("HD Display");
    }
    public void smart(){
        System.out.println("SmartTV");
    }
}
class Sony extends Television
{
    public void display()
    {
        System.out.println("HD view");
    }
    public void inches(){
        System.out.println("Available in varied inches");
    }
}
class VideoCon{
}
public class WildCards
{
    public static void main(String[] args)
    {
        ArrayList<? super Sony>tv=new ArrayList<>();
        tv.add(new Sony());
        tv.add(new Sony());


    }
}
