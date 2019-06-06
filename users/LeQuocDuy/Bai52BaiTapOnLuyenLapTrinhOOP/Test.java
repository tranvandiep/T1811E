/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai52BaiTapOnLuyenLapTrinhOOP;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Duy Lumiere
 */
public class Test {
          public static void main(String[] args){
                   Scanner in = new Scanner(System.in);
                   
                   boolean replay = false;
                   int select;
                   
                   String name, produc;
                   int year;
                   float cost;
                   String lang;
                   int sem;
                   String SearchBookName;
                   int SearchCount1=0;
                   
                   
                   ArrayList<AptechBook> ThuVien = new ArrayList<>();
                   AptechBook temp = new AptechBook();
                   
                   do{
                            System.out.println("\n===QUẢN LÝ SÁCH===");
                            System.out.println("");
                            System.out.println("1. Nhập thông tin sách của Aptech");
                            System.out.println("2. Hiển thị thông tin vừa nhập");
                            System.out.println("3. Sắp xếp thông tin theo năm xuất bản giảm dần và hiển thị");
                            System.out.println("4. Tìm kiếm theo tên sách");
                            System.out.println("5. Tìm kiếm theo tên tác giả");
                            System.out.println("6. Thoát\n");
                            
                            System.out.print("Mời bạn chọn: ");
                            select = in.nextInt();
                            switch(select){
                                case 1:
                                    AptechBook Sach = new AptechBook();
                                    in.nextLine();
                                    System.out.println("NHẬP THÔNG TIN SÁCH CỦA APTECH: ");
                                    System.out.print("Nhập tên: ");
                                    name = in.nextLine();
                                    System.out.print("Nhập nhà xuất bản: ");
                                    produc = in.nextLine();
                                    System.out.print("Nhập năm xuất bản: ");
                                    year = in.nextInt();
                                    System.out.print("Nhập giá: ");
                                    cost = in.nextFloat();
                                    in.nextLine();
                                    System.out.print("Nhập ngôn ngữ: ");
                                    lang = in.nextLine();
                                    System.out.print("Nhập kỳ học: ");
                                    sem = in.nextInt();
                                    
                                    Sach.input(name,produc,year,cost);
                                    Sach.setLanguage(lang);
                                    Sach.setSemester(sem);
                                    
                                    ThuVien.add(Sach);
                                    
                                    replay = true;
                                    break;
                                    
                                case 2:
                                    if(ThuVien.size()>0){
                                        System.out.println("HIỂN THỊ THÔNG TIN VỪA NHẬP: ");
                                        for(int i=0; i<ThuVien.size(); i++){
                                            ThuVien.get(i).display();
                                            System.out.println("Ngôn ngữ: " + ThuVien.get(i).getLanguage());
                                            System.out.println("Kỳ: " +  ThuVien.get(i).getSemester() + "\n");
                                        };
                                    }
                                    else if(ThuVien.size()==0){
                                        System.out.println("Bạn chưa nhập vào Sách!");
                                    };
                                    
                                    replay = true;
                                    break;
                                    
                                case 3:
                                    if(ThuVien.size()==0){
                                        System.out.println("Bạn chưa nhập vào Sách");
                                    }
                                    else if(ThuVien.size()==1){
                                        System.out.println("Chỉ có 1 sách trong Thư viện, và đó là: ");
                                        ThuVien.get(1).display();
                                        System.out.println("Ngôn ngữ: " + ThuVien.get(1).getLanguage());
                                        System.out.println("Kỳ: " +  ThuVien.get(1).getSemester() + "\n");
                                    }
                                    else if(ThuVien.size()>1){
                                        System.out.println("THƯ ");
                                        for(int i=0; i < ThuVien.size()-1; i++){
                                            for(int j=0; j < ThuVien.size()-i-1; j++){
                                                if(ThuVien.get(j).getYearPublishing() < ThuVien.get(j+1).getYearPublishing()){
                                                    Collections.swap(ThuVien, j, j+1);
                                                };
                                            };
                                        };
                                        System.out.println("Thư viện sau khi đã sắp xếp Thông tin Sách giảm dần theo năm xuất bản là: ");
                                        for(int i=0; i<ThuVien.size(); i++){
                                            System.out.println("Tên sách: " + ThuVien.get(i).getBookName());
                                            System.out.println("Năm xuất bản: " +  ThuVien.get(i).getYearPublishing() + "\n");
                                        };
                                    };
                                    
                                    replay = true;
                                    break;
                                    
                                case 4:
                                    System.out.println("TÌM KIẾM THEO TÊN SÁCH: ");
                                    in.nextLine();
                                    System.out.println("Nhập chuỗi tìm kiếm: ");
                                    SearchBookName = in.nextLine();
                                    System.out.println("Kết quả là: ");
                                    for(int i = 0; i < ThuVien.size(); i++){
                                        if(ThuVien.get(i).getBookName().toLowerCase().indexOf(SearchBookName.toLowerCase()) != -1){
                                            System.out.println("Tên sách: " + ThuVien.get(i).getBookName());
                                            SearchCount1++;
                                        };
                                        if((SearchCount1==0)&&(i==ThuVien.size()-1)){
                                            System.out.println("Không có sách nào phù hợp với chuỗi tìm kiếm");
                                        };
                                    };
                                    
                                    replay = true;
                                    break;
                                    
                                case 5:
                                    System.out.println("TÌM KIẾM THEO TÁC GIẢ: ");
                                    in.nextLine();
                                    System.out.println("Nhập chuỗi tìm kiếm: ");
                                    SearchBookName = in.nextLine();
                                    System.out.println("Kết quả là: ");
                                    for(int i = 0; i < ThuVien.size(); i++){
                                        if(ThuVien.get(i).getBookAuthor().toLowerCase().indexOf(SearchBookName.toLowerCase()) != -1){
                                            System.out.println("Tác giả: " + ThuVien.get(i).getBookAuthor());
                                            SearchCount1++;
                                        };
                                        if((SearchCount1==0)&&(i==ThuVien.size()-1)){
                                            System.out.println("Không có sách nào phù hợp với chuỗi tìm kiếm");
                                        };
                                    };
                                    
                                    replay = true;
                                    
                                    break;
                                case 6:
                                    System.exit(0);
                                    break;
                            }
                   }
                   while(replay==true);
                }
}
