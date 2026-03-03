interface Movies{
    void Hero();
    void Director();
}
class Tollywood implements Movies{
    public void Hero(){
        System.out.println("Mahesh is the superstar");
    }
    public void Director(){
        System.out.println("Rajmouli is the Director of Mahesh Upcoming movie Global Trotter");
    }
}
class Bollywood implements Movies{
    public void Hero(){
        System.out.println("Ranbir Kapoor is from Bollywood");
    }
    public void Director(){
        System.out.println("Om Raut is the Director");
    }
}
class Kollywood implements Movies{
    public void Hero(){
        System.out.println("Rajinikanth is the superstar");
    }
    public void Director(){
        System.out.println("Anil Ravipoodi is the Director");
    }

}
class Genre{
    public void action(Movies m){
        m.Hero();
        m.Director();
    }
}
public class InTerFace {
    public static void main(String[] args) {
        Movies tolly=new Tollywood();
        Movies bolly=new Bollywood();
        Movies kolly=new Kollywood();
        Genre g=new Genre();
        g.action(tolly);
        g.action(kolly);
        g.action(bolly);

    }
}
