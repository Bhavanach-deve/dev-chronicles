import java.util.*;
abstract class A{
    public abstract void show();
    public abstract void age();
}
class abs{
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println("My age is 22");
            }
            public void age(){
                System.out.println("Hi");
            }
        };
        obj.show();
        obj.age();

        }
    }