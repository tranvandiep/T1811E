/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package House.HaNoi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class ManagerHouse {
    static List<HaNoiHouse> houseList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int choose;
        do{
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            switch(choose){
                case 1:
                    input();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    sortByDiaChi();
                    display();
                    break;
                case 4:
                    searchByDiaChi();
               
                    break;
                case 5:
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Nhap sai xin moi nhap lai.");
                    break;
            }
        }while (choose != 5);
    }

    static void showMenu() {
        System.out.println("/-------------Menu--------------/");
        System.out.println("1. Nhap thong tin ngoi nha o Ha Noi");
        System.out.println("2. Hien thi thong tin ngoi nha do");
        System.out.println("3. Sap xep theo dia chi va hien thi thong tin");
        System.out.println("4. Tim kiem nha theo dia chi nhap vao");
        System.out.println("5. Thoat");
        System.out.println("Lua chon cua ban la: ");
    }

    private static void input() {
        System.out.println("Nhap so luong ngoi nha can them vao o Ha noi: ");
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i<n; i++){
            System.out.println("Nhap thong tin ngoi nha thu "+(i+1));
            HaNoiHouse house = new HaNoiHouse();
            house.input();
            houseList.add(house);
        }
    }

    private static void display() {
        for(int i = 0; i<houseList.size(); i++){
            houseList.get(i).display();
        }
    }

    private static void sortByDiaChi() {
        Collections.sort(houseList, (HaNoiHouse o1, HaNoiHouse o2) -> {
            if(o2.getDiaChi() == null ? o1.getDiaChi() == null : o2.getDiaChi().equals(o1.getDiaChi())) {
                return 1;
            } else {
                return -1;
            }
        });
    }

    private static void searchByDiaChi() {
        System.out.println("Nhap dia chi nha can tim : ");
        String diaChiNha = input.nextLine();
        houseList.stream().filter((nhaHN) -> (nhaHN.getDiaChi().equalsIgnoreCase(diaChiNha))).forEachOrdered((nhaHN) -> {
            nhaHN.display();
        });
    }

}
