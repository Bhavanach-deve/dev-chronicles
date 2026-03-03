package service;

public class DevOps implements ICourses{
    public Boolean getTheCourse(Double amount){
        System.out.println("DevOps course purchased and the price paid is"+ amount);
        return true;

    }
}