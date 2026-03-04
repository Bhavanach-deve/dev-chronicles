interface Payable{
    double calculateSalary();
}
class Company{
    static String companyName="Google";
    static void companyInfo(){
        System.out.println("Welcome to"+ companyName);
    }
}
class Employe extends Company{
    int empId;
    String name;
    Employe(){
        this(0,"Unknown");
        System.out.println("Default employee created");
    }
    Employe(int empID,String name){
        this.empId=empId;
        this.name=name;
        System.out.println("Employee Parameterized Constructor");
    }
    void disp(){
        System.out.println("ID: "+ empId);
        System.out.println("Name: "+ name);
    }
}
class Developer extends Employe implements Payable {
    double baseSalary;
    double bonus;

    Developer(int empId, String name, double baseSalary, double bonus) {
        super(empId, name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        System.out.println("Developer constructor called")
    }
    public double calculateSalary() {
        return baseSalary+bonus;
    }
    void role(){
        System.out.println("Role:Developer");
    }
}
class Manager extends Employee implements Payable{
    double salary;
    Manager(int empId,String name,double salary){
        super(empId, name);
        this.salary=salary;
        System.out.println("Manager Constructor called");
    }
    public double calculateSalary(){
        return salary;
    }
    void role(){
        System.out.println("Role: Manager");
    }
}

public class Employee{
    public static void main(String[] args) {
        Company.companyInfo();
        Developer dev=new Developer(101,"Bhavana",800000,200000);
        dev.disp();
        dev.role();
        System.out.println("Salary"+dev.calculateSalary());
        System.out.println("------------------");

        Manager mgr = new Manager(201, "Aryan", 1200000);
        mgr.display();
        mgr.role();
        System.out.println("Salary: " + mgr.calculateSalary());
}

}