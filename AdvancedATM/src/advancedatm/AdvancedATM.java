/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedatm;

import java.sql.*;

/**
 *
 * @author user
 */
public class AdvancedATM {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        final Connection conn = ServerConnection.connect();
        boolean homepage = true;
        if(homepage){
            new front(conn).setVisible(true);
        }
    }
    
}
