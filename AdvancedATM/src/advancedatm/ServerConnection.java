/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedatm;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ServerConnection {
    public static Connection connect() throws SQLException{
        String DB_URL = "jdbc:mysql://localhost:3306/advancedatm";
        String USER = "root";
        String PASS = "";
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println("Connection successful\n\nConnection " + conn );
        return conn;
        
    }
    
}



