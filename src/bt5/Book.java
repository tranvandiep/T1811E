/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt5;

import java.util.Scanner;

/**
 *
 * @author Diep.Tran
 */
public class Book {
    private String bookName;

    private String bookAuthor;

    private String producer;

    private int yearPublishing;

    private float price;

    public Book() {
    }

    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public void input() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ten sach : ");
        bookName = input.nextLine();
        
        System.out.println("Ten tac gia : ");
        bookAuthor = input.nextLine();
        
        System.out.println("Nha xuat ban : ");
        producer = input.nextLine();
        
        System.out.println("Nhap nam xua ban : ");
        yearPublishing = Integer.parseInt(input.nextLine());
        
        System.out.println("Nhap gia ban : ");
        price = Float.parseFloat(input.nextLine());
    }

    public void display() {
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", producer=" + producer + ", yearPublishing=" + yearPublishing + ", price=" + price + '}';
    }
}
