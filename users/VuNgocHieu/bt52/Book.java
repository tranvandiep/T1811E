/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt52;
import java.util.Scanner;
/**
 *
 * @author Admin
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

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public void input() {
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.println("nhap ten sach");
        bookName = input.nextLine(); 
        
        System.out.println("tac gia");
        bookAuthor = input.nextLine(); 
        
        System.out.println("nha san xuat");
        producer = input.nextLine(); 
         
        System.out.println("nam xuat ban");
        yearPublishing = Integer.parseInt(input.nextLine()); 
    
        System.out.println("gia ban");
        price = Integer.parseInt(input.nextLine());
    }
    
    
    public void display() {
        System.out.println("ten sach " + bookName);
        System.out.println("tac gia " + bookAuthor);
        System.out.println("nha san xuat " + producer);
        System.out.println("nam xuat ban " + yearPublishing);
        System.out.println("gia ban " + price);
    }
}
