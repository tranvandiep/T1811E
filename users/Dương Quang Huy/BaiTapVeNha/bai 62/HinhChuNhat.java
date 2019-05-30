/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai66.pkg2;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author DuongQuangHuy
 */
public class HinhChuNhat {
    public int ChieuDai , ChieuRong , ChuVi ,DienTich;
    Scanner Scanner = new  Scanner(System.in);
    
    public void Nhap(){
        
        System.out.println("nhap chieu dai");
        ChieuDai =  Integer.parseInt(Scanner.nextLine());
        System.out.println("nhap chieu rong");
        ChieuRong = Integer.parseInt(Scanner.nextLine());
      
    };
    
    public void TinhChuVi(){
        ChuVi = (ChieuDai + ChieuRong) * 2;
        System.out.println("Chu vi hinh chu nhat la:" + ChuVi);
    
    };
    
    public void TinhDienTich(){
        DienTich = ChieuDai * ChieuRong ;
        
        System.out.println("dien tich hinh chu nhat la : " + DienTich);
    };
           
        
    
}
