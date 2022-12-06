package Classes;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private static final Logger logger = Logger.getLogger(OrderTest.class.getName());

    @Test
    void checkPrice(){
        var f = new Order(200);
        assertEquals("Order{price=200, coffee=null, package1=null}", f.toString());
    }

    @Test
    void shouldBeChosenNescafe() throws SQLException {
        new Coffee_Van().getInventory();
        var f = new Order();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.chooseBrand();
            assertEquals(f.getCoffee().getBrand(),"Nescafe");
        } finally {
            System.setIn(old);
        }
    }

    @Test
    void shouldBeChosenJacobs() throws SQLException {
        new Coffee_Van().getInventory();
        var f = new Order();
        String input = "2";
        InputStream testInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.chooseBrand();
            assertEquals(f.getCoffee().getBrand(),"Jacobs");
        } finally {
            System.setIn(old);
        }
    }

    @Test
    void shouldBeChosenNesquick() throws SQLException {
        new Coffee_Van().getInventory();
        var f = new Order();
        String input = "3";
        InputStream testInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.chooseBrand();
            assertEquals(f.getCoffee().getBrand(),"Nesquick");
        } finally {
            System.setIn(old);
        }
    }

    @Test
    void shouldBeChosenGrain() throws SQLException {
        new Coffee_Van().getInventory();
        var f = new Order();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.chooseCoffeeSpecies();
            assertEquals(f.getCoffee().getSpecies(),"Grain");
        } finally {
            System.setIn(old);
        }
    }

    @Test
    void shouldBeChosenGround() throws SQLException {
        new Coffee_Van().getInventory();
        var f = new Order();
        String input = "2";
        InputStream testInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.chooseCoffeeSpecies();
            assertEquals(f.getCoffee().getSpecies(),"Ground");
        } finally {
            System.setIn(old);
        }
    }

    @Test
    void shouldBeChosenInstant() throws SQLException {
        new Coffee_Van().getInventory();
        var f = new Order();
        String input = "3";
        InputStream testInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.chooseCoffeeSpecies();
            assertEquals(f.getCoffee().getSpecies(),"Instant");
        } finally {
            System.setIn(old);
        }
    }

    @Test
    void shouldBeChosenSoft() throws SQLException {
        new Coffee_Van().getInventory();
        var f = new Order();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.chooseCoffeeType();
            assertEquals(f.getCoffee().getType(),"Soft");
        } finally {
            System.setIn(old);
        }
    }

    @Test
    void shouldBeChosenMedium() throws SQLException {
        new Coffee_Van().getInventory();
        var f = new Order();
        String input = "2";
        InputStream testInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.chooseCoffeeType();
            assertEquals(f.getCoffee().getType(),"Medium");
        } finally {
            System.setIn(old);
        }
    }

    @Test
    void shouldBeChosenStrong() throws SQLException {
        new Coffee_Van().getInventory();
        var f = new Order();
        String input = "3";
        InputStream testInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.chooseCoffeeType();
            assertEquals(f.getCoffee().getType(),"Strong");
        } finally {
            System.setIn(old);
        }
    }

    @Test
    void shouldBeChosen2() throws SQLException {
        new Coffee_Van().getInventory();
        var f = new Order();
        f.coffee.setBrand("Nescafe");
        f.coffee.setAmount(100);
        String input = "1";
        InputStream testInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.chooseVolume();
            assertEquals(2,f.getPackage1().getVolume());
        } finally {
            System.setIn(old);
        }
    }

    @Test
    void shouldBeChosen5() throws SQLException {
        new Coffee_Van().getInventory();
        var f = new Order();
        f.coffee.setBrand("Nescafe");
        f.coffee.setAmount(100);
        String input = "2";
        InputStream testInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.chooseVolume();
            assertEquals(5,f.getPackage1().getVolume());
        } finally {
            System.setIn(old);
        }
    }

    @Test
    void shouldBeChosen10() throws SQLException {
        new Coffee_Van().getInventory();
        var f = new Order();
        f.coffee.setBrand("Nescafe");
        f.coffee.setAmount(100);
        String input = "3";
        InputStream testInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.chooseVolume();
            assertEquals(10,f.getPackage1().getVolume());
        } finally {
            System.setIn(old);
        }
    }

    @Test
    void shouldBeChosen25() throws SQLException {
        new Coffee_Van().getInventory();
        var f = new Order();
        f.coffee.setBrand("Nescafe");
        f.coffee.setAmount(100);
        String input = "25";
        InputStream testInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.chooseCustomVolume();
            assertEquals(25,f.getPackage1().getVolume());
        } finally {
            System.setIn(old);
        }
    }

    @Test
    void shouldBeSortedByAmount() throws SQLException {
        new Coffee_Van().getInventory();
        ArrayList<Coffee> arr = new ArrayList<>();
        arr.add(new Coffee());
        arr.get(0).setAmount(100);
        arr.add(new Coffee());
        arr.get(1).setAmount(80);
        arr.add(new Coffee());
        arr.get(2).setAmount(150);
        var f = new Order();
        f.setCfe(arr);
        f.sortByAmount();
        for (int i = 0;i < arr.size() - 1;++i) {
            assertFalse(arr.get(i).getAmount() > arr.get(i+1).getAmount());
        }
    }

    @Test
    void shouldBeSortedByPrice() throws SQLException {
        new Coffee_Van().getInventory();
        ArrayList<Coffee> arr = new ArrayList<>();
        arr.add(new Coffee());
        arr.get(0).setCoffeePrice(10);
        arr.add(new Coffee());
        arr.get(1).setCoffeePrice(15);
        arr.add(new Coffee());
        arr.get(2).setCoffeePrice(12);
        var f = new Order();
        f.setCfe(arr);
        f.sortByPrice();
        for (int i = 0;i < arr.size() - 1;++i) {
            assertFalse(arr.get(i).getPrice() > arr.get(i+1).getPrice());
        }
    }
}