import java.util.*;
class JobRole{
    String role;
    int jobId;
    public JobRole(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the role you are searching for without spaces");
        role=sc.nextLine();
        System.out.println("Enter the jobId you are searching for:");
        jobId=sc.nextInt();
    }
    void matched(){
        if(jobId==1234||jobId==2446||jobId==7895||jobId==6545){
            System.out.println("Please proceed with the job-Application");
        }
        else{
            System.out.println("The job-role you are searching for is either filled or you have miss-typed it please try again ");
        }
    }

}
class Salary extends JobRole{
    void lpa(){
        switch(jobId) {
            case 1234:
                System.out.println("11LPA Offered for this role");
                break;
            case 2446:
                System.out.println("10Lpa offered");
                break;
            case 7895:
                System.out.println("9lpa");
                break;
            case 6545:
                System.out.println("8 lpa");
                break;
            default:
                System.out.println("Salary details not available");

        }

    }
}

public class ConstructorChaining {
    public static void main(String args[]) {
        Salary s=new Salary();
        s.lpa();



    }
}
