/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.bai81;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Main {

    public static void main(String[] args) {
        int choose;
        Scanner input = new Scanner(System.in);

        do {
            showMenu();
            System.out.println("Choose: ");
            choose = Integer.parseInt(input.nextLine());
            List<Book> bookList = new ArrayList<>();
            List<TacGia> tgList = new ArrayList<>();

            switch (choose) {
                case 1:
                    System.out.println("Nhap so sach can them: ");
                    int n = Integer.parseInt(input.nextLine());

                    for (int i = 0; i < n; i++) {
                        Book book = new Book();
                        book.input();
                        boolean cache = false;
                        for (int j = 0; j < tgList.size(); j++) {
                            if (tgList.get(j).getButDanh().equalsIgnoreCase(book.getButDanh())) {
                                cache = true;
                                break;
                            }
                        }
                        if (!cache) {
                            TacGia tacGia = new TacGia(book.getButDanh());
                            tacGia.input();

                            tgList.add(tacGia);
                        }

                        bookList.add(book);
                    }
                    break;
                case 2:
                    bookList.forEach((bList) -> {
                        bList.display();
                    });
                    break;
                case 3:
                    System.out.println("Nhap so tac gia can them: ");
                    int m = Integer.parseInt(input.nextLine());

                    for (int i = 0; i < m; i++) {
                        TacGia tacGia = new TacGia();
                        tacGia.input(tgList);

                        tgList.add(tacGia);
                    }
                    break;
                case 4:
                    System.out.println("Nhap but danh tan tim: ");
                    String find = input.nextLine();
                    bookList.stream().filter((bList) -> (bList.getButDanh().equalsIgnoreCase(find))).forEachOrdered((bList) -> {
                        bList.display();
                    });
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.err.println("Nhap sai!");
                    break;

            }

        } while (choose
                != 5);
    }

    static void showMenu() {
        System.out.println("1. Nhap thong tin sach.");
        System.out.println("2. Hien thi thong tin sach.");
        System.out.println("3. Nhap thong tin tac gia.");
        System.out.println("4. Tim kiem sach theo tac gia.");
        System.out.println("5. Thoat.");
    }
}
