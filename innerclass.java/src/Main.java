import java.util.*;
class A{
    int age;
    public void show(){
        System.out.println("Hey");
    }
//    class B{
//        public void config(){
//            System.out.println("Bhavana");
//        }
//    }
}
class innerclass{
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println("JaiShreeRam!");
            }
        };
        obj.show();

    }
}