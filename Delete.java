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
public class Delete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Miskin@1982");
            Statement stmt = conn.createStatement();){
            System.out.println("Inser the id you want to delete");
            Integer id = Insertions.readInt();
            String sql = "DELETE FROM EmployeeDB WHERE id = " + id + ";";
            stmt.execute(sql);
        }catch(SQLException e){
            e.getMessage();
        }
    }
    
}
