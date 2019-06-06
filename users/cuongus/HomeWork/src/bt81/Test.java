/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt81;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class Test {
    public static void main(String[] args) {
        int choose;
        ArrayList<Author> authorList = new ArrayList<>();
        ArrayList<Book> bookList = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
       
        do{
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            
            switch (choose){
                case 1:
                    System.out.println("Nhap so sach can them: ");
                    int m = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < m; i++) {
                        Book book = new Book();
                        book.input();
                        boolean isFind = false;
                        for (int j = 0; j < authorList.size(); j++) {
                            if(authorList.get(j).getNickname().equalsIgnoreCase(book.getNickname())){
                                isFind = true;
                                break;
                            }
                        }
                        if(!isFind){
                            Author author = new Author(book.getNickname());
                            author.input();
                            
                            authorList.add(author);
                        }
                        
                        bookList.add(book);
                    }
                    break;
                
                case 2: 
                    for (Book book : bookList) {
                        book.dislay();
                    }
//                    for (int i = 0; i < bookList.size(); i++) {
//                        bookList.get(i).dislay();
//                    }
                    break;
                
                case 3:
                    int n;
                    System.out.println("Nhap so tac gia can them: ");
                    n = Integer.parseInt(input.nextLine());
                    
                    for (int i = 0; i < n; i++) {
                        Author author = new Author();
//                        author.input();
                        author.input(authorList);
                        
                        authorList.add(author);
                    }
                    break;
                
                case 4:
                    System.out.println("Nhap ten but danh can tim kiem: ");
                    String nickname = input.nextLine();
                    
                    for (int i = 0; i < bookList.size(); i++) {
                        if(bookList.get(i).getNickname().equalsIgnoreCase(nickname)){
                            bookList.get(i).dislay();
                        }
                    }
                    break;
                
                case 5:
                    System.out.println("Goodbye!!!");
                    break;
                
                default:
                    System.err.println("Nhap sai so menu!!!");
                    break;
            }
        }while(choose != 5);
    }
    static void showMenu(){
        System.out.println("1. Nhap thong tin sach.");
        System.out.println("2. Hien thi tat ca sach ra man hinh.");
        System.out.println("3. Nha thong tin taac gia.");
        System.out.println("4. Tim kiem sach theo but danh.");
        System.out.println("5. Thoat.");
    }
}
