/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt55assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ASUS
 */

public class ManagerHouse {
    
    public static int menu() {
        Scanner input = new Scanner(System.in);
        int so;
        
        do {
            System.out.printf("1.Nhap thong tin nha\n");
            System.out.printf("2.Danh sach nha\n");
            System.out.printf("3.Danh sach nha sap xep theo dia chi\n");
            System.out.printf("4.Tim nha theo dia chi\n");
            System.out.printf("5.Thoat\n");
            
            try {
                System.out.printf("Nhap so: ");
                so = Integer.parseInt(input.nextLine());
            } 
            
            catch(Exception e) {
                System.out.printf("Chon sai so______ Moi nhap lai: ");
                System.out.print("Chon so: ");
                so = Integer.parseInt(input.nextLine());
            }
            
            if(so < 1 || so > 5) {
                System.out.printf("Chon sai so______ Moi nhap lai: ");
            }
            
        } while(so < 1 || so > 5);
        return so;
    }
    public static List<HaNoiHouse> inputHouseList(int flag, List<HaNoiHouse> list) {
        Scanner input = new Scanner(System.in);
        int n;
        int m = list.size();
        
        if(flag == 0) {
            System.out.print("Nhap so nha: ");
            n = Integer.parseInt(input.nextLine());
        } 
        
        else {
            System.out.print("Nhap so nha can them: ");
            n = Integer.parseInt(input.nextLine());
        }
        
        for(int i = m; i < n+m; i++) {
            HaNoiHouse house = new HaNoiHouse();
            
            if(i == 0) {
                System.out.println("Nhap nha thu " +(i+1));
            } 
            
            else {
                System.out.println("Nhap nha thu " +i);
            }
            
            house.input();
            list.add(house);
        }
        return list;
    }
    public static void displayHouseList(List<HaNoiHouse> list, int chose) {
        if(chose == 2) {
            System.out.println("Danh sach cac nha da nhap:");
        }
        
        if(chose == 3) {
            System.out.println("Danh sach nha theo dia chi:");
        }
        
        for(HaNoiHouse house : list) {
            house.display();
        }
    }
    
    public static List<HaNoiHouse> sortByAddress(List<HaNoiHouse> list) {
        List<HaNoiHouse> sortList = new ArrayList<HaNoiHouse>();
        
        for(int i = 0; i < list.size(); i++) {
            HaNoiHouse house = list.get(i);
            sortList.add(house);
        }
        
        Collections.sort(sortList, new Comparator<HaNoiHouse>() {
            @Override
            public int compare(HaNoiHouse h1, HaNoiHouse h2) {
                if(h1.getTenQuan().equalsIgnoreCase(h2.getTenQuan())) {
                    return (h1.getDiaChi().compareToIgnoreCase(h2.getDiaChi()));
                }
                return 0;
            }
        });
        return sortList;
    }
    
    public static void searchByAddress(List<HaNoiHouse> list) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap dia chi can tim: ");
        String search = input.nextLine();
        int flag = 0;
        
        for(HaNoiHouse house : list) {
            if(house.getDiaChi().equalsIgnoreCase(search)) {
                house.display();
                flag++;
            }
        }
        
        if(flag == 0) {
            System.out.println("Du lieu chua co dia chi ngoi nha");
        } 
        
        else {
            System.out.printf("Co %d ngoi nha co dia chi nhu tren", flag);
        }
    }
    
    public static int checkInputOperation(int flag, int check) {
        int chose;
        
        if(flag == 0 && check != 1) {
            chose = 1;
            System.out.println("Chua co danh sach _______ Xin moi nhap danh sach: ");
        } 
        
        else {
            chose = check;
        }
        return chose;
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
            System.out.print("Nhap sai yeu cau");
            return choseNextOrNo();
        }
    }

    public static void main(String[] args) {
        List<HaNoiHouse> houseList = new ArrayList<HaNoiHouse>();
        int chose;
        int next;
        int flag = 0;
        
        do {
            chose = checkInputOperation(flag, menu());
            switch(chose) {
                case 1:
                    houseList = inputHouseList(flag, houseList);
                    break;
                case 2:
                    displayHouseList(houseList, chose);
                    break;
                case 3:
                    displayHouseList(sortByAddress(houseList), chose);
                    break;
                case 4:
                    searchByAddress(houseList);
                    break;
                case 5:                 
                    break;
            }
            flag++;
            
            if(chose != 5) {
                next = choseNextOrNo();
            } 
            
            else {
                break;
            }    
        } while(next != 0);
    }
}
