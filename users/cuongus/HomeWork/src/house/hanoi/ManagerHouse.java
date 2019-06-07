/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.hanoi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class ManagerHouse {
    public static void main(String[] args) {
        int choose;
        ArrayList<HaNoiHouse> hnHouseList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        do{
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            
            switch (choose){
                case 1:
                    System.out.println("Nhap so luong ngoi nha can them: ");
                    int n = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < n; i++) {
                        HaNoiHouse hanoihouse = new HaNoiHouse();
                        hanoihouse.input();
                        
                        hnHouseList.add(hanoihouse);
                    }
                    break;
                    
                case 2:
                    for (int i = 0; i < hnHouseList.size(); i++) {
                        hnHouseList.get(i).dislay();
                    }
                    break;
                    
                case 3:
//                        Collections.sort(hnHouseList, new Comparator<HaNoiHouse>(){
//                        @Override
//                    public int compare(HaNoiHouse o1, HaNoiHouse o2) {
//                        int cmp = o1.getDiaChi().compareTo(o2.getDiaChi());
//                        if (cmp >=0){
//                            return 1;
//                        }
//                        return -1;
//                    }
//                    
//                });
                Collections.sort(hnHouseList, (HaNoiHouse o1, HaNoiHouse o2) -> {
                    int cmp = o1.getDiaChi().compareTo(o2.getDiaChi());
                    if (cmp >=0){
                        return 1;
                    }
                    return -1;
                   });
                for(int i = 0; i < hnHouseList.size() ; i++){
                    hnHouseList.get(i).dislay();
                    }
                    break;
                    
                case 4:
                    System.out.println("Nhap dia chi nha cna tim kiem.");
                    String address = input.nextLine();
                    int count = 0;
                    for (int i = 0; i < hnHouseList.size(); i++) {
                        if (hnHouseList.get(i).getDiaChi().equalsIgnoreCase(address)){
                            hnHouseList.get(i).dislay();
                            count++;
                        }
                    }
                    if(count == 0){
                        System.out.println("Dia chi can tim khong co!!!");
                    }
                    
                    break;
                    
                case 5:
                    System.out.println("Goodbye!!!");
                    break;
                    
                default:
                    System.err.println("Nhap sai lua chon Menu!!!");
                        break;
            }
        }while (choose != 5);
    }
    
    static void showMenu(){
        System.out.println("1. Nhập thông tin ngôi nhà ở Hà Nội");
        System.out.println("2. Hiển thị thông tin của tất cả ngôi nhà đó.");
        System.out.println("3. Sắp xếp theo trường địa chỉ và hiển thị thông tin sau khi sắp xếp.");
        System.out.println("4. Tìm kiếm nhà theo địa chỉ nhập vào.");
        System.out.println("5. Thoát.");     
    }
}
