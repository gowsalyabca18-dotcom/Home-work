/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Administrator
 */
 
    
import java.sql.*;
import java.util.Scanner;

public class Students {

    static final String URL = "jdbc:postgresql://localhost:5432/Homework";
    static final String USER = "postgres";
    static final String PASSWORD = "gowsalya";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            while (true) {

                System.out.println("\n===== STUDENT MENU =====");
                System.out.println("1. Insert Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Search Student by ID");
                System.out.println("4. Update Student Course");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();

                        String insertSQL = "INSERT INTO student VALUES (?, ?, ?, ?)";
                        PreparedStatement ps1 = con.prepareStatement(insertSQL);
                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setInt(3, age);
                        ps1.setString(4, course);

                        ps1.executeUpdate();
                        System.out.println("Student record inserted successfully");
                        break;

                   
                    case 2:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM student");

                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt("id") +
                                    " Name: " + rs.getString("name") +
                                    " Age: " + rs.getInt("age") +
                                    " Course: " + rs.getString("course"));
                        }
                        break;

                  
                    case 3:
                        System.out.print("Enter Student ID: ");
                        int searchId = sc.nextInt();

                        String searchSQL = "SELECT * FROM student WHERE id=?";
                        PreparedStatement ps2 = con.prepareStatement(searchSQL);
                        ps2.setInt(1, searchId);

                        ResultSet rs2 = ps2.executeQuery();

                        if (rs2.next()) {
                            System.out.println("Student Found");
                            System.out.println("Name: " + rs2.getString("name") +
                                    " Age: " + rs2.getInt("age") +
                                    " Course: " + rs2.getString("course"));
                        } else {
                            System.out.println("Student Not Found");
                        }
                        break;

                
                    case 4:
                        System.out.print("Enter Student ID: ");
                        int updateId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Course: ");
                        String newCourse = sc.nextLine();

                        String updateSQL = "UPDATE student SET course=? WHERE id=?";
                        PreparedStatement ps3 = con.prepareStatement(updateSQL);
                        ps3.setString(1, newCourse);
                        ps3.setInt(2, updateId);

                        int rows = ps3.executeUpdate();

                        if (rows > 0)
                            System.out.println("Student course updated successfully");
                        else
                            System.out.println("Student Not Found");
                        break;

                    
                    case 5:
                        System.out.print("Enter Student ID: ");
                        int deleteId = sc.nextInt();

                        String deleteSQL = "DELETE FROM student WHERE id=?";
                        PreparedStatement ps4 = con.prepareStatement(deleteSQL);
                        ps4.setInt(1, deleteId);

                        int deleted = ps4.executeUpdate();

                        if (deleted > 0)
                            System.out.println("Student record deleted successfully");
                        else
                            System.out.println("Student Not Found");
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

