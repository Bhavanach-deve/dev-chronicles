interface Movies1{
    void Hero();
    void Director();
}
interface Series{
    void Thriller();
    void Suspense();
}

class Tollywood1 implements Movies1,Series{
    public void Hero(){
        System.out.println("Mahesh Babu is the superstar");
    }
    public void Director(){
        System.out.println("Rajmouli is the Director of Mahesh Upcoming movie Global Trotter");
    }
    public void Thriller(){
        System.out.println("Sypder is one of the  thriller movies of MB");
    }
    public void Suspense(){
        System.out.println("One is the suspense movies of MB");
    }
}
class Bollywood1 implements Movies1,Series{
    public void Hero(){
        System.out.println("Ranbir Kapoor is from Bollywood");
    }
    public void Director(){
        System.out.println("Om Raut is the Director");
    }
    public void Thriller(){
        System.out.println("Sypder is one of the  thriller movies of MB");
    }
    public void Suspense(){
        System.out.println("One is the suspense movies of MB");
    }
}
class Kollywood1 implements Movies1,Series{
    public void Hero(){
        System.out.println("Rajinikanth is the superstar");
    }
    public void Director(){
        System.out.println("Anil Ravipoodi is the Director");
    }
    public void Thriller(){
        System.out.println("Sypder is one of the  thriller movies of MB");
    }
    public void Suspense(){
        System.out.println("One is the suspense movies of MB");
    }

}
class Genre1{
    public void action(Movies1 m,Series s){
        m.Hero();
        m.Director();
        s.Thriller();
        s.Suspense();

    }
}
public class DoubleInterfaces {
    public static void main(String[] args) {
        Movies1 tolly=new Tollywood1();
        Series s = new Tollywood1();
        Movies1 bolly=new Bollywood1();
        Movies1 kolly=new Kollywood1();
        Genre g1=new Genre();

    }
}
