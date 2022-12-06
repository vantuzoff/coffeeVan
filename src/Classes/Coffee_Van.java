package Classes;

import Classes.Order;

import java.sql.*;
import java.util.ArrayList;

public class Coffee_Van {
    static ArrayList<Inventory> inv;
    static ArrayList<Order> ord;
    static int profit;
    static ArrayList<Coffee> cfe;
    static ArrayList<Package> pkg;

    public Coffee_Van(){
        inv = new ArrayList<Inventory>();
        ord = new ArrayList<Order>();
        cfe = new ArrayList<Coffee>();
        pkg = new ArrayList<Package>();
        profit = 0;
    }
    public void getInventory() throws SQLException {

        String url =
                "jdbc:sqlserver://DESKTOP-PF33IMI;" +
                        "databaseName=coffeeVan;integratedSecurity=true;" +
                        "encrypt=true;trustServerCertificate=true";
        String user = "coffeeDealer";
        String password = "pass";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Microsoft SQL Server");

        } catch (SQLException e) {
            System.out.println("Error occurred!");
            throw new RuntimeException(e);
        }

        Statement stmt = connection.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

        while (rs.next()) {
            Coffee coffee = new Coffee(rs.getString("brand"), rs.getString("species"), rs.getString("type"), rs.getInt("amount"), rs.getInt("price"));
            inv.add(coffee);
        }
        while (rs.next()) {
            Package package1 = new Package(rs.getInt("amount"), rs.getInt("price"));
            inv.add(package1);
        }
        setCfePkg();
    }
    static public ArrayList<Inventory> retArrInv(){
        return inv;
    }

    public void setCfePkg(){
        for (Inventory inv: Coffee_Van.retArrInv()){
            if (inv instanceof Coffee){
                cfe.add((Coffee) inv);
            }else
                pkg.add((Package) inv);
        }
    }

    public static ArrayList<Coffee> getCfe() {
        return cfe;
    }
    public static int getProfit() {
        return profit;
    }
    static public void addOrder(Order order){
        ord.add(order);
    }
    static public String orderHistory(){
        String str = " ";
        for (Order order : ord){
            System.out.println(order);
            str = str.concat(order.toString() +"\n");
        }
        return str;
    }
    static public void setProfit(int price) {
        profit += price;
    }
}
