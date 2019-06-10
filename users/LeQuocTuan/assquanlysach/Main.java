/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assquanlysach;

import java.util.Scanner;

/**
 *
 * @author LQT
 */
public class Main {
    

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;

        do {
            showMenu();
            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("=== Them sach ===");
                    System.out.println("Nhap so luong sach can then : ");
                    int s;
                    s = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < s; i++) {
                        System.out.println("Nhap vao thong tin cuon sach thu " + (i + 1));
                        Book book = new Book();
                        book.inputBook();
                    }
                    break;

                case 2:
                        System.out.println("=== Thong tin tat ca cac sach ===");
                        for(int i = 1; i <= Book.listBook.size(); i++){
                            System.out.println("Stt : " + i);
                            Book.listBook.get(i-1).showInfoBook();
                        }
                            
                    break;

                case 3:
                    System.out.println("=== Nhap thong tin tac gia ===");
                    Author author = new Author();
                    author.inputAuthor();
                    break;

                case 4:
                    System.out.println("=== Tim kiem sach theo ten tac gia ===");
                    System.out.println("Nhap vao ten tac gia : ");
                    String nameAuthorSearch = input.nextLine();
                    for(int i = 0; i < Book.listBook.size(); i++){
                        if(Book.listBook.get(i).getPseudonym().equalsIgnoreCase(nameAuthorSearch)){
                            Book.listBook.get(i).showInfoBook();
                        }
                        else{
                            System.out.println("Khong co sach cua tac gia nay !!!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thoat chuong trinh !!!");
                    break;
            }

        } while (choose != 5);
    }

    static void showMenu() {
        System.out.println("== Menu ==");
        System.out.println("1. Nhap thong tin sach ");
        System.out.println("2. Hien thi tat ca cac sach ra man hinh ");
        System.out.println("3. Nhap thong tin tac gia ");
        System.out.println("4. Tim kiem sach theo ten tac gia ");
        System.out.println("5. Thoat !!!");
    }

}
