class Person
{
    private String name;
    private int age;
    private int id;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class Human
{
    public static void main(String[] args)
    {
        Person p=new Person();
        p.setName("Bhavana");
        p.setAge(22);
        p.setId(5013);
        System.out.println(p.getName());
        System.out.println(p.getId());
        System.out.println(p.getAge());
    }
}
