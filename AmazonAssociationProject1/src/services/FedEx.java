package services;
public class FedEx implements IDeliverService {
    public Boolean deliverProduct(Double amount){
        System.out.println("Product delivery through FedEX and amount paid is "+ amount);
        return true;
    }
}
