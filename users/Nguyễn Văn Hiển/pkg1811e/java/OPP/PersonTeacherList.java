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
public class PersonTeacherList extends PersonTeacher {
    List<PersonTeacher> tcList = new ArrayList<>();
    List<PersonTeacher> sortList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    public PersonTeacherList() {
    }

    @Override
    public void inputInfo() {
        System.out.print("Nhap so luong giao vien: ");
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++) {
            PersonTeacher tc = new PersonTeacher();
            tc.inputInfo();
            tcList.add(tc);
        } 
    }
    
    public void addInfo() {
        int n = tcList.size();
        System.out.print("Nhap so luong giao vien can nhap them: ");
        int a = Integer.parseInt(input.nextLine());
        for(int i = n; i < n+a; i++) {
            System.out.println("Nhap thong tin giao vien thu " +i +" :");
            PersonTeacher tc = new PersonTeacher();
            tc.inputInfo();
            tcList.add(tc);
        }
    }
    
    @Override
    public void showInfo() {
        for(PersonTeacher tc : tcList) {
            tc.showInfo();
        }
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    public void coppyList() {
        for(int i = 0; i < tcList.size(); i++) {
            sortList.add(tcList.get(i));
        }
    }
    
    public void searchMaxFee() {
        coppyList();
        Collections.sort(sortList, new Comparator<PersonTeacher>() {
            @Override
            public int compare(PersonTeacher f1, PersonTeacher f2) {
                if(f1.getFee() < f2.getFee()) {
                    return 1;
                } else {
                    if(f1.getFee() == f2.getFee()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });
        System.out.println("Giao vien luong cao nhat thang la: ");
        sortList.get(0).showInfo();
    }
    
    public int Menu() {
        System.out.println("1. Nhap thong tin giao vien");
        System.out.println("2. In thong tin giao vien");
        System.out.println("3. In ra giao vien co luong cao nhat thang");
        System.out.println("4. Thoat");
        System.out.print("Nhap lua chon: ");
        int chose = Integer.parseInt(input.nextLine());
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
    
    
    public PersonTeacherList(String classId, double feePerHour, double hourPerMonth, String name, String gender, String birth, String address) {
        super(classId, feePerHour, hourPerMonth, name, gender, birth, address);
    }
}
