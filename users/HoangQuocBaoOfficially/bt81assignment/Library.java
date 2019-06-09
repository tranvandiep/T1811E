/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt81assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
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
                System.out.print("Nhập số lượng sách: ");
            } 
            
            else {
                System.out.print("Nhập số lượng sách cần nhập thêm: ");
            }
        } 
        
        catch(Exception e) {
            System.out.println("Nhập sai quy cách. Chỉ được nhập chữ số");
            return inputBook(flag);
        }
        
        int n = Integer.parseInt(input.nextLine());
        
        for(int i = m; i < n+m; i++) {
            if(m == 0) {
                System.out.println("Nhập thông tin quyển sách thứ " +(i+1) +":");
            } 
            
            else {
                System.out.println("Nhập thông tin quyển sách thứ " +i +":");
            }
            
            Book book = new Book();
            book.input();
            this.bookList.add(book);
            
            if(this.authorList.size() == 0) {
                System.out.println(book.getAuthorPseu() +" là tác giả mới. Nhập thông tin tác giả mới");
                author.input();
            } 
            
            else {
                for(int j = this.authorList.size()-1; i < 0; i--) {
                    if(book.getAuthorPseu().equalsIgnoreCase(this.authorList.get(j).getAuthorPseu()) == false) {
                        System.out.println(book.getAuthorPseu() +" là tác giả mới. Nhập thông tin tác giả mới");
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
                System.out.print("Nhập số lượng tác giả: ");
            } 
            
            else {
                System.out.print("Nhập số lượng tác giả cần nhập thêm: ");
            }
        } 
        
        catch(Exception e) {
            System.out.println("Nhập sai quy cách. Chỉ được nhập chữ số");
            return inputAuthor(flag);
        }
        
        int n = Integer.parseInt(input.nextLine());
        int a = 1;
        
        for(int i = m; i < n+m; i++) {
            if(m == 0) {
                System.out.println("Nhập thông tin tác giả thứ " +(i+1) +":");
            } else {
                System.out.println("Nhập thông tin tác giả thứ " +a +":");
                a++;
            }
            Author author = new Author();
            author.input();
            if(this.authorList.size() > 0) {
                for(int j = this.authorList.size()-1; j >= 0 ; j--) {
                    if(author.getAuthorPseu().equalsIgnoreCase(this.authorList.get(j).getAuthorPseu())) {
                        System.out.println("Bút danh tac giả đã tồn tại. Nhập lại");
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
        System.out.print("Nhập bút danh tác giả của quyển sách cần tìm: ");
        String search = input.nextLine();
        
        for(Book book : this.bookList) {
            if(book.getAuthorPseu().equalsIgnoreCase(search)) {
                book.display();
                flag++;
            }
        }
        if(flag == 0) {
            System.out.println("Không tìm được quyển sách nào của tác giả " +search);
        } 
        
        else {
            System.out.println("Tìm được " +flag + " quyển sách của tác giả " +search);
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
