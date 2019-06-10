/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author vuqua
 */
public class Book {
    String bookName;
    String createdAt;
    String nickName;

    public Book() {
    }

    public Book(String bookName, String createdAt, String nickName) {
        this.bookName = bookName;
        this.createdAt = createdAt;
        this.nickName = nickName;
    }

    public void input() {
        System.out.println("-----------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten sach: ");
        bookName=input.nextLine();
        
        System.out.println("Ngay xuat ban: ");
        createdAt = input.nextLine();
        
        System.out.print("Nhap but danh: ");
        nickName= input.nextLine();
    } 
    
    public void display(){
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", createdAt=" + createdAt + ", nickName=" + nickName + '}';
    }
    
    
    
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    
    
}
