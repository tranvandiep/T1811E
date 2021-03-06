/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiassignment81;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Book implements IBook {
    private String bookName;
    private int yearPublishing;
    private String authorPseu;
    Scanner input = new Scanner(System.in);

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public String getAuthorPseu() {
        return authorPseu;
    }

    public void setAuthorPseu(String authorPseu) {
        this.authorPseu = authorPseu;
    }
    
    @Override
    public void input() {
        System.out.print("Nhap ten sach: ");
        this.bookName = input.nextLine();
        try {
            System.out.print("Nhap nam xuat ban sach: ");
            this.yearPublishing = Integer.parseInt(input.nextLine());
        } 
        
        catch(Exception e) {
            System.out.println("Chi duoc nhap nam xuat ban");
            System.out.print("Nhap lai nam xuat ban: ");
            this.yearPublishing = Integer.parseInt(input.nextLine());
        }
        
        System.out.print("Nhap but danh tac gia viet sach: ");
        this.authorPseu = input.nextLine();
    }

    @Override
    public String toString() {
        return (bookName + " - " + yearPublishing + " - " + authorPseu);
    }
    
    @Override
    public void display() {
        System.out.println(toString());
    }

    public Book(String bookName, int yearPublishing, String authorPseu) {
        this.bookName = bookName;
        this.yearPublishing = yearPublishing;
        this.authorPseu = authorPseu;
    }
}
