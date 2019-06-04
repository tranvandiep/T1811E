/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai48;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Program {

    public static void main(String[] args) {
        cTivi ctivi;
        Scanner input = new Scanner(System.in);
        int choose;
        System.out.println("Chon cach khoi tao tivi: ");
        System.out.println("1. Mac dinh.");
        System.out.println("2. Lua chon kenh.");
        System.out.println("Choose: ");
        int n = Integer.parseInt(input.nextLine());

        if (n == 1) {
            ctivi = new cTivi();
        } else {
            System.out.println("Nhap so kenh muon tao: ");
            int m = Integer.parseInt(input.nextLine());
            String[] channel = new String[m];

            for (int i = 0; i < m; i++) {
                System.out.printf("Nhap kenh thu %d:", m + 1);
                channel[i] = input.nextLine();
            }
            ctivi = new cTivi(channel);
        }

        do {
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            System.out.println("Choose: ");
            switch (choose) {
                case 1:
                    ctivi.Switch();
                    break;
                case 2:
                    System.out.println("Nhap kenh muon chuyen den: ");
                    String toChannel = input.nextLine();
                    ctivi.Switch(toChannel);
                    break;
                case 3:
                    ctivi.On();
                    break;
                case 4:
                    ctivi.Off();
                    break;
                case 5:
                    ctivi.nextChannel();
                    break;
                case 6:
                    ctivi.previousChannel();
                    break;
                case 7:
                    ctivi.show();
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.err.println("Nhap sai!");
                    break;
            }

        } while (choose != 8);
    }

    static void showMenu() {
        System.out.println("1. Chuyen trang thai.");
        System.out.println("2. Chuyen trang thai theo kenh.");
        System.out.println("3. Bat Tivi.");
        System.out.println("4. Tat Tivi.");
        System.out.println("5. Chuyen kenh tiep.");
        System.out.println("6. Chuyen kenh truoc.");
        System.out.println("7. Xem thong tin Tivi.");
        System.out.println("8. Ket thuc.");
    }
}
