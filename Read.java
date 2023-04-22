/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleksandar.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aleksandar
 */
public class Read {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Miskin@1982");
            Statement stmt = conn.createStatement();){
            ResultSet rs = stmt.executeQuery("SELECT * FROM EmployeeDB");
            while(rs.next()){
                System.out.println(rs.getInt("id") + " " 
                + rs.getString("fName") + " " + rs.getString("lName") 
                + " " + rs.getDouble("salary"));
            }
    
        }catch(SQLException e){
            e.getMessage();
        }
    }
}
