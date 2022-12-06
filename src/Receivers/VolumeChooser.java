package Receivers;

import Classes.Order;

public class VolumeChooser implements Command{
    Order order;

    public VolumeChooser(Order order) {
        this.order = order;
    }

    public void execute(){
        order.chooseVolume();
    }
}
