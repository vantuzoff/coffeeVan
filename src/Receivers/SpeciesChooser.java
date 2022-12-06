package Receivers;
import Classes.*;

public class SpeciesChooser implements Command{
    Order order;

    public SpeciesChooser(Order order) {
        this.order = order;
    }

    public void execute(){
        order.chooseCoffeeSpecies();
    }
}
