/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.QuanLySoThu;

import java.util.Scanner;

/**
 *
 * @author LQT
 */
public class Main {
    static Scanner input = new Scanner(System.in);
    static Zoo zoo = new Zoo();
    
    static void showMenu(){
        System.out.println("1. Add Room");
        System.out.println("2. Delete Room");
        System.out.println("3. Add Animal");
        System.out.println("4. Delete Animal");
        System.out.println("5. Show List Animal");
        System.out.println("6. Exit !!!");
    }
    
    public static void main(String[] args) {       
        int choose;
        do{
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            
            switch(choose){
                case 1:
                    System.out.println("== Them chuong ==");
                    System.out.println("Nhap so luong chuong can them !!!");
                    int n = Integer.parseInt(input.nextLine());
                    for(int i = 1; i <= n; i++){
                        System.out.println("Nhap thong tin chuong thu " + i);
                        Room room = new Room();
                        room.inputRoom();
                        zoo.addRoom(room);
                    }
                    break;
                    
                case 2:
                    System.out.println("== Xoa chuong ==");
                    System.out.println("Nhap ma chuong can xoa : ");
                    int roomNo = Integer.parseInt(input.nextLine());
                    zoo.deleteRoom(roomNo);
                    System.out.println("Da xoa chuong ma " + roomNo);
                    break;
                    
                case 3:
                    System.out.println("== Them con vat ==");
                    zoo.addAnimal();
                    break;
                    
                case 4:
                    zoo.deteleAnimal();
                    break;
                    
                case 5:
                    zoo.showAllInfo();
                    break;
                    
                case 6:
                    System.out.println("Thoat !!!");
                    break;
                    
                default:
                    System.out.println("Kiem tra lai lua chon !!!");
                    break;
            }
        }
        while(choose != 6);
    }
}
