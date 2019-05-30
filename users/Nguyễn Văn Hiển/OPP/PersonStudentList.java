/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author PC
 */
public class PersonStudentList extends PersonStudent {
    List<PersonStudent> stdList = new ArrayList<>();
    List<PersonStudent> sortList = new ArrayList<>();
    List<PersonStudent> addList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    
    public PersonStudentList() {
    }
    public List<PersonStudent> getStdList() {
        return stdList;
    }
    public void setStdList(List<PersonStudent> stdList) {
        this.stdList = stdList;
    }
    
    public void inputStdList() {
        System.out.print("Nhap si so sinh vien: ");
        int a = Integer.parseInt(input.nextLine());
        for(int i = 0; i < a; i++) {
            System.out.println("Nhap thong tin sinh vien thu: " +(i+1));
            PersonStudent std = new PersonStudent();
            std.inputInfo();
            stdList.add(std);
        }
    }
    
    public void addList() {
        coppyAddList();
        System.out.print("Nhap so luong sinh vien can nhap them: ");
        int a = Integer.parseInt(input.nextLine());
        for(int i = stdList.size(); i < stdList.size()+a; i++) {
            System.out.println("Nhap thong tin sinh vien thu " +i +" :");
            PersonStudent std = new PersonStudent();
            std.inputInfo();
            addList.add(std);
        }
        stdList.clear();
        for(PersonStudent std : addList) {
            stdList.add(std);
        }
    }
    
    public void coppyAddList() {
     for(int i = 0; i < stdList.size(); i++) {
            PersonStudent std = stdList.get(i);
            addList.add(std);
        }
    }
            
    
    public void coppyList() {
        for(int i = 0; i < stdList.size(); i++) {
            PersonStudent std = stdList.get(i);
            sortList.add(std);
        }
    }
    
    public void showStdList() {
        System.out.println("Danh sach sinh vien:");
        for(PersonStudent std : stdList) {
            std.showInfo();
        }
    }
    
    
    public void sortByEverage() {
        coppyList();
        Collections.sort(sortList, new Comparator<PersonStudent>() {
            @Override
            public int compare(PersonStudent e1, PersonStudent e2) {
                if (e1.getEverage() < e2.getEverage()) {
                    return 1;
                } else {
                    if (e1.getEverage() == e2.getEverage()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        System.out.println("Sinh vien co diem trung binh cao nhat:");
        sortList.get(0).showInfo();
        System.out.println("Sinh vien co diem trung binh thap nhat:");
        sortList.get(sortList.size()-1).showInfo();
    }
    
    public void sortByName() {
        coppyList();
        Collections.sort(sortList, new Comparator<PersonStudent>() {
            public int compare(PersonStudent n1, PersonStudent n2) {
                return n1.getName().compareTo(n2.getName());
            }
        });
        for(PersonStudent std : stdList) {
            std.showInfo();
        }
    }
    
    public void searchById() {
        System.out.print("Nhap ma sinh vien can tim: ");
        String id = input.nextLine();
        int flag = 0;
        for(PersonStudent std : stdList) {
            if(std.getId().equals(id) == true) {
                std.showInfo();
                flag++;
            }
        }
        if(flag == 0) {
            System.out.println("Khong tim duoc sinh vien co ma la: " +id);
        }
    }

    public void showScholarship() {
        coppyList();
        int flag = 0;
        Collections.sort(sortList, new Comparator<PersonStudent>() {
            @Override
            public int compare(PersonStudent e1, PersonStudent e2) {
                if (e1.getEverage() < e2.getEverage()) {
                    return 1;
                } else {
                    if (e1.getEverage() == e2.getEverage()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        for(PersonStudent std : sortList) {
            if(std.getEverage() > 8.0) {
                flag++;
            }
        }
        if(flag == 0) {
            System.out.println("Khong co sinh vien nao duoc hoc bong");
        } else {
            System.out.println("Danh sach sinh vien duoc hoc bong: ");
        }
        for(PersonStudent std : sortList) {
            if(std.getEverage() > 8.0) {
                std.showInfo();
            }
        }
    }
    
    public int Menu() {
        int chose;
        do {
            System.out.println("\n1. Nhap danh sach sinh vien");
            System.out.println("2. In danh sach sinh vien");
            System.out.println("3. Sinh vien co diem TB cao nhat va thap nhat");
            System.out.println("4. Tim kiem sinh vien theo ma sinh vien");
            System.out.println("5. In danh sach sinh vien sap xep theo thu tu bang chu cai");
            System.out.println("6. In danh sach sinh vien duoc hoc bong theo thu tu diem tu cao den thap");
            System.out.println("7. Thoat");
            System.out.print("Nhap lua chon: ");
            chose = Integer.parseInt(input.nextLine());
            if(chose < 1 || chose > 7) {
                System.out.println("Lua chon khong hop le. Nhap lai\n");
            }
        } while(chose < 1 || chose > 7);
        return chose;
    }
    
    public int nextOrNo() {
        System.out.print("Tiep tuc lua chon khac? YES/NO ");
        String s = input.nextLine();
        if(s.equalsIgnoreCase("YES") == true) {
            return 1;
        }
        if(s.equalsIgnoreCase("NO") == true) {
            return 0;
        } else {
            System.out.println("Nhap sai yeu cau. Chi duoc nhap YES/NO");
            return nextOrNo();
        }
    }
    
    public PersonStudentList(String id, double everage, String email, String name, String gender, String birth, String address) {
        super(id, everage, email, name, gender, birth, address);
    }
}
