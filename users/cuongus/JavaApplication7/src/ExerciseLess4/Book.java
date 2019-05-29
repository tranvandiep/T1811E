/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciseLess4;

import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class Book {
    private String bookName;
    private String bookAuthor;
    private String producer;
    private int yearPublishing;
    private float price;
    
    public Book(){
    
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
    
    public void input(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap ten cuon sach: ");
        bookName = input.nextLine();
        
        System.out.println("Nhap ten tac gia: ");
        bookAuthor = input.nextLine();
        
        System.out.println("Nhap ten nha san xuat: ");
        producer = input.nextLine();
        
        System.out.println("Nhap nam xuat ban: ");
        yearPublishing = Integer.parseInt(input.nextLine());
        
//         while (yearPublishing <= 0){
//            System.out.println("Nhap nam xuat ban voi so nguyen duong: ");
//        yearPublishing = Integer.parseInt(input.nextLine());
//        }
        
        System.out.println("Nhap gia ban: ");
        price = Integer.parseInt(input.nextLine());
        
//        while (price <= 0){
//            System.out.println("Nhap gia  ban voi so duong: ");
//        price = Integer.parseInt(input.nextLine());
//        }
    }
    
    public void display(){
        System.out.println("Ten cuon sach: " + bookName);
        System.out.println("Tac gia: " + bookAuthor);
        System.out.println("Nha xuat ban: " + producer);
        System.out.println("Nam xuat ban: " + yearPublishing);
        System.out.println("Gia ban: " + price);
    }
}
