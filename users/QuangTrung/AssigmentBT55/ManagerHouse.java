/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmentbai55;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ManagerHouse {
    static List<HaNoiHouse> Array= new ArrayList<>(); 
    static Scanner nhap=new Scanner(System.in);
    private static Object t;
    public static void main(String[] args) {
        int choose;
        
        do{
            ShowMenu();
            choose = Integer.parseInt(nhap.nextLine());
            switch(choose){
                case 1:
                    input();
                    break;
                case 2:
                    dislay();
                    break;
                case 3:
                    SortHouse();
                    break;
                case 4:
                    SearchHouse();
                    break;
                case 5:
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Input Failed!!!");
                    break;
            } 
        }while (choose !=5);
        
    }
    
    public static void ShowMenu(){
        System.out.println("1. Nhập thông tin n ngôi nhà ở Hà Nội");
        System.out.println("2. Hiển thị thông tin của n ngôi nhà đó.");
        System.out.println("3. Sắp xếp theo trường địa chỉ và hiển thị thông tin sau khi sắp xếp.");
        System.out.println("4. Tìm kiếm nhà theo địa chỉ nhập vào.");
        System.out.println("5. Thoát.");
        System.out.print("Mời bạn chọn: ");
    }

    private static void input() {
        System.out.println("Nhap so luong nha: ");
        int n=Integer.parseInt(nhap.nextLine());
        for(int i=0;i<n;i++){
            System.out.println("Nhap so nha thu : "+(i+1));
            HaNoiHouse Nha= new HaNoiHouse();
            Nha.input();
            Array.add(Nha);
        }
    }

    private static void dislay() {
        for(HaNoiHouse hanoihouse: Array){
            hanoihouse.dislay();
        }
        System.out.println("");
    }

    private static void SortHouse() {
        Collections.sort(Array ,new Comparator<HaNoiHouse>() {

            @Override
            public int compare(HaNoiHouse t, HaNoiHouse t1) {
               if(t.getDiaChi().compareTo(t1.getDiaChi())>0){
                   return 1;
               } else{
                   return -1;
               }
            }
        });
        for(HaNoiHouse hanoihouse: Array){
            hanoihouse.dislay();
    }
        System.out.println("");
    }

    private static void SearchHouse() {
        System.out.println("Nhap ten dia chi can tim: ");
        String DiaChiSearch=nhap.nextLine();
        for (HaNoiHouse haNoiHouse: Array){
            if(haNoiHouse.getDiaChi().equalsIgnoreCase(DiaChiSearch)){
                haNoiHouse.dislay();
            }
        }
    }

}
