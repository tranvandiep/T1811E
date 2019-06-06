/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai52BaiTapOnLuyenLapTrinhOOP;

/**
 *
 * @author Duy Lumiere
 */
public class Book {
                private String bookName;
                private String producer;
                private int yearPublishing;
                private float price;
                private String bookAuthor;
                
                public Book(){
                    
                }
                
                public Book(String bookName, String producer, int yearPublishing, float price) {
                    this.bookName = bookName;
                    this.producer = producer;
                    this.yearPublishing = yearPublishing;
                    this.price = price;
                }

                public String getBookAuthor() {
                    return bookAuthor;
                }

                public void setBookAuthor(String bookAuthor) {
                    this.bookAuthor = bookAuthor;
                }
                
                public String getBookName() {
                    return bookName;
                }

                public void setBookName(String bookName) {
                    this.bookName = bookName;
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
                
                public void input(String bookName, String producer, int yearPublishing, float price){
                    this.bookName = bookName;
                    this.producer = producer;
                    this.yearPublishing = yearPublishing;
                    this.price = price;
                }
                
                public void display(){
                    System.out.println("Tên sách là: " + this.bookName);
                    System.out.println("Tác giả là:  " + this.bookAuthor);
                    System.out.println("Tên NXB của sách là: " + this.producer);
                    System.out.println("Năm xuất bản của sách là: " + this.yearPublishing);
                    System.out.println("Giá: " + this.price);
                }
                
                
                
    
}
