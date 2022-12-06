package Receivers;

import Classes.Order;

public class PriceSort implements Command{
    Order order;

    public PriceSort(Order order) {
        this.order = order;
    }

    public void execute(){
        order.sortByPrice();
    }
}
