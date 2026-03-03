class Java{
    Java(){
        System.out.println("Pranam from Constructor.");
    }
    static int a,b,c;
    int x, y,z;
    static{
        System.out.println("Hey, Hi from static Block");
    }
    {
        System.out.println("Namaste from Java initialization Block");
    }
    void displ(){
        x=20;
        y=45;
        z=23;
        a=40;b=2;c=1;
        System.out.println(c+b+x+z+a+y);

    }
}
public class JavaInitializationBlock {
    public static void main(String[] args) {
        Java j=new Java();
        j.displ();
    }
}
