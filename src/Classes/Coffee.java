package Classes;

public class Coffee extends Inventory {
    String brand;
    String coffeeSpecies = "Grain";
    String coffeeType = "Soft";
    int amount;
    int coffeePrice;

    public Coffee(String brand, String coffeeSpecies, String coffeeType, int amount, int coffeePrice) {
        this.brand = brand;
        this.coffeeSpecies = coffeeSpecies;
        this.coffeeType = coffeeType;
        this.amount = amount;
        this.coffeePrice = coffeePrice;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "brand='" + brand + '\'' +
                ", coffeeSpecies='" + coffeeSpecies + '\'' +
                ", coffeeType='" + coffeeType + '\'' +
                ", amount=" + amount +
                ", coffeePrice=" + coffeePrice +
                '}';
    }

    public Coffee(){}
    public String getBrand() {
        return brand;
    }

    public String getSpecies() {
        return coffeeSpecies;
    }

    public String getType() {
        return coffeeType;
    }

    public int getPrice() {
        return coffeePrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCoffeeSpecies(String species) {
        coffeeSpecies = species;
    }

    public void setCoffeeType(String type) {
        coffeeType = type;
    }

    public void setAmount(int amount) {this.amount = amount;}

    public void setCoffeePrice(int price) {
        this.coffeePrice = price;
    }
}
