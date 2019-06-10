/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.hanoi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class ManagerHouse {

    public static void main(String[] args) {
        int n;
        int choose;
        List<HaNoiHouse> houseHnList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            showMenu();
            choose = Integer.parseInt(scanner.nextLine());
//            while (choose < 1 || choose >5) {                
//                System.out.println("Lua chon khong co trong danh sach : ");
//                System.out.println("Chon muc muon thuc hien : ");
//                choose = Integer.parseInt(scanner.nextLine());
//            }

            switch (choose) {
                case 1:
                    System.out.println("Nhap so ngoi nha can them thong tin : ");
                    n = Integer.parseInt(scanner.nextLine());

                    while (n < 1) {
                        System.err.println("Nhap so nha can them khac : ");
                        n = Integer.parseInt(scanner.nextLine());
                    }

                    for (int i = 0; i < n; i++) {
                        HaNoiHouse house = new HaNoiHouse();
                        System.out.printf("Nhap thong tin nha thu %d : \n", i + 1);
                        house.input();
                        System.out.println("");
                        houseHnList.add(house);
                    }
                    break;
                case 2:
                    if (houseHnList.size() < 1) {
                        System.err.println("Khong co ngoi nha nao de hien thi !");
                        break;
                    } else {
                        System.out.println("");

                        houseHnList.forEach((t) -> {
                            t.display();
                        });

                        System.out.println("");
                        break;
                    }
                case 3:
                    if (houseHnList.size() < 1) {
                        System.err.println("Khong co ngoi nha nao de hien thi !");
                        break;
                    } else {
                        List<String> arrDiaChi = new ArrayList<>();
                        System.out.println("");

                        houseHnList.forEach((t) -> {
                            arrDiaChi.add(t.getDiaChi());
                        });
                        Collections.sort(arrDiaChi);

                        arrDiaChi.forEach((t) -> {
                            houseHnList.forEach((y) -> {
                                if (y.getDiaChi() == t) {
                                    y.display();
                                }
                            });
                        });
                        System.out.println("");
                        break;
                    }
                case 4:
                    HaNoiHouse serchHouse = new HaNoiHouse();
                    
                    System.out.println("Hay nhap dia chi nha can tim ! ");
                    System.out.println("Nhap so nha : ");
                    serchHouse.setSoNha(scanner.nextLine());
                    System.out.println("Nhap dia chi : ");
                    serchHouse.setDiaChi(scanner.nextLine());
                    System.out.println("Nhap ten quan : ");
                    serchHouse.setTenQuan(scanner.nextLine());
                    
                    houseHnList.forEach((t) -> {
                        if(t.equals(serchHouse)){
                            t.display();
                        }
                    });
                    break;
                case 5:
                    System.out.println("Tam biet!!!");
                    break;
                default:
                    System.err.println("Nhap sai!!!");
                    break;
            }
        } while (choose != 5);
    }

    static void showMenu() {
        System.out.println("1. Nhập thông tin n ngôi nhà ở Hà Nội");
        System.out.println("2. Hiển thị thông tin của n ngôi nhà đó.");
        System.out.println("3. Sắp xếp theo trường địa chỉ và hiển thị thông tin sau khi sắp xếp.");
        System.out.println("4. Tìm kiếm nhà theo địa chỉ nhập vào.");
        System.out.println("5. Thoát.");
        System.out.println("Chon muc muon thuc hien : ");
    }
}
