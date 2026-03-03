class Dog{
    private String breed;
    private String name;
    private int num;
    public Dog(String breed, String name, int num){
        this.breed=breed;
        this.name=name;
        this.num=num;

    }
    String getBreed(){
        return breed;
    }
    String getName(){
        return name;
    }
    int getNum(){
        return num;
    }
}
public class Main {
    public static void main(String[] args) {
        Dog d=new Dog("Labrador","Sugar",1);
        System.out.println(d.getBreed());
        System.out.println(d.getName());
        System.out.println(d.getName());
    }
}
