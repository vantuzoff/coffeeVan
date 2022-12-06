package Receivers;

import Classes.Order;

public class AmountSort implements Command{
    Order order;

    public AmountSort(Order order) {
        this.order = order;
    }

    public void execute(){
        order.sortByAmount();
    }
}
