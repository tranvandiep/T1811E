/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai81;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DuongQuangHuy
 */
public class Book {
    String nameBook;
    String date;
    String pseudonym;
    
    public void inputBook(List<Author> authorList){
        Scanner input = new Scanner(System.in);
        
        System.out.println("nhap ten sach");
        nameBook = input.nextLine();
        System.out.println("nhap ngay xuat ban");
        date = input.nextLine();
        System.out.println("nhap but danh");
        pseudonym = input.nextLine();
    }
    public void displayBook(){
        System.out.printf(" ten sach : %s"
                + " ngay xuat ban : %s"
                + " but danh :  %s" , nameBook , date , pseudonym);
        System.out.println(" ");
    }

    public Book() {
    }

    public Book(String nameBook, String date, String pseudonym) {
        this.nameBook = nameBook;
        this.date = date;
        this.pseudonym = pseudonym;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

  
    
}
