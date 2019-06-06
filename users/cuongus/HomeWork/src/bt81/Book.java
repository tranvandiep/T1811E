/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt81;

import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class Book {
    String bookName;
    String createdArt;
    String nickname;

    public Book() {
    }

    public Book(String bookName, String createdArt, String nickname) {
        this.bookName = bookName;
        this.createdArt = createdArt;
        this.nickname = nickname;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap ten sach: ");
        bookName = input.nextLine();
        
        System.out.println("Nhap ngay xuat ban: ");
        createdArt = input.nextLine();
        
        System.out.println("Nhap but danh: ");
        nickname = input.nextLine();
        
        System.out.println("*--------------------------*");
    }
    
    public void dislay(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", createdArt=" + createdArt + ", nickname=" + nickname + '}';
    }
    
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCreatedArt() {
        return createdArt;
    }

    public void setCreatedArt(String createdArt) {
        this.createdArt = createdArt;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    
}
