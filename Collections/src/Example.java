class Employees {
    int id;
    String name;
    Employees(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String toString()
    {
        return "Employee id is" + id + "name is" + name;
    }
}
public class Example {
    public static void main(String[] args) {
        Employees e=new Employees(1,"Bhavana");
        System.out.println(e);
    }
}
