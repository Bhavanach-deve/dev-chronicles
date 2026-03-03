package Main;

import EducationalBackground.BacheloreOfEngineering;
import EducationalBackground.SecondarySchoolCertificate;
import EducationalBackground.Intermediate;

public class MainClass
{
    public static void main(String[] args)
    {
        EducationalProfile ep=new EducationalProfile(new SecondarySchoolCertificate());
        //ep.setAcademics(new SecondarySchoolCertificate());
        //ep.setAcademics(new Intermediate());
        //ep.setAcademics(new BacheloreOfEngineering());

        //Boolean status=ep. MyQualificationBackground(8.77);
//        Boolean status=ep. MyQualificationBackground(9.25);
        Boolean status=ep. MyQualificationBackground(8.04);

        if (status)
            System.out.println("I have successfully completed my Education");
        else
            System.out.println("Failed complete");

    }
}