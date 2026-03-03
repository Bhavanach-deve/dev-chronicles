package Main;
import services.IDeliverService;
public class Amazon {
    private IDeliverService service;

    public void setService(IDeliverService service) {
        this.service = service;
    }

    public Boolean deliverTheProduct(Double amount){
//        Boolean status=fed.deliverTheProduct(amount);
//        return status;
        return service.deliverProduct(amount);
    }
}
