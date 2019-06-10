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
 * @author Admin
 */
public class ManagerHouse {

    static Scanner input = new Scanner(System.in);
    static List<HaNoiHouse> hanoihouseList = new ArrayList<>();

    public static void main(String[] args) {

        int choose;

        do {
            System.out.println("\n**MENU**");
            System.out.println("1. Nhập thông tin n ngôi nhà ở Hà Nội");
            System.out.println("2. Hiển thị thông tin của n ngôi nhà đó.");
            System.out.println("3. Sắp xếp theo trường địa chỉ và hiển thị thông tin sau khi sắp xếp.");
            System.out.println("4. Tìm kiếm nhà theo địa chỉ nhập vào.");
            System.out.println("5. Thoát.");
            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    input();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    sortbydiachi();
                    break;
                case 4:
                    searchbydiachi();
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Nhập sai!");
                    break;
            }
        } while (choose != 5);
    }

    private static void input() {
        System.out.println("Nhập n ngôi nhà: ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Mời bạn nhập ngôi nhà thứ " + (i + 1) + ":");
            HaNoiHouse hanoihouse = new HaNoiHouse();
            hanoihouse.input();

            hanoihouseList.add(hanoihouse);
        }
    }

    private static void display() {
        if (hanoihouseList.isEmpty()) {
            System.out.println("Thông tin nhà chưa được nhập, vui lòng nhập thông tin nhà trước khi thực hiện bước này!");
        } else {
            for (HaNoiHouse house : hanoihouseList) {
                house.display();
            }
        }
    }

    private static void searchbydiachi() {
        if (hanoihouseList.isEmpty()) {
            System.out.println("Thông tin nhà chưa được nhập, vui lòng nhập thông tin nhà trước khi thực hiện bước này!");
        } else {
            System.out.println("Nhập địa chỉ cần tìm : ");
            String diachi = input.nextLine();

            for (HaNoiHouse house : hanoihouseList) {
                if (house.getDiaChi().equalsIgnoreCase(diachi)) {
                    System.out.println("Đã tìm được nhà có địa chỉ : " + diachi);
                    house.display();
                    break;
                } else if (!house.getDiaChi().equalsIgnoreCase(diachi)) {
                    System.out.println("Không tìm được địa chỉ nhà phù hợp!");
                }
            }
        }
    }

    private static void sortbydiachi() {
        if (hanoihouseList.isEmpty()) {
            System.out.println("Thông tin nhà chưa được nhập, vui lòng nhập thông tin nhà trước khi thực hiện bước này!");
        } else {
            Collections.sort(hanoihouseList, new Comparator<HaNoiHouse>() {
                @Override
                public int compare(HaNoiHouse o1, HaNoiHouse o2) {
                    if (o1.getDiaChi().compareToIgnoreCase(o2.getDiaChi()) > 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            });
        }
        for (HaNoiHouse house : hanoihouseList) {
            System.out.println(house);
        }
    }
}
