import java.util.ArrayList;

class Employee
{
    private Integer id;
    private String name;
    private String city;

    public Employee(Integer id,String name, String city) {
        this.id = id;
        this.name=name;
        this.city=city;
    }

    @Override
    public String toString() {
        return "Employee[id=" +id+",name="+name+",city="+city+"]";
    }
}
public class GenericsTypeSafety {
    public static void main(String[] args)
    {
        ArrayList<Employee> employee=new ArrayList<>();
        employee.add(new Employee(1,"Bhavana","Hyd"));
        employee.add(new Employee(2,"Aryan","Hyd"));
        employee.add(new Employee(3,"Anil","Hyd"));
        for(Employee e: employee)
        {
            System.out.println(e);
        }

    }
}
