class Difference{
    int num1=1,num2=2;
    Difference(){
        super();
        System.out.println("This is zero parameterized constructor");
    }
    Difference(int num1){
        System.out.println("This is 1 parameterized constructor");
    }
    Difference(int num1, int num2){
        this();
        this.num1=num1;
        this.num2=num2;
        System.out.println("This is a 2 parameterized constructor");
    }
    void disp( )

    {
        System.out.println("num1" + " " +num1);
        System.out.println("num2" + " " +num2);

    }
}
public class DiffSupThis {
    public static void main(String[] args) {
        Difference d =new Difference(50,20);
        d.disp();
    }
}
