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
import java.util.Scanner;

public class Book {
    String bookName;
    String bookAuthor;
    String producer;
    int yearPublishing;
    float price;
    
    Scanner input = new Scanner(System.in);
    
    public Book() {
        
    }

    
    public void setBookName(String bookName) {
        if(bookName.length() != 0) {
            this.bookName = bookName;
        }
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public void setYearPublishing(int yearPublishing) {
        if(yearPublishing >= 0) {
            this.yearPublishing = yearPublishing;
        }
    }
    public void setPrice(float price) {
        if(price >= 0) {
            this.price = price;
        }
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
    
    public void input() {
        do {
            System.out.print("Nhap ten sach: ");
            this.bookName = input.nextLine();
            if(this.bookName.length() == 0) {
                System.out.println("Khong duoc de trong ten sach");
            }
        } while(this.bookName.length() == 0);
        System.out.print("Nhap ten tac gia: ");
        this.bookAuthor = input.nextLine();
        System.out.print("Nhap ten nxb: ");
        this.producer = input.nextLine();
        do {
            System.out.print("Nhap nam xuat ban: ");
            this.yearPublishing = Integer.parseInt(input.nextLine());
            if(this.yearPublishing < 0) {
                System.out.println("Nam xuat ban khong duoc la so am");
            }
        } while(this.yearPublishing < 0);
        do {
            System.out.print("Nhap gia ban: ");
            this.price = Integer.parseInt(input.nextLine());
            if(this.price < 0) {
                System.out.println("Gia ban khong duoc la so am");
            }
        } while(this.price < 0);
    }
    
    
    
    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }
}
