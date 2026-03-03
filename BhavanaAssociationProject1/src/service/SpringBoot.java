package service;

public class SpringBoot implements ICourses{
    public Boolean getTheCourse(Double amount){
        System.out.println("SpringBoot course purchased and the price paid is"+ amount);
        return true;

    }
}
