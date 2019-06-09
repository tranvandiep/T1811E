/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt40;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Menu {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        String name = null;
        int age = 0;
        String adress = null;
        String mail = null;
        String phone = null;
        int so;
        
        for (;;){
            System.out.printf("1.Nhap thong tin sinh vien\n");
            System.out.printf("2.Hien thi thong tin sinh vien\n");
            System.out.printf("3.Thoat chuong trinh\n");
            System.out.printf("Chon thao tac: ");
            so = Integer.parseInt(input.nextLine());
            
            if (so == 1) {
                System.out.printf("Nhap ten sinh vien: ");
                name = input.nextLine();
                System.out.printf("Nhap tuoi sinh vien: ");
                age = Integer.parseInt(input.nextLine());
                System.out.printf("Nhap dia chi sinh vien: ");
                adress = input.nextLine();
                System.out.printf("Nhap mail sinh vien: ");
                mail = input.nextLine();
                System.out.printf("Nhap sdt sinh vien: ");
                phone = input.nextLine();  
                System.out.printf("**********Da nhap xong*********\n");
            }
            
            else if (so == 2) {
                System.out.printf("**********THONG TIN SINH VIEN*********\n");
                System.out.printf("Nhap ten sinh vien: %s\n", name);
                System.out.printf("Nhap ten sinh vien: %d\n", age);
                System.out.printf("Nhap ten sinh vien: %s\n", adress);
                System.out.printf("Nhap ten sinh vien: %s\n", mail);
                System.out.printf("Nhap ten sinh vien: %s\n", phone);      
                
            }
            
            else if (so == 3) break;
            else if (so >3 && so <1) {
                System.out.println("Ban nhap sai so\n");
                continue;
            }
        }
        
        System.out.printf("****Cam on ban da dung chuong trinh cua Hoang Quoc Bao****\n");
    }   
}
