/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.hanoi;

/**
 *
 * @author PC
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class ManagerHouse {
    
    public static int menu() {
        int chose;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("\n1. Nhập thông tin nhà.");
            System.out.println("2. In ra danh sách nhà.");
            System.out.println("3. In ra danh sách nhà sắp xếp theo địa chỉ.");
            System.out.println("4. Tìm kiếm nhà theo địa chỉ.");
            System.out.println("5. Thoát.");
            try {
                System.out.print("Nhập lựa chọn: ");
                chose = Integer.parseInt(input.nextLine());
            } catch(Exception e) {
                System.out.println("Chỉ được nhập lựa chọn là chữ số");
                System.out.print("Nhập lựa chọn: ");
                chose = Integer.parseInt(input.nextLine());
            }
            if(chose < 1 || chose > 5) {
                System.out.println("Nhập sai .Chỉ được nhập lựa chọn từ 1 đến 5.");
            }
        } while(chose < 1 || chose > 5);
        return chose;
    }
    public static List<HaNoiHouse> inputHouseList(int flag, List<HaNoiHouse> list) {
        Scanner input = new Scanner(System.in);
        int n;
        int m = list.size();
        if(flag == 0) {
            System.out.print("Nhập số lượng nhà: ");
            n = Integer.parseInt(input.nextLine());
        } else {
            System.out.print("Nhap số lượng nhà cần nhập thêm: ");
            n = Integer.parseInt(input.nextLine());
        }
        for(int i = m; i < n+m; i++) {
            HaNoiHouse house = new HaNoiHouse();
            if(i == 0) {
                System.out.println("Nhập ngôi nhà thứ " +(i+1));
            } else {
                System.out.println("Nhập ngôi nhà thứ " +i);
            }
            house.input();
            list.add(house);
        }
        return list;
    }
    public static void displayHouseList(List<HaNoiHouse> list, int chose) {
        if(chose == 2) {
            System.out.println("Danh sách nhà đã nhập:");
        }
        if(chose == 3) {
            System.out.println("Danh sách nhà theo địa chỉ:");
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
        System.out.print("Nhập địa chỉ tìm kiếm: ");
        String search = input.nextLine();
        int flag = 0;
        for(HaNoiHouse house : list) {
            if(house.getDiaChi().equalsIgnoreCase(search)) {
                house.display();
                flag++;
            }
        }
        if(flag == 0) {
            System.out.println("Khong tìm được nhà có địa chỉ phù hợp.");
        } else {
            System.out.printf("Tìm được %d nhà có địa chỉ phù hợp.", flag);
        }
    }
    public static int checkInputOperation(int flag, int check) {
        int chose;
        if(flag == 0 && check != 1) {
            chose = 1;
            System.out.println("Danh sách trống. Nhập thông tin nhà trước.");
        } else {
            chose = check;
        }
        return chose;
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
            } else {
                break;
            }    
        } while(next != 0);
 
    }
}
