package main;

import service.ICourses;

public class Bhavana
{
    private ICourses course;

    public Bhavana(ICourses course)
    {
        super();
        this.course = course;
    }
    public Bhavana()
    {
        super();
    }
    public void setCourse(ICourses course)
    {
        this.course = course;
    }
    public Boolean buyTheCourse(Double amount)
    {
        return course.getTheCourse(amount);
    }
}
