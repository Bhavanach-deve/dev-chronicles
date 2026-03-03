package service;

public class Java implements ICourses{
    public Boolean getTheCourse(Double amount){
        System.out.println("Java course purchased and the price paid is"+ amount);
        return true;

    }
}
