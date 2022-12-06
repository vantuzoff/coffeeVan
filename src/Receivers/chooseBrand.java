package Receivers;
import Classes.*;

public class chooseBrand implements Command{
    Order order;

    public chooseBrand(Order order){
        this.order = order;
    }
    public void execute(){
        order.chooseBrand();
    }
}
