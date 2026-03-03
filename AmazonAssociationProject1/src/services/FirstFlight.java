package services;
public class FirstFlight implements IDeliverService {
    public Boolean deliverProduct(Double amount){
        System.out.println("Product delivery through FirstFlight and amount paid is "+ amount);
        return true;
    }
}
