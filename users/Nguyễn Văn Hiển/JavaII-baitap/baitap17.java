/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.DataStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author PC
 */
class student {
    private int rollno;
    private String name;
    private String gender;
    private int age;
    private String email;
    private String address;
    Scanner input = new Scanner(System.in);

    public student() {
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo() {
        System.out.print("Ma sinh vien: ");
        this.rollno = Integer.parseInt(input.nextLine());
        System.out.print("Ho va ten: ");
        this.name = input.nextLine();
        System.out.print("Gioi tinh: ");
        this.gender = input.nextLine();
        System.out.print("Tuoi: ");
        this.age = Integer.parseInt(input.nextLine());
        System.out.print("Email: ");
        this.email = input.nextLine();
        System.out.print("Dia chi: ");
        this.address = input.nextLine(); 
    }
    
    public void showInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return ("Ma sinh vien: " + rollno + "\n" +
                name +"-" +gender +"-" +age +"-" +email +"-" +address);
    }
    
    
    
    public student(int rollno, String name, String gender, String email, String address) {
        this.rollno = rollno;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.address = address;
    }
}



public class baitap17 {
    public static int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Nhap thong tin sinh vien.");
        System.out.println("2. In thong tin sinh vien.");
        System.out.println("3. Tim kiem theo ma sinh vien.");
        System.out.println("4. Thoat.");
        System.out.print("Nhap lua chon: ");
        int n = Integer.parseInt(input.nextLine());
        return n;
    }
    
    public static HashMap inputList() {
        HashMap stdList = new HashMap();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++) {
            student std = new student();
            std.inputInfo();
            stdList.put(std.getRollno(), std);
        }
        return stdList;
    }
    
    public static void showList(HashMap list) {
        Set set = list.entrySet();
        Iterator ite = set.iterator();
        while(ite.hasNext()) {
            Map.Entry mapEntry = (Map.Entry)ite.next();
            System.out.println(mapEntry.toString());
        }
    }
    
    public static void searchRollno(HashMap list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma so sinh vien can tim: ");
        int rollno = Integer.parseInt(input.nextLine());
        Set set = list.entrySet();
        Iterator ite = set.iterator();
        while(ite.hasNext()) {
            Map.Entry mapEntry = (Map.Entry)ite.next();
            if((int)mapEntry.getKey() == rollno) {
                System.out.println(mapEntry.toString());
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        int chose;
        HashMap stdList = new HashMap();
        do {
            chose = menu();
            
            switch(chose) {
                case 1:
                    stdList = inputList();
                    break;
                case 2:
                    showList(stdList);
                    break;
                case 3:
                    searchRollno(stdList);
                    break;
                case 4:
                    break;
            }
        } while(chose != 4);
    }
}
