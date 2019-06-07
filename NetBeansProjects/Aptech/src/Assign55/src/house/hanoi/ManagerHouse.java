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
 * @author mac
 */
public class ManagerHouse {
    static void showMenu(){
        System.out.printf("1. Nhập thông tin n ngôi nhà ở Hà Nội\n");
        System.out.printf("2. Hiển thị thông tin nha vua nhap.\n");
        System.out.printf("3. Sắp xếp theo trường địa chỉ và hiển thị thông tin sau khi sắp xếp.\n");
        System.out.printf("4. Tìm kiếm nhà theo địa chỉ nhập vào.\n");
        System.out.printf("5. Thoát.\n");
    }
    
    public static void main(String[] args){
        ArrayList<HaNoiHouse> house = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choose;
        do{
            showMenu();
            System.out.printf("Nhap chuc nang: ");
            choose = Integer.parseInt(input.nextLine());
            
        switch(choose){
            case 1:
                System.out.printf("So nha can nhap thong tin: ");
                int n = Integer.parseInt(input.nextLine()); 
                for (int i=0;i<n;i++){
                    HaNoiHouse houseinput = new HaNoiHouse();
                    houseinput.input();
                    house.add(houseinput);
                }
                break;
            case 2:
                System.out.printf("Thong tin nha vua nhap: \n");
                for(int i = 0; i<house.size();i++){
                    house.get(i).display();
                }
                break;
            case 3:
                Collections.sort(house, new Comparator<HaNoiHouse>(){
                    @Override
                    public int compare(HaNoiHouse o1, HaNoiHouse o2){
                        int cmp = o1.getDiaChi().compareTo(o2.getDiaChi());
                        if(cmp >=0){
                            return -1;
                        }
                        return 1;
                    }
                });
                for(int i = 0; i<house.size();i++){
                        house.get(i).display();
                    }
                break;
                
            case 4:
                System.out.printf("Nhap dia chi can tim: ");
                String address = input.nextLine();
                int count = 0;
                
                for (HaNoiHouse houseinput : house){
                    if(houseinput.getDiaChi().equalsIgnoreCase(address)){
                        houseinput.display();
                        count++;
                    }
                }
                if(count == 0){
                    System.out.printf("Khong tim thay dia chi\n");
                }
                
                break;
            case 5:
                System.out.printf("Thoat chuong trinh\n");
                break;
            default:
                System.out.printf("Nhap sai chuc nang\n");
                
        }
        }while(choose!=0);
    }
}

            

            

            

            