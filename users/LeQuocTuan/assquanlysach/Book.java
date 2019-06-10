/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assquanlysach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LQT
 */
public class Book {

    private String bookName;
    private String publicationDate;
    private String pseudonym;
    Author author;

    public static ArrayList<Book> listBook = new ArrayList<Book>();

    public Book() {
        listBook.add(this);
    }

    public Book(String bookName, String publicationDate, String pseudonym) {
        this.bookName = bookName;
        this.publicationDate = publicationDate;
        this.pseudonym = pseudonym;
        listBook.add(this);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public void inputBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten sach : ");
        bookName = input.nextLine();

        System.out.println("Nhap ngay xuat ban : ");
        publicationDate = input.nextLine();

        System.out.println("Nhap vao but danh tac gia : ");
        pseudonym = input.nextLine();
        if (Author.contains(pseudonym)) {
            author = Author.get(pseudonym);
        } else {
            System.out.println("Chua co tac gia voi but danh: " + pseudonym);
            System.out.println("Tao moi:");
            author = new Author();
            author.inputAuthor();
        }
    }
    
    public void showInfoBook(){
        System.out.println("Ten sach : " + bookName);
        System.out.println("Ngay xuat ban : "+ publicationDate);
        System.out.println("But danh tac gia : "  + pseudonym);
    }
}
