package EducationalBackground;

public class BacheloreOfEngineering implements AcademicHistory
{
    public Boolean getTheAggregate(Double cgpa){
        cgpa=8.04;
        System.out.println("I secured"+" " +cgpa+" " + "in My Engineering");
        return true;
    }
}
