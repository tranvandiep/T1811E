/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class Test2 {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
       
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/number", "root", "");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from integertab");

            while(rs.next()) {
                System.out.println("STT: "+rs.getInt("id"));
                System.out.println("Ten: "+rs.getString("name"));
                System.out.println("Gia tri: "+rs.getInt("value"));
                System.out.println();
            }
           
            rs.close();
            stmt.close();
            conn.close();
        } catch(SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if(stmt != null) {
                    stmt.close();
                }
            } catch(SQLException se2) {}
            try {
                if(conn != null) {
                    conn.close();
                }
            } catch(SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
