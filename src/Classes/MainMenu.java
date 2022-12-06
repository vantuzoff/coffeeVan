package Classes;

import java.util.Scanner;

public class MainMenu {
    public void OpenMainMenu(){
        while(true) {
            System.out.println("\t\t\tMAIN MENU\n1. Create order\n2. View orders history\n3. Check coffee van profit\n4. Exit");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            if (choice == 1) {
                new Menu();
            }else if (choice == 2){
                Coffee_Van.orderHistory();
            } else if (choice == 3) {
                System.out.println("Coffee van profit: "+Coffee_Van.getProfit());
            }else if (choice == 4){
                break;
            }
        }
    }

}
