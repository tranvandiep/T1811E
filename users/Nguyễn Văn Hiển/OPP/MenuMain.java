///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package pkg1811e.java.OPP;
//
///**
// *
// * @author PC
// */
import java.util.Scanner;

public class MenuMain {
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        String Yes = "YES";
        String No = "NO";
        Scanner input = new Scanner(System.in);
        int R, L, W;
        
        do {
            do {
                menu.menuList();
                System.out.print("Nhap lua chon: ");
                int choise = Integer.parseInt(input.nextLine());
                menu.setChoise(choise);
                if(menu.getChoise() < 0 || menu.getChoise() > 7) {
                    System.out.println("Lua chon khong hop le. Moi nhap lai");
                }
            } while(menu.getChoise() < 0 || menu.getChoise() > 7);

            switch(menu.getChoise()) {
                case 1:
                    System.out.print("Nhap ban kinh R = ");
                    R = Integer.parseInt(input.nextLine());
                    circle.setRadius(R);
                    break;
                case 2:
                    circle.getPi();
                    System.out.print("Chu vi hinh tron la A = " +circle.getPerimeter() +"\n");
                    break;
                case 3:
                    circle.getPi();
                    System.out.print("Dien tich hinh tron la S = " +circle.getAcreage() +"\n");
                    break;
                case 4:
                    do {
                        System.out.print("Nhap chieu dai L = ");
                        L = Integer.parseInt(input.nextLine());
                        rectangle.setLength(L);
                        System.out.print("Nhap chieu dai W = ");
                        W = Integer.parseInt(input.nextLine());
                        rectangle.setWidth(W);
                        if(rectangle.getLength() < rectangle.getWidth()) {
                            System.out.println("Nhap chieu dai phai lon hon chieu rong\nMoi nhap lai\n");
                        }
                    } while(rectangle.getLength() < rectangle.getWidth());   
                    break;
                case 5:
                    System.out.print("Chu vi HCN la C = " +rectangle.getPerimeter() +"\n");
                    break;
                case 6:
                    System.out.print("Dien tich HCN la S = " +rectangle.getAcreage() +"\n");
                    break;
                case 7:
                    break;
            }
            if(menu.getChoise() == 7) {
                break;
            } else {
                System.out.println("\nTiep tuc lua chon khac? Nhap YES hoac NO");
                String nextChoise = input.nextLine();
                if(Yes.equalsIgnoreCase(nextChoise) == true) {
                    continue;
                }
                if(No.equalsIgnoreCase(nextChoise) == true) {
                    break;
                }
            }
        } while(menu.getChoise() != 7);
    }
}
