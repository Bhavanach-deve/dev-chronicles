import java.util.*;
class A{
    public void show1() {
        System.out.println("in A show");
    }
}
class B extends A{
    public void show() {
        System.out.println("in B show");
    }
}
class C extends A{
    public void show() {
        System.out.println("in C show");
    }
}
class Main{
    public static void main(String[] args) {
        A obj=new C();
        obj.show1();

    }
}