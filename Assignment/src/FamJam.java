import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class FamMem
{
    String name;
    String members;
    String place;

    public FamMem(String name,String members,String place){
        this.name=name;
        this.members=members;
        this.place=place;
    }

    public String toString(){
        return "Head of the Family Name:"+name+", Members of the family:"+members+", Place they reside in:"+place;
}

}
public class FamJam {
    static HashMap<String, FamMem> fh = new HashMap<>();

    public static void addMem(FamMem fm) {
        fh.put(fm.name, fm);
        System.out.println("Family Details added successfully");
    }

    // Display Family members
    public static void displayMem() {
        if (fh.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for (Map.Entry<String, FamMem> entry : fh.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void updateMembers(String name, String members, String city) {
        if (fh.containsKey(name)) {
            fh.put(name, new FamMem(name, members, city));
            System.out.println("Family Member updated successfully.");
        } else {
            System.out.println("Member not found.");
        }
    }

    public static void searchFamily(String name)
    {
        if (fh.containsKey(name))
        {
            System.out.println(fh.get(name));
        }
        else
        {
            System.out.println("Family not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("1. Add Family Member:");
            System.out.println("2. Display Family members:");
            System.out.println("3. Update Family Members:");
            System.out.println("4. Members present in a Family:");


            System.out.println("Enter choice:");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Head of the Family Member name:");
                    String name=sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter members in a family");
                    String members=sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter where does the Family resides:");
                    String city=sc.nextLine();
                    sc.nextLine();

                    addMem(new FamMem(name,members,city));
                    break;

                case 2:
                    displayMem();
                    break;

                case 3:
                    System.out.println("Enter Family member name to be updated");
                    String names=sc.nextLine();
                    System.out.println("Enter Family member current number");
                    String member=sc.nextLine();
                    System.out.println("Enter Family member resident city");
                    String citys=sc.nextLine();
                    updateMembers(names,member,citys);

                case 4:
                    System.out.println("Enter Family name to search:");
                    sc.nextLine();
                    String search = sc.nextLine();
                    searchFamily(search);
                    break;

                default:
                    System.out.println("Wrong choice");
                    break;


            }
        }
    }
}