import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Student class
class Student
{
    int id;
    String name;
    int age;
    String grade;

    Student(int id, String name, int age, String grade)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString()
    {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

// Main class
public class CollectionHashMap
{
    static HashMap<Integer, Student> map = new HashMap<>();

    // Add student
    public static void addStudent(Student s)
    {
        map.put(s.id,s);
        System.out.println("Student added successfully.");
    }

    // Display all students
    public static void displayStudents()
    {
        if(map.isEmpty())
        {
            System.out.println("No records found.");
            return;
        }

        for(Map.Entry<Integer, Student> entry : map.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }

    // Update student
    public static void updateStudent(int id, String name, int age, String grade)
    {
        if(map.containsKey(id))
        {
            map.put(id, new Student(id, name, age, grade));
            System.out.println("Student updated successfully.");
        }
        else
        {
            System.out.println("Student not found.");
        }
    }

    // Remove student
    public static void removeStudent(int id)
    {
        if(map.containsKey(id))
        {
            map.remove(id);
            System.out.println("Student removed successfully.");
        }
        else
        {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    addStudent(new Student(id, name, age, grade));
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new Name: ");
                    String uname = sc.nextLine();

                    System.out.print("Enter new Age: ");
                    int uage = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new Grade: ");
                    String ugrade = sc.nextLine();

                    updateStudent(uid, uname, uage, ugrade);
                    break;

                case 4:
                    System.out.print("Enter ID to remove: ");
                    int rid = sc.nextInt();
                    removeStudent(rid);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
