package Receivers;

import Classes.Order;

public class TypeChooser implements Command{
    Order order;

    public TypeChooser(Order order) {
        this.order = order;
    }

    public void execute(){
        order.chooseCoffeeType();
    }
}
