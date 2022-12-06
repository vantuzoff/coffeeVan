package Receivers;

import Classes.Order;

public class CustomVolumeChooser implements Command{
    Order order;

    public CustomVolumeChooser(Order order) {
        this.order = order;
    }

    public void execute(){
        order.chooseCustomVolume();
    }
}
