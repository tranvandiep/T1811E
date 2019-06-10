/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentbt81;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {

    static List<Book> bookList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static List<Tacgia> tacgiaList = new ArrayList<>();

    public static void main(String[] args) {
        int Choose;

        do {
            System.out.println("1.    Nhập thông tin sách");
            System.out.println("2.    Hiển thị tất cả sách ra màn hình");
            System.out.println("3.    Nhập thông tin tác giả    ");
            System.out.println("4.    Tìm kiếm tất cả sách được viết bởi tác giả");
            System.out.println("5.    Thoát.");
            System.out.println("Chose: ");
            Choose = Integer.parseInt(input.nextLine());

            switch (Choose) {
                case 1:
                    input();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    inputtacgia();
                    break;
                case 4:
                    searchbytacgia();
                    break;
                case 5:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Input failed!");
                    break;
            }

        } while (Choose != 5);
    }

    private static void input() {
        System.out.println("Nhap so sach can them: ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap sach thu " + i + ":");
            Book book = new Book();
            book.input();
            boolean isFind = false;
            for (int j = 0; j < tacgiaList.size(); j++) {
                if (tacgiaList.get(j).getButdanh().equalsIgnoreCase(book.getButdanh())) {
                    isFind = true;
                    break;
                }
            }
            if (!isFind) {
                Tacgia tacgia = new Tacgia(book.getButdanh());
                tacgia.input();

                tacgiaList.add(tacgia);
            }

            bookList.add(book);
        }
    }

    private static void display() {
        for (int i = 0; i < bookList.size(); i++) {
            bookList.get(i).display();
        }
    }

    private static void inputtacgia() {
        System.out.println("Nhap so tac gia can them: ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            Tacgia tacgia = new Tacgia();
            tacgia.input(tacgiaList);

            tacgiaList.add(tacgia);
        }
    }

    private static void searchbytacgia() {
        System.out.println("nhap ten but danh tac gia cua sach can tim kiem: ");
        String butdanh = input.nextLine();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getButdanh().equalsIgnoreCase(butdanh)) {
                bookList.get(i).display();
            }
        }
    }
}
