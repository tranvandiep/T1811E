/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

/**
 *
 * @author PC
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookList extends BookAptech {
    BookAptech bookAptech = new BookAptech();
    Scanner input = new Scanner(System.in);
    List<BookAptech> listBook = new ArrayList<BookAptech>();
    List<BookAptech> addBook = new ArrayList<BookAptech>();

    public BookList() {
        
    }
    public void setBookAptech(BookAptech bookAptech) {
        this.bookAptech = bookAptech;
    }
    public void setListBook(List<BookAptech> listBook) {
        this.listBook = listBook;
    }
    public void setAddBook(List<BookAptech> addBook) {
        this.addBook = addBook;
    }
    public BookAptech getBookAptech() {
        return bookAptech;
    }
    public List<BookAptech> getListBook() {
        return listBook;
    }
    public List<BookAptech> getAddBook() {
        return addBook;
    }

    
    public void inputList() {
        System.out.print("So luong sach can nhap: ");
        int n = input.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.printf("Nhap cuon sach thu %d\n", i+1);
            bookAptech.inputAptech();
            BookAptech book = new BookAptech(bookAptech.getLanguage(), bookAptech.getSemester(), bookAptech.getBookName(), bookAptech.getBookAuthor(), bookAptech.getProducer(), bookAptech.getYearPublishing(), bookAptech.getPrice());
            listBook.add(book);
        }
    }
    
    public void addList() {
        System.out.print("So luong sach can nhap them: ");
        int n = input.nextInt();
        for(int i = 0; i < listBook.size(); i++) {
            BookAptech book = listBook.get(i);
            addBook.add(book);
        }
        for(int i = listBook.size()-1; i < n-1+listBook.size(); i++) {
            System.out.printf("Nhap cuon sach thu %d\n", i+1);
            bookAptech.inputAptech();
            BookAptech book = new BookAptech(bookAptech.getLanguage(), bookAptech.getSemester(), bookAptech.getBookName(), bookAptech.getBookAuthor(), bookAptech.getProducer(), bookAptech.getYearPublishing(), bookAptech.getPrice());
            addBook.add(book);
        }
    }
    
    public void coppyList() {
        listBook.clear();
        for(int i = 0; i < addBook.size(); i++) {
            BookAptech book = addBook.get(i);
            listBook.add(book);
        }
        
    }
    
    public void displayList() {
        for(BookAptech book : listBook) {
            book.display();
        }
    }
        
    public void sortList() {
        Collections.sort(listBook, new Comparator<BookAptech>() {
            @Override
            public int compare(BookAptech y1, BookAptech y2) {
                if (y1.getYearPublishing() < y2.getYearPublishing()) {
                    return 1;
                } else {
                    if (y1.getYearPublishing() == y2.getYearPublishing()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }
    
    public void searchByName() {
        input.nextLine();
        System.out.print("Nhap ten sach can tim: ");
        String findName = input.nextLine();
        int flag = 0;
        for(int i = 0; i < listBook.size(); i++) {
            if(listBook.get(i).getBookName().equalsIgnoreCase(findName) == true) {
                listBook.get(i).display();
                flag++;
            }
        }
        searchCountResult(flag);
    }
    
    public void searchByAuthor() {
        input.nextLine();
        System.out.print("Nhap ten tac gia can tim: ");
        String findName = input.nextLine();
        int flag = 0;
        for(int i = 0; i < listBook.size(); i++) {
            if(listBook.get(i).getBookAuthor().equalsIgnoreCase(findName) == true) {
                listBook.get(i).display();
                flag++;
            }
        }
        searchCountResult(flag);

    }
    
    public void searchCountResult(int a) {
        if(a == 0) {
            System.out.println("Sach muon tim khong co trong danh sach");
        } else {
            System.out.printf("Tin duoc %d ket qua", a);
        }
    }
    
    public void bookMenu() {
        System.out.println("1. Nhap thong tin sach");
        System.out.println("2. In ra danh sach vua nhap");
        System.out.println("3. In ra danh sach theo nam xuat ban giam dan");
        System.out.println("4. Tim kiem theo ten sach");
        System.out.println("5. Tim kiem theo ten tac gia");
        System.out.println("6. Thoat");
    }
    
    public int choseRoute() {
        System.out.print("Nhap lua chon: ");
        int a = Integer.parseInt(input.nextLine());
        if(a < 1 || a > 6) {
            System.out.println("Lua chon khong hop le. Nhap lai");
            return choseRoute();
        } else {
            return a;
        }
    }
    
    public boolean yesNo() {
        String yes = "Yes";
        String no = "No";
        input.nextLine();
        System.out.print("Tiep tuc lua chon khac? (YES/NO) ");
        String nextOrNo = input.nextLine();
        if(nextOrNo.equalsIgnoreCase(yes) == true) {
            return true;
        }
        if(nextOrNo.equalsIgnoreCase(no) == true) {
            return false;
        }
    return yesNo();
    }
  
}
 
