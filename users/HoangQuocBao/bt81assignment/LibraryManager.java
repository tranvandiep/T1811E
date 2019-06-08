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
public class LibraryManager extends Library {
    public static int menu(int flag) {
        int check;
        Scanner input = new Scanner(System.in);
        System.out.println("\n1. Nhập thông tin sách.");
        System.out.println("2. Hiển thị danh sách sách đã nhập.");
        System.out.println("3. Nhập thông tin tác giả.");
        System.out.println("4. Tìm kiếm sách theo tên tác giả");
        System.out.println("5. Thoát.");
        try {
            System.out.print("Nhập lựa chọn: ");
            check = Integer.parseInt(input.nextLine());
            if(check < 0 || check > 5) {
                System.out.println("Nhập sai quy cách. Chỉ được nhập từ 1 đến 5.");
                return menu(flag);
            } 
        } catch(Exception e) {
            System.out.println("Nhập sai quy cách. Chỉ được nhập lựa chọn là chữ số.");
            return menu(flag);
        }
        if(flag == 0 && check != 3 && check != 5) {
            System.out.println("Thư viện trống. Nhập danh sách sách.");
            check = 1;
        }
        return check;
    }
    public static int choseNextOrNo() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nTiếp tục lựa chọn khác? YES/NO ");
        String next = input.nextLine();
        if(next.equalsIgnoreCase("yes")) {
            return 1;
        } else if(next.equalsIgnoreCase("no")) {
            return 0;
        } else {
            System.out.print("Nhập sai từ khóa. Chỉ được nhập YES hoặc NO.");
            return choseNextOrNo();
        }
    }
    
    
    
    public static void main(String[] args) {
        Library library = new Library();
        int chose;
        int next;
        int flag = 0;
        int flag2 = 0;
        
        do {
            chose = menu(flag);
            switch(chose) {
                case 1:
                    library.inputBook(flag);
                    flag++;
                    break;
                case 2:
                    library.displayBook();
                    break;
                case 3:
                    library.inputAuthor(flag2);
                    flag2++;
                    break;
                case 4:
                    library.searchByAuthorPseu();
                    break;
                case 5:
                    break;
            }
            if(chose != 5) {
                next = choseNextOrNo();
            } else {
                break;
            }    
        } while(next != 0);
    }
}
