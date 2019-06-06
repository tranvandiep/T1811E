/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llnfor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DuongQuangHuy
 */
public class Test {

    static List<IInfor> list = new ArrayList<IInfor>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;
        do {
            ShowMenu();
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    inputPeople();
                    break;
                case 2:
                    inputCat();
                    break;
                case 3:
                    showInfor();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("moi chon lai");
                    break;
            }

        } while (choose != 4);

    }

    public static void ShowMenu() {
        System.out.println("moi choi ");
        System.out.println("1 nhap thong tin people ");
        System.out.println("2 nhap thong tin Cat ");
        System.out.println("3 hien thi da nhap ");
        System.out.println("4 thoat ");
        System.out.println("choose : ");
    }

    public static void inputPeople() {
        int n;
        System.out.println("nhap so nguoi can nhap");
        n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("nguoi thu : " + (i + 1));
            People p = new People();
            p.input();

            list.add(p);
        }

    }

    public static void inputCat() {
        int n;
        System.out.println("nhap so cat can them");
        n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("cat thu : " + (i + 1));
            Cat c = new Cat();
            c.input();

            list.add(c);
        }

    }

    public static void showInfor() {
       for (IInfor infor : list) {
            infor.showInfor();
            System.out.println("\n");
        }
     
    }

}
