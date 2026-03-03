package Main;
import services.BlueDart;
import services.FedEx;
import services.FirstFlight;


public class Main{
    public static void main(String[] args) {
        Amazon amz=new Amazon();

       // FedEx fedEx=new FedEx();
//        amz.setService(new FedEx());
        amz.setService(new BlueDart());
        amz.setService(new FirstFlight());

        Boolean status=amz.deliverTheProduct(4545.4);
        if(status)
            System.out.println("Product delivery successful");
        else
            System.out.println("Failed to deliver Product");

    }
}