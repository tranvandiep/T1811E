/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.Database;

/**
 *
 * @author PC
 */
import java.sql.*;
import java.math.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Test {
    //Khai bao bien instance la ten driver va url den database
    static final String JDBC_Driver = "com.mysql.jdbc.Driver";
    static final String DB_Url = "jdbc:mysql://localhost:3306/testdb";
    
    //Khai bao bien instance la user va password truy cap vao database
    static final String user = "root";
    static final String pass = "";
    
    public static void main(String[] args) {
    //Khoi tao bien connection va statement
        Connection conn = null;
        Statement stm = null;
        
        try {
            //Dang ky driver voi sever
            Class.forName(JDBC_Driver);
            
            //Tao ket noi toi db voi user va pass bang lop DriverManager
            System.out.println("Tao ket noi den co so du lieu...");
            conn = DriverManager.getConnection(DB_Url, user, pass);
            
            //Tao va thuc hien lenh truy van vao db bang interface Connection khoi tao qua lop Statement
            System.out.println("Tao cau lenh truy van vao csdl...");
            stm = conn.createStatement();
            String sql;
            sql = "SELECT * FROM student";
            ResultSet rs = stm.executeQuery(sql);
            
            //Lay du lieu tu resultset
            while(rs.next()) {
                //lay du lieu theo ten cot
                String id = rs.getString("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String clas = rs.getString("class");
                
                //hien thi du lieu lay duoc
                System.out.print("\nMSSV: "+id);
                System.out.print("\nHo ten: "+name);
                System.out.print("\nGioi tinh: "+gender);
                System.out.print("\nLop: "+clas);
                System.out.print("\n");
            }
            
            //Don sach moi truong va giai phong du lieu
            rs.close();
            stm.close();
            conn.close();         
        } catch(SQLException se) {
            //Su ly loi tren JDBC
            se.printStackTrace();
        } catch(Exception e) {
            //Su ly cac loi khi khao tao driver
            e.printStackTrace();
        } finally {
            //Dong toan bo cac resouses 
            try {
                if(stm != null) {
                    stm.close();
                }
            } catch(SQLException se2) {}
            try {
                if(conn != null) {
                    conn.close();
                }
            } catch(SQLException se) {
                se.printStackTrace();
            } //Dong hoan tat
        }
        System.out.println("\nHoan tat mo ket noi, lay du lieu va dong ket noi");
        
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
//            Statement stm = conn.createStatement();
//            ResultSet rs = stm.executeQuery("SELECT * FROM student");
//            
//            while(rs.next()) {
//                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
//            }
//            conn.close();    
//        } catch(Exception e) {
//            System.out.println(e);
//        }

          
    }
}

