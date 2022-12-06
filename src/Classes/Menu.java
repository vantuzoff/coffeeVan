package Classes;

import java.util.Scanner;

public class Menu {
    public Menu() {
        boolean isExit = false;
        Order order = new Order();
        Coffee_Van.addOrder(order);
        int choice = 0;
        Invoker invoker = new Invoker(order);
        invoker.chooseBr();
        while (!isExit) {
            System.out.println("What do you want to do?");
            System.out.println("1. Choose coffee species\n" +
                    "2. Choose coffee type\n" +
                    "3. Choose coffee volume\n" +
                    "4. Choose coffee custom volume\n" +
                    "5. Show list of coffee sorted by amount\n" +
                    "6. Show list of coffee sorted by price\n" +
                    "7. Previous");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            if (choice == 1)
                invoker.chooseSp();
            else if (choice == 2)
                invoker.chooseType();
            else if (choice == 3)
                invoker.chooseVol();
            else if (choice == 4)
                invoker.chooseCustVol();
            else if (choice == 5)
                invoker.sortAm();
            else if (choice == 6)
                invoker.sortPr();
            else if (order.isChosen) {
                System.out.println("Exiting...");
                isExit = true;
            }
            else {
                System.out.println("You can`t leave without choosing coffee volume!");
            }
        }
    }
}
