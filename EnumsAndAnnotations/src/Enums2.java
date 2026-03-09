enum Gender{
    MALE, FEMALE;

    String genders;

    Gender()
    {
        System.out.println("Constructor of Enum");
    }
    public void setGenders(String genders)
    {
        this.genders=genders;
    }
    public String getGenders()
    {
        return genders;
    }
}
public class Enums2
{
    public static void main(String[] args)
    {
        Gender gen=Gender.FEMALE;
        gen.setGenders("Girl");
        System.out.println(gen.getGenders());

        Gender.MALE.setGenders("Boy");
        String gen1=Gender.MALE.getGenders();
        System.out.println(gen1);

    }

}
