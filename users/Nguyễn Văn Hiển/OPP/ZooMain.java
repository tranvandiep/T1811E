/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ZooMain {
    
    public static int menuAndChose() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n1. Them chuong");
        System.out.println("2. Xoa chuong");
        System.out.println("3. Them con vat");
        System.out.println("4. Xoa con vat");
        System.out.println("5. Xem tat ca con vat");
        System.out.println("6. Thoat");
        System.out.print("Nhap lua chon: ");
        int chose = Integer.parseInt(input.nextLine());
        return chose;
    }
    
    public static int nextOrNo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Tiep tuc lua chon khac? YES/NO: ");
        String next = input.nextLine();
        if(next.equalsIgnoreCase("Yes") == true) {
            return 1;
        } else if(next.equalsIgnoreCase("NO") == true) {
            return 0;
        } else {
            System.out.println("Nhap sai gia tri. Chi duoc nhap YES hoac NO:");
            return nextOrNo();
        }
    }
    
    public static void main(String[] args) {
        int check;
        int chose = 0;
        int fillAnm = 0;
        int fillCage = 0;
        int next = 0;
        ZooCage anm = new ZooCage();
        Zoo cage = new Zoo();
        
        do {
            check = menuAndChose();
            if(check == 6) {
                chose = 6;
            }
            if(check == 1 || check == 2) {
                if(fillCage == 0) {
                    chose = 1;
                } else {
                    chose = check;
                }
            }
            if(check == 3 || check == 4 || check == 5) {
                if(fillAnm == 0) {
                    chose = 3;
                } else {
                    chose = check;
                }
            }
            switch(chose) {
                case 1:
                    cage.inputCage();
                    fillCage++;
                    break;
                case 2:
                    cage.deleteCage();
                    break;
                case 3:
                    anm.inputAnimal();
                    fillAnm++;
                    break;
                case 4:
                    anm.deleteAnimal();
                    break;
                case 5:
                    anm.showAnimal();
                    break;
                case 6:
                    break;  
            }
            if(chose != 6) {
                next = nextOrNo();
            }
        } while(chose > 0 && chose < 6 && next != 0);
    }
}
