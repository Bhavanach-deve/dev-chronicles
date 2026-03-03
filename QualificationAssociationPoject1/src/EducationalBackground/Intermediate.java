package EducationalBackground;

public class Intermediate implements AcademicHistory
{
    public Boolean getTheAggregate(Double cgpa){
        cgpa=9.25;
        System.out.println("I secured"+" " +cgpa+" " + "in My State Board of Intermediate Education");
        return true;
    }
}
