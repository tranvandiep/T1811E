/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicOOP;

import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class Main {

    public static void main(String[] args) {
        int n;
        Book b1 = new Book();
        AptechBook b2 = new AptechBook();
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        do {
            System.out.println("Chon chuc nang! ");
            System.out.println("1. Them moi sach");
            System.out.println("2. Hien thi thong tin sach");
            int chon = input.nextInt();

            switch (chon) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        
                        System.out.println("Nhap so luong sach can dien thong tin: ");
                        n = input.nextInt();
                        System.out.printf("Nhap thong tin sinh vien thu %d:", i + 1);
                        b1.input();
                    }
                    break;
                case 2:
                    System.out.println("Hien thi thong tin vua nhap:");
                    b1.display();
            }
        } while (cont);

    }
}
