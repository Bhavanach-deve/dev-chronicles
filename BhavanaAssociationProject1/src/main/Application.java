package main;
import service.Java;
import service.SpringBoot;

public class Application {
    public static void main(String[] args) {

        Bhavana bhavs = new Bhavana(new SpringBoot());
//        bhavs.setCourse(new Java());

        Boolean status = bhavs.buyTheCourse(2501.0);
        if (status)
            System.out.println("Course Purchase successfully");
        else
            System.out.println("Failed to purchase the course");
    }
}
