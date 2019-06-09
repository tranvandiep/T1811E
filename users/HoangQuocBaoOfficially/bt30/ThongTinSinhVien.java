/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt30;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ThongTinSinhVien {
    public static void main(String [] args ) {
        Scanner input = new Scanner(System.in);
        
        String name;
        int age; 
        String adress;
        String email;
        String phoneNumber;
        
        System.out.printf("Nhap ten sinh vien: ");
        name = input.nextLine();
        
        System.out.printf("Nhap tuoi sinh vien: ");
        age = Integer.parseInt(input.nextLine());
        
        System.out.printf("Nhap dia chi sinh vien: ");
        adress = input.nextLine();
        
        System.out.printf("Nhap mail sinh vien: ");
        email = input.nextLine();
        
        System.out.printf("Nhap sdt sinh vien: ");
        phoneNumber = input.nextLine();        
        
        System.out.printf("__________THONG TIN SINH VIEN___________\n");
        System.out.printf("Ten sinh vien la: %s\n", name);
        System.out.printf("Ten sinh vien la: %d\n", age);
        System.out.printf("Ten sinh vien la: %s\n", adress);
        System.out.printf("Ten sinh vien la: %s\n", email);
        System.out.printf("Ten sinh vien la: %s\n", phoneNumber);
        
    }
}
