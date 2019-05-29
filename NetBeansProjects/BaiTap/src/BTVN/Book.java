/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVN;

import java.util.Scanner;

/**
 *
 * @author giangduy
 */
public class Book {
    String bookName;
    String bookAuthor;
    String producer;
    int yearPublishing;
    float price;
    
    public Book() {
        System.out.println("Book");
    }
    
    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        System.out.println("Book");
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }
    public String getbookName() {
        return bookName;
    }
    public void setbookName(String bookName) {
        this.bookName = bookName;
    }
    public String getbookAuthor() {
        return bookAuthor;
    }
    public void setbookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public String getproducer() {
        return producer;
    }
    public void setproducer(String producer) {
        this.producer = producer;
    }
    public int getyearPublishing() {
        return yearPublishing;
    }
    public void setyearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
    public float getprice() {
        return price;
    }
    public void setprice(float price) {
        this.price = price;
    }
    public void input() {
        Scanner input = new Scanner(System.in);
        
        
        
    }
    
}
