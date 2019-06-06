/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai81;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DuongQuangHuy
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static List<Author> authorList = new ArrayList<>();
    static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    inputBook();
                    break;
                case 2:
                    displayBook();
                    break;
                case 3:
                    inputAuthor();
                    break;
                case 4:
                    searchBookAuthor();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("moi nhap lai");
                    break;
            }

        } while (choose != 5);

    }

    public static void showMenu() {
        System.out.println("1. Nhập thông tin sách");
        System.out.println("2. Hiển thị tất cả sách ra màn hình");
        System.out.println("3. Nhập thông tin tác giả");
        System.out.println("4. Tìm kiếm tất cả sách được viết bởi tác giả");
        System.out.println("5. Thoát");
        System.out.println("Choose :");
    }

    public static void inputAuthor() {

        System.out.println("nhap so tac gia can them");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("nhap tac gia thu : " + (i + 1));
            Author author = new Author();
            author.inputAuthor(authorList);

            authorList.add(author);
        }

    }

    private static void inputBook() {
        System.out.println("nhap so cuon sach can them :");
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            Book book = new Book();
            book.inputBook(authorList);

            boolean timkiem = false;
            for (int j = 0; j < authorList.size(); j++) {
                if (authorList.get(j).getPseudonym().equalsIgnoreCase(book.getPseudonym())) {
                    timkiem = true;
                    break;
                }
            }
            if (!timkiem) {
                System.out.println("nhap phan tac gia ---------------------------");
                Author author = new Author(book.getPseudonym());
                author.inputAuthor();

                // luu thong tin tac gia
                authorList.add(author);
            }
            bookList.add(book);
        }
    }

    private static void displayBook() {
        for (Book book : bookList) {
            book.displayBook();
        }
    }

    private static void searchBookAuthor() {
        System.out.println("nhap ten but danh can tim kiem : ");
        String author = input.nextLine();
        int count = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPseudonym().equalsIgnoreCase(author)) {
                bookList.get(i).displayBook();
                count++;
            }

        }
        if (count == 0) {
            System.out.println("khong tim thay !!!!!");
        }
    }
}
