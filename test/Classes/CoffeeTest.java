package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {
    @Test
    void checkCoffee(){
        var f = new Coffee("Nescafe", "Grain", "Soft", 100, 15);
        assertEquals("Coffee{brand='Nescafe', coffeeSpecies='Grain', coffeeType='Soft', amount=100, coffeePrice=15}", f.toString());
    }
}