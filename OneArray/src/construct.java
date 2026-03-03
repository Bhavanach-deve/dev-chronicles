class Dog{
    private String breed;
    private String name;
    private int num;
    public Dog(String breed, String name, int num){
        this.breed=breed;
        this.name=name;
        this.num=num;

    }
}
public class construct {
    public static void main(String[] args) {
        Dog d=new Dog("Labrador","Sugar",1);
        System.out.println(d);
    }
}
