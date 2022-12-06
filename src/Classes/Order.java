package Classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Order {
    boolean isChosen = false;
    int price;
    Coffee coffee;
    Package package1;
    public Order(int price) {
        this.price = price;
    }

    public Order(){
        coffee = new Coffee();
        package1 = new Package();
        price = 0;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCfe(ArrayList<Coffee> arrCfe){
        Coffee_Van.cfe = arrCfe;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public Package getPackage1() {
        return package1;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", coffee=" + coffee +
                ", package1=" + package1 +
                '}';
    }

    public void chooseBrand(){
        Scanner scan = new Scanner(System.in);
        int choice;
        ArrayList<Inventory> arrInv;
        System.out.println("Choose coffee brand:\n");
        arrInv = Coffee_Van.retArrInv();
        int i = 1;
        for (Inventory inv: arrInv){
            if (inv instanceof Coffee) {
                System.out.println(i + ". " + ((Coffee) inv).brand);
                i++;
            }
        }
        choice = scan.nextInt();
        coffee.setBrand(((Coffee)arrInv.get(choice-1)).getBrand());
        coffee.setCoffeePrice(((Coffee)arrInv.get(choice-1)).getPrice());
        coffee.setAmount(((Coffee)arrInv.get(choice-1)).getAmount());

    }
    public void chooseCoffeeSpecies(){
        System.out.println("Coffee Species(Default - Grain):\n1. Grain\n2. Ground\n3. Instant");
        int choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        if (choice == 1) {
            System.out.println("Coffee species have been chosen - Grain Coffee");
            coffee.setCoffeeSpecies("Grain");
        }else if (choice == 2){
            System.out.println("Coffee species have been chosen - Ground Coffee");
            coffee.setCoffeeSpecies("Ground");
        } else {
            System.out.println("Coffee species have been chosen - Instant Coffee");
            coffee.setCoffeeSpecies("Instant");
        }
    }

    public void chooseCoffeeType(){
        System.out.println("Coffee Types(Default - Soft):\n1. Soft\n2. Medium\n3. Strong");
        int choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        if (choice == 1) {
            System.out.println("Coffee type have been chosen - Soft Coffee");
            coffee.setCoffeeType("Soft");
        }else if (choice == 2){
            System.out.println("Coffee type have been chosen - Medium Coffee");
            coffee.setCoffeeType("Medium");
        } else {
            System.out.println("Coffee type have been chosen - Strong Coffee");
            coffee.setCoffeeType("Strong");
        }
    }

    public void chooseVolume(){
        int vol = 0;
        boolean loop = true;
        ArrayList<Inventory> arrInv;
        arrInv = Coffee_Van.retArrInv();
        while(loop) {
            if (coffee.getAmount() <= 2) {
                System.out.println("Not enough coffee!\nIf there`s more than 0 coffee you can try choose custom volume");
                isChosen = true;
                return;
            }
            loop = false;
            System.out.println("Coffee Packages Volume:\n1. 2 kg\n2. 5 kg\n3. 10 kg");
            int choice;
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            if (choice == 1) {
                    System.out.println("Packages volume have been chosen - 2 kg");
                    vol = 2;
            } else if (choice == 2 && coffee.getAmount() > 5) {
                System.out.println("Packages volume have been chosen - 5 kg");
                vol = 5;
            } else if (choice == 3 && coffee.getAmount() > 2) {
                System.out.println("Packages volume have been chosen - 10 kg");
                vol = 10;
            }
            for (Inventory inv : arrInv) {
                if (inv instanceof Coffee && ((Coffee) inv).getAmount() < vol && Objects.equals(((Coffee) inv).getBrand(), coffee.brand)) {
                    if (((Coffee) inv).getAmount() < 2) {
                        System.out.println("There`s less than 2 kg of coffee!");
                        return;
                    } else {
                        System.out.println("Volume is too big!");
                        loop = true;
                    }
                }
            }
        }
        package1.setVolume(vol);
        for (Inventory inv: arrInv){
            if (Objects.equals(((Coffee) inv).getBrand(), coffee.brand))
                ((Coffee) inv).setAmount(((Coffee) inv).getAmount()-vol);
        }
        package1.setPackagePrice(vol*coffee.getPrice());
        System.out.println("Price: "+package1.packagePrice);
        price = package1.packagePrice;
        Coffee_Van.setProfit(package1.getPrice());
        isChosen = true;
    }
    public void chooseCustomVolume(){
        boolean loop = true;
        int vol = 0;
        ArrayList<Inventory> arrInv;
        arrInv = Coffee_Van.retArrInv();
        while (loop) {
            if (coffee.getAmount() <= 0) {
                System.out.println("Not enough coffee!");
                Coffee_Van.ord.remove(this);
                isChosen = true;
                return;
            }
            loop = false;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter custom packages volume:");
            vol = scan.nextInt();
            package1.setVolume(vol);
            System.out.println("Custom Packages volume have been chosen - " + vol + " kg");
            for (Inventory inv: arrInv) {
                if (inv instanceof Coffee && ((Coffee) inv).getAmount() < vol && Objects.equals(((Coffee) inv).getBrand(), coffee.brand)){
                    if (((Coffee) inv).getAmount() < vol){
                        System.out.println("Volume is too big!");
                        loop = true;
                    }else if (((Coffee) inv).getAmount() == 0){
                        System.out.println("There`s no coffee left!\nYou can`t purchase it!");
                        vol = 0;
                        package1.setVolume(vol);
                    }
                }
            }
        }
        package1.setVolume(vol);
        for (Inventory inv: arrInv) {
            if (Objects.equals(((Coffee) inv).getBrand(), coffee.brand))
                ((Coffee) inv).setAmount(((Coffee) inv).getAmount() - vol);
        }
        package1.setPackagePrice(vol*coffee.getPrice());
        System.out.println("Price: "+package1.packagePrice);
        price = package1.packagePrice;
        Coffee_Van.setProfit(package1.getPrice());
        isChosen = true;
    }

    public String showCoffee(){
        String str = " ";
        for (Coffee coffee1: Coffee_Van.getCfe()) {
            System.out.println(coffee1);
            str = str.concat(coffee1.toString() +"\n");
        }
        return str;
    }

    public void sortByAmount(){
        Coffee_Van.cfe.sort(Comparator.comparing(Coffee::getAmount));
        showCoffee();
        System.out.println("sorted!");
    }

    public void sortByPrice(){
        Coffee_Van.cfe.sort(Comparator.comparing(Coffee::getPrice));
        showCoffee();
        System.out.println("sorted!");
    }
}
