/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.Basic;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class BasicMenuExample {
    
    public static void fillStudentInfo() {
        Scanner input = new Scanner(System.in);
    }
    public static void mainMenu() {
        System.out.println("1. Nhap thong tim sinh vien");
        System.out.println("2. In thong tin sinh vien");
        System.out.println("3. Thoat chuong trinh");
    }
    public static int choose() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNhap lua chon: ");
        int chose = input.nextInt();
        if(chose < 1 || chose > 3) {
            System.out.println("Lua chon khong hop le. Nhap lai");
            return choose();
        } else {
        return chose;
        }
    }
    public static void enterSelection(int select) {
        switch(select) {
            case 1:
                System.out.println("Bat dau nhap thong tim sinh vien");
                mainMenu();
                int a = choose();
                enterSelection(a);
                break;
            case 2:
                System.out.println("In ra thong tin sinh vien");
                mainMenu();
                int b = choose();
                enterSelection(b);
                break;
            case 3:                    
                break;
        }
    }
    
    public static void main(String[] args) {
        mainMenu();
        int a = choose();
        enterSelection(a);
    }
}
