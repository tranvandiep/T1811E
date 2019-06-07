/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession4;

import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Book {
    private String bookName;

    private String bookAuthor;

    private String producer;

    private int yearPublishing;

    private float price;

    public Book() { 
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
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap vao bookName : ");
        this.bookName = scanner.nextLine();
        
        System.out.println("Nhap vao bookAuthor : ");
        this.bookAuthor = scanner.nextLine();
        
        System.out.println("Nhap vao producer : ");
        this.producer = scanner.nextLine();
        
        System.out.println("Nhap vao yearPublishing : ");
        this.yearPublishing = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Nhap vao price : ");
        this.price = Float.parseFloat(scanner.nextLine());
    }
    
    public void display(){
        System.out.println("bookName : " + this.bookName);
        System.out.println("bookAuthor : " + this.bookAuthor);
        System.out.println("producer : " + this.producer);
        System.out.println("yearPublishing : " + this.yearPublishing);
        System.out.println("price : " + this.price);
    }
    
    public static void main(String[] args) {
        
    }
}
