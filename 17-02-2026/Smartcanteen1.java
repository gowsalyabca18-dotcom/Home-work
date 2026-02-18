/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Smartcanteen;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */

public class Smartcanteen1 {

    static final String URL = "jdbc:postgresql://localhost:5432/SmartCanteen";
    static final String USER = "postgres";
    static final String PASSWORD = "gowsalya";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            while (true) {
                System.out.println("\n===== SMART CANTEEN MENU =====");
                System.out.println("1. Add New Food Item");
                System.out.println("2. View Food Menu");
                System.out.println("3. Search Food by Name");
                System.out.println("4. Update Food Price");
                System.out.println("5. Delete Food Item");
                System.out.println("6. Calculate Total Bill");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Food Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        String insert = "INSERT INTO food(name, price) VALUES(?, ?)";
                        PreparedStatement ps1 = con.prepareStatement(insert);
                        ps1.setString(1, name);
                        ps1.setDouble(2, price);
                        ps1.executeUpdate();
                        System.out.println("Food Added Successfully!");
                        break;

                    case 2:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM food");

                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + " | "
                                    + rs.getString("name") + " | "
                                    + rs.getDouble("price"));
                        }
                        break;

                    case 3:
                        System.out.print("Enter Food Name to Search: ");
                        String searchName = sc.nextLine();

                        String search = "SELECT * FROM food WHERE name = ?";
                        PreparedStatement ps2 = con.prepareStatement(search);
                        ps2.setString(1, searchName);
                        ResultSet rs2 = ps2.executeQuery();

                        if (rs2.next()) {
                            System.out.println("Found: " + rs2.getString("name")
                                    + " - Rs." + rs2.getDouble("price"));
                        } else {
                            System.out.println("Food Not Found!");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Food Name to Update: ");
                        String updateName = sc.nextLine();
                        System.out.print("Enter New Price: ");
                        double newPrice = sc.nextDouble();

                        String update = "UPDATE food SET price=? WHERE name=?";
                        PreparedStatement ps3 = con.prepareStatement(update);
                        ps3.setDouble(1, newPrice);
                        ps3.setString(2, updateName);
                        int rows = ps3.executeUpdate();

                        if (rows > 0)
                            System.out.println("Price Updated!");
                        else
                            System.out.println("Food Not Found!");
                        break;

                    case 5:
                        System.out.print("Enter Food Name to Delete: ");
                        String deleteName = sc.nextLine();

                        String delete = "DELETE FROM food WHERE name=?";
                        PreparedStatement ps4 = con.prepareStatement(delete);
                        ps4.setString(1, deleteName);
                        int deleted = ps4.executeUpdate();

                        if (deleted > 0)
                            System.out.println("Food Deleted!");
                        else
                            System.out.println("Food Not Found!");
                        break;

                    case 6:
                        Statement st2 = con.createStatement();
                        ResultSet rs3 = st2.executeQuery("SELECT SUM(price) FROM food");

                        if (rs3.next()) {
                            System.out.println("Total Bill Amount: Rs. "
                                    + rs3.getDouble(1));
                        }
                        break;

                    case 7:
                        System.out.println("Exiting Program...");
                        return;

                    default:
                        System.out.println("Invalid Choice!");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

