/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DuongQuangHuy
 */
public class ManagerHouse {

    /**
     * @param args the command line arguments
     */
    static Scanner scan = new Scanner(System.in);
    static List<HaNoiHouse> city = new ArrayList<HaNoiHouse>();

    public static void main(String[] args) {
        int choose;
        do {
            ShowMenu();
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    input();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    SortAddress();
                    break;
                case 4:
                    
                    SearchAddress();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println(" moi chon lai ");
                    break;
            }

        } while (choose != 5);

    }

    public static void ShowMenu() {
        System.out.println("1. Nhập thông tin n ngôi nhà ở Hà Nội");
        System.out.println("2. Hiển thị thông tin của n ngôi nhà đó.");
        System.out.println("3. Sắp xếp theo trường địa chỉ và hiển thị thông tin sau khi sắp xếp.");
        System.out.println("4. Tìm kiếm nhà theo địa chỉ nhập vào.");
        System.out.println("5. Thoát.");
        System.out.println("choose");
    }

    private static void input() {
        int n;
        System.out.println("nhap so nha can them");
        n = Integer.parseInt(scan.nextLine());
            for (int i = 0; i < n ; i++){
                System.out.println("nhap nha so " +(i+1) );
                HaNoiHouse  hanoiHouse = new HaNoiHouse();
                hanoiHouse.input();
                
                city.add(hanoiHouse);
            }
    }

    private static void display() {
        for (int i = 0 ; i < city.size() ; i++ ){
            city.get(i).display();
            System.out.println("\n");
        }
    }

    private static void SortAddress() {
        Collections.sort(city, new Comparator<HaNoiHouse>() {
            @Override
            public int compare(HaNoiHouse o1, HaNoiHouse o2) {
                int cmp = o1.getDiaChi().compareTo(o2.getDiaChi());
                if(cmp >= 0){
                    return 1;
                }
                return -1;
            }
        });
        for (int i = 0; i < city.size(); i++) {
            city.get(i).display();
            System.out.println(" ");
        }
    }

    private static void SearchAddress() {
        System.out.println("nhap dia chi can tim");
        String Search = scan.nextLine();
        int count = 0;
        for (int i = 0; i < city.size(); i++) {
            if(city.get(i).getDiaChi().equalsIgnoreCase(Search)){
                    city.get(i).display();
                    count++;
            }
            
        }
        if(count == 0){
            System.out.println("ko tim thay dia chi");
        }
        
    }

}
