class Animal
{
    public void animalEats(){
        System.out.println("Animal is eating............");
    }
}
class Tiger extends Animal
{
//overriding parent class method to suit child requirement or
    @Override
    public void animalEats()
    {
        System.out.println("Tiger hunts and eat....");
    }
}
public class Annotation1
{
    public static void main(String[] args)
    {
        Tiger t=new Tiger();
        t.animalEats();

    }
}
