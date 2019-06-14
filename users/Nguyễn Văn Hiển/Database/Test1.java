/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.Database;

import java.sql.*;
import java.math.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author PC
 */
public class Test1 {
    static final String DB_Url = "jdbc:mysql://localhost:3306/number";
    static final String user = "root";
    static final String pass = "";
    
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
//        PreparedStatement pstmt = null;
        
        try {
            conn = DriverManager.getConnection(DB_Url, user, pass);
            String sql;
//            sql = "INSERT INTO integertab(id, name, value) VALUES(?, ?, ?)";
//            pstmt.setInt(1, 5);
//            pstmt.setString(2, "so thu 2");
//            pstmt.setInt(3, 785);
//            pstmt = conn.prepareStatement(sql);
            
            stmt = conn.createStatement();
            sql = "SELECT * FROM integertab";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int value = rs.getInt("value");
                
                System.out.print("\nSTT: "+id);
                System.out.print("\nTen: "+name);
                System.out.print("\nGia tri: "+value);
                System.out.println();
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch(SQLException se) {
            se.printStackTrace();
//        } catch(SQLException e) {
//            e.printStackTrace();
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
