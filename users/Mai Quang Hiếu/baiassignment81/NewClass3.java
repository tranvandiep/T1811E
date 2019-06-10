/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiassignment81;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Library {
    Scanner input = new Scanner(System.in);
    List<Book> bookList = new ArrayList<Book>();
    List<Author> authorList = new ArrayList<Author>();
    
    public List<Book> inputBook(int flag) {
        Author author = new Author();
        int m = this.bookList.size();
        try {
            if(flag == 0) {
                System.out.print("Nhap so sach: ");
            } 
            
            else {
                System.out.print("Nhap so luong sach can them vao: ");
            }
        } 
        
        catch(Exception e) {
            System.out.println("Chi duoc nhap so");
            return inputBook(flag);
        }
        
        int n = Integer.parseInt(input.nextLine());
        
        for(int i = m; i < n+m; i++) {
            if(m == 0) {
                System.out.println("Nhap thong tin sach thu " +(i+1) +":");
            } 
            
            else {
                System.out.println("Nhap thong tin sach thu " +i +":");
            }
            
            Book book = new Book();
            book.input();
            this.bookList.add(book);
            
            if(this.authorList.size() == 0) {
                System.out.println(book.getAuthorPseu() +" la tac gia moi _ Nhap thogn tin tac gia moi");
                author.input();
            } 
            
            else {
                for(int j = this.authorList.size()-1; i < 0; i--) {
                    if(book.getAuthorPseu().equalsIgnoreCase(this.authorList.get(j).getAuthorPseu()) == false) {
                        System.out.println(book.getAuthorPseu() +" la tac gia moi _ Nhap thogn tin tac gia moi");
                        author.input();
                    }
                }
            }
            authorList.add(author);
        }
        return this.bookList;
    }
    
    public void displayBook() {
        for(Book book : this.bookList) {
            book.display();
        }
    }
    
    public List<Author> inputAuthor(int flag) {
        int m = this.authorList.size();
        try {
            if(flag == 0) {
                System.out.print("Nhap so luong tac gia: ");
            } 
            
            else {
                System.out.print("Nhap so luong tac gia can them vao: ");
            }
        } 
        
        catch(Exception e) {
            System.out.println("Chi duoc nhap so");
            return inputAuthor(flag);
        }
        
        int n = Integer.parseInt(input.nextLine());
        int a = 1;
        
        for(int i = m; i < n+m; i++) {
            if(m == 0) {
                System.out.println("Nhap thong tin tac gia thu " +(i+1) +":");
            } else {
                System.out.println("Nhap thong tin tac gia thu " +a +":");
                a++;
            }
            Author author = new Author();
            author.input();
            if(this.authorList.size() > 0) {
                for(int j = this.authorList.size()-1; j >= 0 ; j--) {
                    if(author.getAuthorPseu().equalsIgnoreCase(this.authorList.get(j).getAuthorPseu())) {
                        System.out.println("Da co but danh____ Xin nhap but danh khac");
                        author.input();
                    }
                }
            }
            this.authorList.add(author);
        }
        return this.authorList;
    }
    public void displayAuthor() {
        for(Author author : this.authorList) {
            author.display();
        }
    }
    
    public void searchByAuthorPseu() {
        int flag = 0;
        System.out.print("Nhap but danh tac gia sach can tim: ");
        String search = input.nextLine();
        
        for(Book book : this.bookList) {
            if(book.getAuthorPseu().equalsIgnoreCase(search)) {
                book.display();
                flag++;
            }
        }
        if(flag == 0) {
            System.out.println("Ko tim dc scah cua tac gia co but danh " +search);
        } 
        
        else {
            System.out.println("Co " +flag + " sach cua tac gia co but danh" +search);
        }
    }

    public Library() {
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }
}