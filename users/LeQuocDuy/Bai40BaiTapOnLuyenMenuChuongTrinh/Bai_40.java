/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai40BaiTapOnLuyenMenuChuongTrinh;

import java.util.Scanner;

/**
 *
 * @author Duy Lumiere
 */
public class Bai_40 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Khai bao bien:
        boolean flag = true;
        int select;
        String name = " ";
        int age = 0;
        String address = " ";
        String email = " ";
        String phone = " ";
        
        int i = 0;
        
        do{
            System.out.println("CHUONG TRINNH QUAN LY SINH VIEN");
            System.out.println(" ");
            System.out.println("1. Nhap thong tin sinh vien");
            System.out.println("2. In thong tin sinh vien");
            System.out.println("3. Thoat chuong trinh");
            System.out.println(" ");
            System.out.print("Moi ban chon: ");
            select = input.nextInt();
            System.out.println(" ");
            
            i++;
            
            if(select==1){
                System.out.println("=== NHAP THONG TIN SINH VIEN ===");
                
                input.nextLine();
                System.out.print("- Nhap ten: ");
                name = input.nextLine();
                
                System.out.print("- Nhap tuoi: ");
                age = input.nextInt();
                
                input.nextLine();
                System.out.print("- Nhap dia chi: ");
                address = input.nextLine();
                
                System.out.print("- Nhap E-mail: ");
                email = input.nextLine();
                
                System.out.print("- Nhap So Dien Thoai: ");
                phone = input.nextLine();
                
                System.out.println("\n=== NHAP THONG TIN SINH VIEN THANH CONG ===\n\n\n");
            }
            else if(select==2){
                if((name==" ")&&(age==0)&&(address==" ")&&(email==" ")&&(phone==" ")){
                    System.out.println("BAN CHUA NHAP THONG TIN SINH VIEN!\n\n\n");
                }
                else{
                    System.out.println("=== HIEN THI THONG TIN SINH VIEN ===");
                    System.out.println("- Ten sinh vien: " + name);
                    System.out.println("- Tuoi: " + age);
                    System.out.println("- Dia chi: " + address);
                    System.out.println("- E-mail: " + email);
                    System.out.println("- SDT: " + phone);
                    System.out.println("\n\n");
                };
            }
            else if(select==3){
                flag = false;
                System.exit(0);
            }
            else{
                System.out.println("Vui long nhap dung 1 trong 3 gia tri 1,2 hoac 3!");
            };
        }
        while(flag==true);
    };
}