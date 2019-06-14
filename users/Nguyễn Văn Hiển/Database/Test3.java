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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class Test3 {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
//        PreparedStatement pstmt = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/number", "root", "");
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                           ResultSet.CONCUR_UPDATABLE);
//            stmt.execute("update integertab set name='so thu 6' where id=2");
//            stmt.execute("insert into integertab value(5, 'so thu 5', 784)");
//            for(int i = 7; i <= 10; i++) {
//                pstmt = conn.prepareStatement("insert into integertab value(?, ?, ?)");
//                pstmt.setInt(1, i);
//                pstmt.setString(2, "so thu "+i);
//                pstmt.setInt(3, i+267);
//                pstmt.execute();
//            }
            ResultSet rs = stmt.executeQuery("select * from integertab");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println(rsmd.getColumnCount());
            System.out.println(rsmd.getColumnTypeName(3));
            System.out.println(rsmd.getColumnName(3));
//            rs.first();
//            rs.last();
            
            while(rs.next()) {
//                rs.updateInt("value", rs.getInt("value") - 10);
//                rs.updateRow();
//            if(rs.absolute(3)) {
                System.out.println("STT: "+rs.getInt("id"));
                System.out.println("Ten: "+rs.getString("name"));
                System.out.println("Gia tri: "+rs.getInt("value"));
                System.out.println();
            }
//            System.out.println(rs.getRow());

            rs.close();
//            pstmt.close();
            stmt.close();
            conn.close();
        } catch(SQLException se) {
            se.printStackTrace();
        } finally {
//            try {
//                if(pstmt != null) {
//                    pstmt.close();
//                }
//            } catch(SQLException se) {}
            try {
                if(stmt != null) {
                    stmt.close();
                }
            } catch(SQLException se) {}
            try {
                if(conn != null) {
                    conn.close();
                }
            } catch(SQLException se) {}
        }
    }
}
