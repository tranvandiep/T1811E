/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt81assignment;
import java.util.Scanner;

/**
 *
 * @author ASUS
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
        System.out.print("Nhập tên sách: ");
        this.bookName = input.nextLine();
        try {
            System.out.print("Nhập năm xuất bản: ");
            this.yearPublishing = Integer.parseInt(input.nextLine());
        } catch(Exception e) {
            System.out.println("Nhập sai quy cách. Chỉ được nhập chữ số.");
            System.out.print("Nhập năm xuất bản: ");
            this.yearPublishing = Integer.parseInt(input.nextLine());
        }
        System.out.print("Nhập bút danh tác giả: ");
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

