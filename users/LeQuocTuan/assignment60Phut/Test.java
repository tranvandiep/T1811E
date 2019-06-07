/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.assignment60Phut;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author LQT
 */
public class Test {

    static ArrayList<IInfor> a = new ArrayList<>();

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int Choose;
        String Exit;
        boolean Rep = false;

        while (true) {
            ShowMenu();

            Choose = z.nextInt();

            switch (Choose) {
                case 1:
                    System.out.println("");
                    People People = new People();
                    People.input();
                    a.add(People);
                    System.out.println("Nhập thông tin của đối tượng " + People.getTen() + " thành công!");
                    break;
                case 2:
                    System.out.println("");
                    Car Car = new Car();
                    Car.input();
                    a.add(Car);
                    System.out.println("Nhập thông tin của đối tượng " + Car.getTen() + " thành công!");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("HIỂN THỊ THÔNG TIN");
                    a.forEach((e)->{
                        System.out.println(e.showInfor());
                    });
                    break;
                case 4:
                    System.out.println("");
                    z.nextLine();
                    do {
                        System.out.print("Bạn có chắc chắn muốn thoát chương trình? (y/n): ");
                        Exit = z.nextLine();
                        if (Exit.length() == 1) {
                            if (Exit.equalsIgnoreCase("y")) {
                                System.exit(0);
                            } else if (Exit.equalsIgnoreCase("n")) {
                                Rep = false;
                            } else {
                                Rep = true;
                            }
                        }
                        else{
                            Rep = true;
                        }
                    } while (Rep == true);
                    break;
            }
        }
    }

    public static void ShowMenu() {
        System.out.println("");
        System.out.println("NHẬP THÔNG TIN");
        System.out.println("1. Nhập NGƯỜI");
        System.out.println("2. Nhập XE");
        System.out.println("3. Hiển thị thông tin tất cả đối tượng");
        System.out.println("4. Thoát chương trình");
        System.out.print("Mời bạn chọn: ");
    }
}