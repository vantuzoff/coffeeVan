package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Coffee_VanTest {
    @Test
    void ShouldReturn300(){
        Coffee_Van.setProfit(300);
        assertEquals(300, Coffee_Van.getProfit());
    }
}