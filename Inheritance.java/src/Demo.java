class Alpha{
    int a,b,c;
    public Alpha(){
        a=10;
        b=20;
        c=30;
        System.out.println("This is a Alpha zero parameterized constructor");
    }
    public Alpha(int a , int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("This is alphaameterized");
    }
}
class Beta extends Alpha
{
    int x,y;
    public Beta(){
        this(2,20);
        x=1;
        y=2;
        System.out.println("This is Beta zero-");
    }
    public Beta(int x , int y)
    {
        super(1,2,4);
        this.x = x;
         this.y=y;
        System.out.println("This is a Beta parameterized");
    }
    public void disp(){
        System.out.println("a is:" + a);
        System.out.println("b is:" + b);
        System.out.println("c is:" + c);
        System.out.println("x is:" + x);
        System.out.println("y is:" + y);



    }
}
public class Demo {
    public static void main(String[] args) {
        Beta b=new Beta(3,2);
        b.disp();
        Beta b1=new Beta();
        b.disp();
    }
}
