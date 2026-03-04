interface Doctor{
    void appointment();
}
class Avail
{
    static String doctorName="Bhavana";
    static void doctorInfo()
    {
        System.out.println("Doctor Name is " + doctorName +" Dermatologist");
    }
}
class Patient extends Avail{
    String name;
    int age;
    Patient()
    {
        System.out.println("Default patient created");
    }
    public Patient(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println("This is a parameterized constructor");
    }
    void present(){
        System.out.println("age is "+age);
        System.out.println("name is "+ name);
    }
}
class Checkup extends Patient implements Doctor{
    int fee;
    Checkup(int age, String name,int fee){
        super(age,name);
        this.fee=fee;
        System.out.println("Check-up for the month!");
    }
    public void appointment(){
        System.out.println("Please pay the fee for the month to avail checkup which is "+fee);

    }
}
class Medical extends Patient implements Doctor{
    String medicine;
    Medical(int age,String name,int fee){
        super(age,name);
        this.medicine=medicine;
        System.out.println("You avail fee medical expenses for the month sponsered by the Dr."+doctorName);
    }
    public void appointment(){
        System.out.println("Disclaimer Medications only for skin-related issues");
    }
}
public class Hospital
{
    public  static void main(String args[])
    {
        Avail.doctorInfo();
        Checkup c=new Checkup(45,"Vani",500);
        c.appointment();
        Medical m=new Medical(45,"Vani",500);
        m.appointment();

    }
}
