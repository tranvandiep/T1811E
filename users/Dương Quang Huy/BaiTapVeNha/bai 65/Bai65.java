/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maytinh;

/**
 *
 * @author DuongQuangHuy
 */
public class Bai65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator MayTinh = new Calculator();
        
        int x = MayTinh.Cong(5,5);
        int y = MayTinh.Tru(5,5);
        int z = MayTinh.Nhan(5,5);
        int l = MayTinh.Chia(5,5);
        
        System.out.println("gia tri cua x la :" + x);
        System.out.println("gia tri cua x la :" + y);
        System.out.println("gia tri cua x la :" + z);
        System.out.println("gia tri cua x la :" + l);
    }
    
}
