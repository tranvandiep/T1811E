/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.hanoi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class ManagerHouse {

    public static void main(String[] args) {
        int choose;
        Scanner input = new Scanner(System.in);
        List<HaNoiHouse> hnHouseList = new ArrayList<>();

        do {
            showMenu();
            System.out.println("Choose: ");
            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("Nhap so nha muon them: ");
                    int n = Integer.parseInt(input.nextLine());

                    for (int i = 0; i < n; i++) {
                        HaNoiHouse hnHouse = new HaNoiHouse();
                        hnHouse.input();

                        hnHouseList.add(hnHouse);
                    }
                    break;
                case 2:
                    hnHouseList.forEach((hnhList) -> {
                        hnhList.display();
                    });
                    break;
                case 3:
                    Collections.sort(hnHouseList, new Comparator<HaNoiHouse>() {
                        @Override
                        public int compare(HaNoiHouse o1, HaNoiHouse o2) {
                            int cmp = o1.getDiaChi().compareTo(o2.getDiaChi());
                            if (cmp >= 0) {
                                return 1;
                            } else {
                                return -1;
                            }
                        }
                    });
                    hnHouseList.forEach((hnhList) -> {
                        hnhList.display();
                    });
                    break;
                case 4:
                    System.out.println("Nhap dia chi can tim: ");
                    String find = input.nextLine();

                    hnHouseList.forEach((hnhList) -> {
                        if (hnhList.getDiaChi().equalsIgnoreCase(find)) {
                            hnhList.display();
                        }
                    });
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.err.println("Nhap sai!");
                    break;
            }
        } while (choose != 5);
    }

    static void showMenu() {
        System.out.println("1. Nhap thong tin n ngoi nha.");
        System.out.println("2. Hien thi thong tin nha.");
        System.out.println("3. Sap xep theo dia chi va hien thi.");
        System.out.println("4. Tim kiem nha theo dia chi.");
        System.out.println("5. Thoat.");
    }
}
