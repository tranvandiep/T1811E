/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT40;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT40 {
    static String ten,diachi,email;
    static int tuoi,sdt;
    public static void main(String[] args) {
        System.out.println("Chuong trinh menu sinh vien!");
        Scanner input = new Scanner(System.in);
        int Choose;
        do {
        System.out.println("***Menu***");
        System.out.println("1. Nhập thông tin sinh viên");
        System.out.println("2. In thông tin sinh viên");
        System.out.println("3. Thoát chương trình");
        Choose = Integer.parseInt(input.nextLine());
        
        switch(Choose) {
            case 1:      
                System.out.println("Moi ban nhap thong tin sinh vien.");
                System.out.println("Ten sinh vien: ");
                ten = input.nextLine();
                System.out.println("Tuoi: ");
                tuoi = Integer.parseInt(input.nextLine());
                System.out.println("Dia chi: ");
                diachi = input.nextLine();
                System.out.println("Email: ");
                email = input.nextLine();
                System.out.println("Sdt: ");
                sdt = Integer.parseInt(input.nextLine());
                break;
            case 2:
                System.out.println("Ten sinh vien: " + ten);
                System.out.println("Tuoi: " + tuoi);
                System.out.println("Dia chi: " + diachi);
                System.out.println("Email: " + email);
                System.out.println("Sdt: " + sdt);
                break;
            case 3: 
                System.out.println("Thoat chương trình!");
                break;
            default: 
                System.out.println("Input failed!");
                break;
        }
    } while(Choose != 3);
}
}
    
