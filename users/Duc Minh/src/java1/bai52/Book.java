/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai52;

import java.util.Scanner;

/**
 *
 * @author Minh
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

        System.out.print("Nhap ten sach: ");
        bookName = input.nextLine();
        System.out.print("Nhap ten tac gia: ");
        bookAuthor = input.nextLine();
        System.out.print("Nhap ten nha san xuat: ");
        producer = input.nextLine();
        System.out.print("Nhap nam san xuat: ");
        yearPublishing = input.nextInt();
        System.out.print("Nhap gia: ");
        price = input.nextFloat();
    }

    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", producer=" + producer + ", yearPublishing=" + yearPublishing + ", price=" + price + '}';
    }

}
