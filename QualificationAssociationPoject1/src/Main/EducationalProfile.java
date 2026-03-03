package Main;
import EducationalBackground.AcademicHistory;
public class EducationalProfile
{
private AcademicHistory academics;

    public EducationalProfile(AcademicHistory academics)
    {
        super();
        this.academics = academics;
    }
    public EducationalProfile()
    {
        super();
    }
    public void setAcademics(AcademicHistory academics)
    {
        this.academics = academics;
    }
    public Boolean MyQualificationBackground(Double cgpa)
    {
        return academics.getTheAggregate(cgpa);
    }
}
