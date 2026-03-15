import java.util.Scanner;

class Employee {

    private String name;
    private double hoursWorked;
    private double hourlyRate;
    private double overtimeRate;

    // Constructor
    public Employee(String name, double hoursWorked, double hourlyRate, double overtimeRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.overtimeRate = overtimeRate;
    }

    // Method to calculate salary
    public double calculateSalary() {

        double salary;

        if (hoursWorked <= 8) {
            salary = hoursWorked * hourlyRate;
        }
        else {
            double regularPay = 8 * hourlyRate;
            double overtime = (hoursWorked - 8) * overtimeRate;
            salary = regularPay + overtime;
        }

        return salary;
    }

    // Display employee payroll
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Payroll: " + calculateSalary());
    }
}

public class PayRoll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name:");
        String name = sc.nextLine();

        System.out.println("Enter hours worked:");
        double hours = sc.nextDouble();

        System.out.println("Enter hourly rate:");
        double rate = sc.nextDouble();

        System.out.println("Enter overtime rate:");
        double overtime = sc.nextDouble();

        Employee e1 = new Employee(name, hours, rate, overtime);

        e1.display();
    }
}