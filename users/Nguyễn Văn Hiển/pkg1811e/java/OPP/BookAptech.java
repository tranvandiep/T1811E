/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class BookAptech extends Book {
    String language;
    int semester;

    public BookAptech(String language, int semester) {
        this.language = language;
        this.semester = semester;
    }
    
    public BookAptech() {
        
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public void setSemester(int semester) {
        if(semester >= 0) {
            this.semester = semester;
        }
    }
    
    public String getLanguage() {
        return language;
    }
    public int getSemester() {
        return semester;
    }

    public void inputAptech() {
        super.input();
        System.out.print("Nhap ngon ngu: ");
        this.language = input.nextLine();
        do {
            System.out.print("Nhap hoc ky: ");
            this.semester = Integer.parseInt(input.nextLine());
            if(this.semester <= 0) {
                System.out.println("Khong duoc nhap hoc ky la so am");
            }
        } while(this.semester <= 0);
    }
    public void display() {
        System.out.println(bookName +" - " +bookAuthor +" - " +producer +" - " +yearPublishing +" - " +price +" - " +language +" - " +semester);
    }
    
    @Override
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
    
    
    
    public BookAptech(String language, int semester, String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        super(bookName, bookAuthor, producer, yearPublishing, price);
        this.language = language;
        this.semester = semester;
    }

    
}
