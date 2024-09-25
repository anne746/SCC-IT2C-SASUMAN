package sasuman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Sasuman {

//Connection Method to SQLITE
public static Connection connectDB() {
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC"); // Load the SQLite JDBC driver
            con = DriverManager.getConnection("jdbc:sqlite:voters.db"); // Establish connection
            System.out.println("Connection Successful");
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e);
        }
        return con;  
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student ID: ");
    String id = sc.next();
    sc.nextLine();
    System.out.println("First Name: ");
    String fn = sc.nextLine();
    System.out.println("Last Name: ");
    String ln = sc.nextLine();
    System.out.println("Email: ");
    String em = sc.next();
    System.out.println("Status: ");
    String stat = sc.next();
    
    String sql = "INSERT INTO Students (s_id, s_ftname, s_lname, s_email, s_status (?, ?, ?, ?)";
    
    try{
        Connection con = connectDB();
        PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, fn);
            pst.setString(3, ln);
            pst.setString(4, em);
            pst.setString(5, stat);
            pst.executeUpdate();
            System.out.println("Inserted Successfully!");
            
    }catch(SQLException ex) {
        System.out.println("Connection Error: "+ex.getMessage());
    }
    
}

                 
}