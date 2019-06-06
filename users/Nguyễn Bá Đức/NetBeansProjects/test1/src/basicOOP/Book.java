/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicOOP;

import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class Book {
    private String bookName;
    private String bookAuthor;
    private String producer;
    private int yearPublishing;
    private float price;

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
    
    public Book(){};
    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }
    
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Name: ");
        bookName = input.nextLine();
        System.out.println("Author: ");
        bookAuthor = input.nextLine();
        System.out.println("Producer: ");
        producer = input.nextLine();
        System.out.println("year publishing: ");
        yearPublishing = input.nextInt();
        System.out.println("Price: ");
        price = Integer.parseInt(input.nextLine());
        
    }
    
    public void display(){
        System.out.println("Name : " + bookName);
        System.out.println("Author : " + bookAuthor);
        System.out.println("Producer : " + producer);
        System.out.println("Year Publishing : " + yearPublishing);   
        System.out.println("Price : " + price);
    }
}
