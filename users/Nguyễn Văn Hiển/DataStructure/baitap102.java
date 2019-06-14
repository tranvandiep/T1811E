/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
class string {
    private String s;
    Scanner input = new Scanner(System.in);

    public void setS() {
//        this.s = "Vi du chuoi String de tim kiem v";
            System.out.print("Nhap chuoi: ");
            String s = input.nextLine();
            this.s = s;
    }
    public String getS() {
        return s;
    }

    public string() {
    }

    public string(String s) {
        this.s = s;
    }
    
}

class integer {
    private int num;
    
    public integer() {
    }

    public integer(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
}

public class baitap102 {
    public static void findString(String string) {
        int n;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chuoi can tim: ");
        String s = input.nextLine();
        do {
            n = string.indexOf(s);
            string = string.substring(n+1);
            if(n >= 0) {
                count++;
            }
        } while(n > 0);
        System.out.println("Chuoi "+s+" xuat hien "+count+" lan");
    }
    
    public static List<integer> intArr() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = Integer.parseInt(input.nextLine());
        List<integer> intArr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            integer x = new integer();
            System.out.printf("Nhap phan tu thu %d: ", i);
            x.setNum(Integer.parseInt(input.nextLine()));
            intArr.add(x);
        }
        for(int i = 0; i < n; i++) {
            System.out.printf(intArr.get(i).getNum()+"  ");
        }
        System.out.printf("\n");
        return intArr;
    }
    
    public static void stringStrBd() {
        Scanner input = new Scanner(System.in);
        StringBuilder strBd = new StringBuilder();
        List<String> listSBd = new ArrayList<>();
        List<Integer> lengSBd = new ArrayList<>();
        int leng = 0;
        int minus = 0;
        
        System.out.print("Nhap so chuoi can ghep: ");
        int n = Integer.parseInt(input.nextLine());
        string s = new string();
        for(int i = 0; i < n; i++) {
            s.setS();
            strBd.append(s.getS());
            listSBd.add(s.getS());
            lengSBd.add(s.getS().length());
        }
        System.out.print("Nhap chuoi can tim: ");
        String s2 = input.nextLine();
        String string = strBd.substring(0, strBd.length()-1);
        do {
            n = string.indexOf(s2);
            leng = s2.length() + string.substring(0, n).length() + leng;
            for(int i = 0; i < lengSBd.size(); i++) {
                minus = leng - lengSBd.get(i) - minus;
                if(minus <= 0) {
                    System.out.println(listSBd.get(i));
                }
            }
            string = string.substring(n+1);
        } while(n > 0);
    }
    
    public static void main(String[] args) {
//        //Bai 1:
        System.out.println("Bai 1:");
        string a = new string();
        a.setS();
        findString(a.getS());
        
        
        
        //Bai 2:
        System.out.println("\nBai 2:");
        List<integer> intList = new ArrayList<>();
        intList = intArr();
        
        
        //Bai 3:
        System.out.println("\nBai 3:");
        stringStrBd();
    }
}
