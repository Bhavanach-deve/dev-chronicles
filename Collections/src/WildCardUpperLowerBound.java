import java.util.ArrayList;
import java.util.*;
class Human
{
    int age;
    public void disp()
    {
        System.out.println("Hey All");
    }
}
class Student extends Human
{

}
class Employeee
{

}
public class WildCardUpperLowerBound
{
    public static void main(String[] args) {
//         Object obj=new Object();
//         String s=new String("Ram");
//
//         obj=s;
        // s=obj;->not possible error
        Human h = new Human();
        Student s = new Student();
        h = s;
        //s=h;--not possible compile time error/Downcasting
//
//        ArrayList<Human> hlist1=new ArrayList<>();
//        ArrayList<Student> slist1=new ArrayList<>();
        //hlist1=slist1;--> compile time error. collection of child inside a parent is not allowed.

//        ArrayList<?> hlist2=new ArrayList<>();//Unkown type wild card
//        ArrayList<Student> slist2=new ArrayList<>();
//        hlist2=slist2;//no error parent is not known.

//        ArrayList<? extends Human> hlist3=new ArrayList<>();//UpperBound: Either it should be of human type or it should of child of human nothing apart frpm that.
//        ArrayList<Student> slist3=new ArrayList<>();
//        hlist3=slist3;//slist3 is getting added to human list 3

//        ArrayList<? super Human> hlist3 = new ArrayList<>();//Either Human or Parent of Human.
//        ArrayList<Student> slist3 = new ArrayList<>(); //Either parent or parent of Parent.
//        ArrayList<Object> olist3 = new ArrayList<>();

        //hlist3=olist3; //olist3 is getting added to human list.


//        ArrayList<Human>hlist=new ArrayList<Human>();
//        hlist.add(new Human());
//        hlist.add(new Human());
//        hlist.add(new Human());
//        invokeDisp(hlist);

//        ArrayList<Student>slist=new ArrayList<>();
//        slist.add(new Student());
//        slist.add(new Student());
//        slist.add(new Student());
//        invokeDisp(slist);

    }

//        public static void invokeDisp(List<? extends Human> list) //THIS IS EXPECTING A COLLECTION OF HUMAN OR ANY CHILD OR HUMAN
      public static void invokeDisp(List<Human> list) //THIS IS EXPECTING A COLLECTION OF HUMAN Only

{
//            for(Human h:list)
//            {
//                System.out.println(h);
//            }
//
    }










    }
