/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author vaibh
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");     //loading the class forName
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms","root","Vaibhav@123");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
