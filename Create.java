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
public class Create {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Insert the id number");
        Integer id = Insertions.readInt();
        System.out.println("Insert the first name");
        String fName = Insertions.readString();
        System.out.println("Insert the last name");
        String lName = Insertions.readString();
        System.out.println("Insert the salary");
        Double salary = Insertions.readDouble();
        boolean i = false;
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Miskin@1982");
            Statement stmt = conn.createStatement();){
            String sql = "INSERT INTO EmployeeDB VALUES (" + id +", '" 
                    + fName + "', '" + lName + "', " + salary + ");";
            i = stmt.execute(sql);
        }catch(SQLException e){
            e.getMessage();
        }
    }
    
}
