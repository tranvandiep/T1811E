/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

/**
 *
 * @author PC
 */

public class Menu {
    int choise;
    
    public Menu() {
        
    }
    
    public void menuList() {
        System.out.println("1. Nhap thong tin hinh tron");
        System.out.println("2. Tinh chu vi hinh tron");
        System.out.println("3. Tinh dien tich hinh tron");
        System.out.println("4. Nhap thong tin hinh chu nhat");
        System.out.println("5. Tinh chu vi hinh chu nhat");
        System.out.println("6. Tinh dien tich hinh chu nhat");
        System.out.println("7. Thoat");
    }
    
    public void setChoise(int C) {
        this.choise = C;
    }
    public int getChoise() {
        return this.choise;
    }
}
