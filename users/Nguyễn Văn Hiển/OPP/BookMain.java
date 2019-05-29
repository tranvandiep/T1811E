/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

/**
 *
 * @author PC
 */

public class BookMain {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        int check = 0;
        int chose = 0;
        int flag = 1;
        
        do {
            bookList.bookMenu();
            check = bookList.choseRoute();
            if(flag == 1 && check != 6) {
                chose = 1;
                System.out.println("Danh sach trong. Phai nhap thong tin sach truoc");
            } else {
                chose = check;
            }
            switch(chose) {
                case 1:
                    if(flag == 1) {
                        bookList.inputList();
                    } else {
                        bookList.addList();
                        bookList.coppyList();
                    }
                    break;
                case 2:
                    System.out.println("Danh sach sach da nhap: ");
                    bookList.displayList();
                    break;
                case 3:
                    System.out.println("Danh sach sap xep giam dan theo nam xuat ban:");
                    bookList.sortList();
                    bookList.displayList();
                    break;
                case 4:
                    bookList.searchByName();
                    break;
                case 5:
                    bookList.searchByAuthor();
                    break;
                case 6:
                    break;
            }
            flag++;
            if(chose == 6) {
                break;
            }
            boolean a = bookList.yesNo();
            if(a == true) {
                continue;
            }
            if(a == false) {
                break;
            }
        } while(chose > 0 && chose <6);
    }
}
