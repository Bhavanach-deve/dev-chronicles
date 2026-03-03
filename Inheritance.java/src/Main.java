class Grand {
    public Grand() {
            System.out.println("GrandParents");
        }
    }
class Parents extends Grand
{
        int x=10;
        int y=20;

        void disp(){
            System.out.println("Parents");
        }
}
//class Children extends Parents{
//        void disp(){
//            String name="Bhavana & Aryan";
//            System.out.println("Children are"+ " "+ name);
//        }
//}

public class Main{
    public static void main(String[] args) {
        Parents p = new Parents();
        p.disp();
    }
}