/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Scanner2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Ten;
        int Tuoi;
        String Diachi;
        int Sodienthoai;
        System.out.println("Nhap ten : ");
        Ten = scanner.nextLine();
        System.out.println("Nhap tuoi : ");
        Tuoi =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap dia chi : ");
        Diachi = scanner.nextLine();
        System.out.println("Nhap so dien thoai : ");
        Sodienthoai = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Ten la : " + Ten);
        System.out.println("Tuoi la : "+Tuoi);
        System.out.println("Dia chi la : " + Diachi);
        System.out.println("So dien thoai: " +Sodienthoai);

    }
    

}
