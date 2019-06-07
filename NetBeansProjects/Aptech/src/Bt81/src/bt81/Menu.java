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
 * @author mac
 */
public class Menu {
    static void showMenu(){
        System.out.printf("1. Nhập thông tin sách\n");
        System.out.printf("2. Hiển thị tất cả sách ra màn hình\n");
        System.out.printf("3. Nhập thông tin tác giả\n");
        System.out.printf("4. Tìm kiếm tất cả sách được viết bởi tác giả");
        System.out.printf("5. Thoát\n");
    }
    
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Author> authorList = new ArrayList<>();
        ArrayList<Book> bookList = new ArrayList<>();
        int x;
        do{
            
            showMenu();
            System.out.printf("Nhap chuc nang: ");
            x = Integer.parseInt(input.nextLine());
            
            switch(x){
                case 1:
                    System.out.printf("Nhap so sach can them: ");
                    int n = Integer.parseInt(input.nextLine());
                    
                    for (int i=0; i<n; i++){
                       Book book = new Book();
                       book.inputBook();
                       bookList.add(book);
                    }
                    break;
                case 2:
                    System.out.printf("Cac cuon sach vua them: \n");
                    for(int i=0 ; i<bookList.size(); i++){
                        bookList.get(i).displayBook();
                    }
                    break;
                case 3:
                    System.out.printf("Nhap so tac gia muon them: ");
                    int y = Integer.parseInt(input.nextLine());
                    
                    for (int i=0; i<y ; i++){
                        Author author = new Author();
                        author.inputAuthor();
                        authorList.add(author);
                    }
                    break;
                case 4:
                    System.out.printf("Nhap but danh can tim: ");
                    String search = input.nextLine();
                    int count = 0;
                    for(Author author : authorList){
                        if(author.getOtherName().equalsIgnoreCase(search)){
                            author.displayAuthor();
                            count++;
                        }
                    }
                    if(count == 0){
                        System.out.printf("khong tim thay but danh");
                    }
                case 5:
                    System.out.printf("Thoat chuong trinh");
            }
            
        }while(x!=0);
    }
}








