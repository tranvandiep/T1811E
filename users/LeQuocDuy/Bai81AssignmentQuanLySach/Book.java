/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai81AssignmentQuanLySach;
import java.util.Scanner;
/**
 *
 * @author Duy Lumiere
 */
public class Book {
    Scanner in = new Scanner(System.in);
    
    private String BookName;
    private String BookPubDate;
    private String BookPenName;
    
    public Book(){
        
    }

    public Book(String BookName, String BookPubDate, String BookPenName) {
        this.BookName = BookName;
        this.BookPubDate = BookPubDate;
        this.BookPenName = BookPenName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getBookPubDate() {
        return BookPubDate;
    }

    public void setBookPubDate(String BookPubDate) {
        this.BookPubDate = BookPubDate;
    }

    public String getBookPenName() {
        return BookPenName;
    }

    public void setBookPenName(String BookPenName) {
        this.BookPenName = BookPenName;
    }
    
    public void BookInputInf(){
        System.out.println("NHẬP THÔNG TIN SÁCH: ");
        System.out.print("- Nhập tên: ");
        this.BookName = in.nextLine();
        System.out.print("- Nhập ngày xuất bản: ");
        this.BookPubDate = in.nextLine();
        System.out.print("- Nhập bút danh: ");
        this.BookPenName = in.nextLine();
    }
    
    public void BookShowInf(){
        System.out.println("THÔNG TIN SÁCH: ");
        System.out.println("- Tên sách: " + getBookName());
        System.out.println("- Ngày xuất bản: " + getBookPubDate());
        System.out.println("- Bút danh: " + getBookPenName());   
    }
    
    
}
