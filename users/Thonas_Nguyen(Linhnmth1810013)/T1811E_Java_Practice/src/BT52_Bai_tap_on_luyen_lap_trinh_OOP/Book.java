/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT52_Bai_tap_on_luyen_lap_trinh_OOP;

import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class Book {
    private String bookName;
    private String bookAuthor;
    private String producer;
    private int yearPublishing;
    private float price;

    // 2 constructors, các phương thức set/get cho các thuộc tính của lớp.
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
    public static void main(String[] args) {
        
    }
    
    public void display(){
        System.out.println("Ten sach:" + this.bookName);
        System.out.println("Tac gia:" + this.bookAuthor);
        System.out.println("Nha san xuat:" + this.producer);
        System.out.println("Gia sach:" + this.price);
        System.out.println("Nam xuat ban:" + this.yearPublishing);
    }
    
}
