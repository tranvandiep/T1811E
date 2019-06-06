/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai55AssignmentLuyenTapOOP5;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Duy Lumiere
 */
public class ManagerHouse {
    static List<HaNoiHouse> Arr = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        
        int MenuChosen;
        int HouseCount;
        int SortChosen;
        int SearchCount = 0;
        String AddressSearch;
        
        while(true){
            ShowMenu();

            MenuChosen = z.nextInt();
            System.out.println("");
            switch(MenuChosen){
                case 1:
                    System.out.print("- Nhập số lượng nhà muốn nhập thông tin: ");
                    HouseCount = z.nextInt();
                    for (int i = 0; i < HouseCount; i++) {
                        System.out.println("Nhập thông tin cho nhà thứ " + (i+1) + ": ");
                        HaNoiHouse Nha = new HaNoiHouse();
                        Nha.input();
                        Arr.add(Nha);
                    }
                    break;
                case 2:
                    if(Arr.isEmpty()){
                        System.out.println("Chưa có nhà nào trong hệ thống, vui lòng quay về Menu gốc và chọn bước 1!");
                    }
                    else{
                        Arr.forEach((n)->{
                            n.display();
                        });
                    };
                    break;
                case 3:
                        if(Arr.isEmpty()){
                            System.out.println("Chưa có nhà nào trong hệ thống, vui lòng quay về Menu gốc và chọn bước 1!");
                        }
                        else{
                            System.out.println("Bạn muốn sắp xếp theo tiêu chí nào?");
                            System.out.println("1. Theo Quận");
                            System.out.println("2. Theo Địa chỉ (A-Z)");
                            System.out.print("Chọn: " );
                            SortChosen = z.nextInt();
                            switch(SortChosen){
                                case 1:
                                    Collections.sort(Arr, (HaNoiHouse o1, HaNoiHouse o2) -> {
                                        if((o1.getTenQuan()).compareTo((o2.getTenQuan()))<0){
                                            return -1;
                                        }
                                        else{
                                            return 1;
                                        }
                                    });
                                    System.out.println("SẮP XẾP THEO QUẬN: ");
                                    Arr.forEach((n)->{
                                        System.out.println(n.toString());
                                    });
                                    break;
                                case 2:
                                    Collections.sort(Arr, (HaNoiHouse o1, HaNoiHouse o2) -> {
                                        if(o1.getDiaChi().compareTo(o2.getDiaChi())>0){
                                            return -1;
                                        }
                                        else{
                                            return 1;
                                        }
                                    });
                                    System.out.println("SẮP XẾP THEO ĐỊA CHỈ: ");
                                    Arr.forEach((n)->{
                                        System.out.println(n.toString());
                                    });
                                    break;
                                case 3:
                                    break;
                            }
                        }
                    break;
                case 4:
                    if(Arr.isEmpty()){
                        System.out.println("Chưa có nhà nào trong hệ thống, vui lòng quay về Menu gốc và chọn bước 1!");
                    }
                    else{
                        System.out.println("TÌM KIẾM THEO ĐỊA CHỈ NHÀ");
                        z.nextLine();
                        System.out.print("- Nhập địa chỉ: ");
                        AddressSearch = z.nextLine();
                        for (int i = 0; i < Arr.size(); i++) {
                            if(AddressSearch.equalsIgnoreCase(Arr.get(i).getDiaChi())){
                                System.out.println(Arr.get(i).toString());
                                SearchCount++;
                            }
                        }
                        if(SearchCount==0){
                            System.out.println("Không có nhà nào khớp với địa chỉ này!");
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn nhập sai menu! Vui lòng thử lại");
                    break;        
            }
        }
    }
    
    public static void ShowMenu(){
        System.out.println("");
        System.out.println("QUẢN LÝ NHÀ Ở KHU VỰC HÀ NỘI");
        System.out.println("1. Nhập thông tin n ngôi nhà ở Hà Nội");
        System.out.println("2. Hiển thị thông tin của n ngôi nhà đó.");
        System.out.println("3. Sắp xếp theo trường địa chỉ và hiển thị thông tin sau khi sắp xếp.");
        System.out.println("4. Tìm kiếm nhà theo địa chỉ nhập vào.");
        System.out.println("5. Thoát.");
        System.out.print("Mời bạn chọn: ");
    }
}
