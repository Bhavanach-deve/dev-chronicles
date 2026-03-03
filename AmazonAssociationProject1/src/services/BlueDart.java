package services;
public class BlueDart implements IDeliverService {
    public Boolean deliverProduct(Double amount){
        System.out.println("Product delivery through BlueDart and amount paid is "+ amount);
        return true;
    }
}
