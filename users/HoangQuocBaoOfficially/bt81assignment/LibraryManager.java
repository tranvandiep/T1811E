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
        System.out.printf("\n1.Nhap thong tin sach\n");
        System.out.printf("2.Thong tin sach da nhap\n");
        System.out.printf("3.Nhap thong tin tac gia\n");
        System.out.printf("4.Tim sach theo tac gia\n");
        System.out.printf("5.Thoat\n");
        
        try {
            System.out.print("Chon so: ");
            check = Integer.parseInt(input.nextLine());
            if(check < 0 || check > 5) {
                System.out.println("Nhap sai so");
                return menu(flag);
            } 
        } 
        
        catch(Exception e) {
            System.out.println("Chon sai so ____ Chi duoc nhap chu so");
            return menu(flag);
        }
        
        if(flag == 0 && check != 3 && check != 5) {
            System.out.println("Chua co du lieu ____ Moi nhap: ");
            check = 1;
        }
        return check;
    }
    
    public static int choseNextOrNo() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nContinue??? YES/NO ");
        String next = input.nextLine();
        
        if(next.equalsIgnoreCase("yes")) {
            return 1;
        } 
        
        else if(next.equalsIgnoreCase("no")) {
            return 0;
        } 
        
        else {
            System.out.print("Nhap sai");
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
            } 
            
            else {
                break;
            }    
        } while(next != 0);
    }
}
