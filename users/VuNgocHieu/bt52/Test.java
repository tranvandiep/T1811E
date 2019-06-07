/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Test {
    static List<AptechBook> bookList  = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int Choose;
        
        do {
            showMenu();
            Choose = Integer.parseInt(input.nextLine());
         
            switch(Choose) {
                case 1: 
                    input();
                    break;
                case 2: 
                    display();
                    break;
                case 3: 
                    sortByYearPublishing();
                    break;
                case 4: 
                    searchByName();
                    break;
                case 5: 
                    searchByAuthor();
                    break;
                case 6: 
                    System.out.println("Exit!");
                    break; 
                default:
                    System.out.println("Input failed!");
                    break;
            }
            
        } while(Choose != 6);
    }    
    static void showMenu() {
        System.out.println("1.    Nhập thông tin n cuốn sách của Aptech");
        System.out.println("2.    Hiển thị thông tin vừa nhập");
        System.out.println("3.    Sắp xếp thông tin giảm dần theo năm xuất bản và hiển thị");
        System.out.println("4.    Tìm kiếm theo tên sách");
        System.out.println("5.    Tìm kiếm theo tên tác giả");
        System.out.println("6.    Thoát.");
        System.out.println("Chose: ");
    }
    
    private static void input() {
        System.out.println("Nhap so sach can them: ");
        int n = Integer.parseInt(input.nextLine());
        
        for (int i = 1 ; i <= n; i++) {
            System.out.println("Nhap sach thu " + i + ":" );
            AptechBook book = new AptechBook();
            book.input();
            
            bookList.add(book);
        }
    }
    
    private static void display() {
        for (int i = 0; i < bookList.size(); i++) {
            bookList.get(i).display();
        }
    }

    private static void sortByYearPublishing() {
        Collections.sort(bookList, new Comparator<AptechBook>() {
            @Override
            public int compare(AptechBook o1, AptechBook o2) {
                if(o1.getYearPublishing() > o2.getYearPublishing()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    private static void searchByName() {
        System.out.println("Nhap ten sach can tim : ");
        String bookName = input.nextLine();
        
        for (AptechBook aptechBook : bookList) {
            if(aptechBook.getBookName().equalsIgnoreCase(bookName)) {
                aptechBook.display();
            }
        }
    }

    private static void searchByAuthor() {
        System.out.println("Nhap ten tac gia can tim : ");
        String bookAuthor = input.nextLine();
        
        for (AptechBook aptechBook : bookList) {
            if(aptechBook.getBookAuthor().equalsIgnoreCase(bookAuthor)) {
                aptechBook.display();
            }
        }
    }
}
