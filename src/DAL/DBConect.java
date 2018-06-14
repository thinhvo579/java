/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nhut
 */
public class DBConect {

   static String dbURL = "jdbc:sqlserver://NHUT-PC\\SQLEXPRESS;databaseName=Quanlybanhang;user=sa;password=123456";

    /**
     *
     * @return 
     */
    public DBConect() {
        try {
            Connection conn = DriverManager.getConnection(dbURL);
            if(conn == null) {
            } else {
                System.out.print("Connected!!");
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Loi!");
        }
    }

    
}
