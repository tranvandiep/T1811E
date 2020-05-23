/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.DataStructure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
class VeMayBay {
    private String id;
    private String name;
    private String date;
    private String luggage;
    private double tkprice;

    public VeMayBay() {
    }

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        String vietjet = "^VJ[0-9]{1}[0-9]{1,2}";
        String vna = "^VN[0-9]{1}[0-9]{1,2}[0-9]{0,1}";
        String jetstar = "^JET[0-9]{1}[0-9]{1,2}";
        if(id.matches(vietjet) || id.matches(vna) || id.matches(jetstar)) {
            this.id = id;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return ("Chuyen bay: " +id +" - " +name +" - " +date +" - " +luggage +" - " +tkprice);
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Ma chuyen bay: ");
            String id = input.nextLine();
        } while(setId(id) == false);
        System.out.print("Ten khach hang: ");
        String name = input.nextLine();
        System.out.print("Ngay bay: ");
        String date = input.nextLine();
        System.out.print("Hanh ly: ");
        String luggega = input.nextLine();
        System.out.print("Gia ve: ");
        double price = Double.parseDouble(input.nextLine());
    }
    
    public void display() {
        System.out.println(toString());
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLuggage() {
        return luggage;
    }

    public void setLuggage(String luggage) {
        this.luggage = luggage;
    }

    public double getTkprice() {
        return tkprice;
    }

    public void setTkprice(double tkprice) {
        this.tkprice = tkprice;
    }

    
    
    
    public VeMayBay(String id, String name, String date, String luggage, double tkprice) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.luggage = luggage;
        this.tkprice = tkprice;
    }
    
    
}


public class baitap62II {
    
    public static List<VeMayBay> inputTicket() {
        int n;
        Scanner input = new Scanner(System.in);
        List<VeMayBay> list = new ArrayList<>();
        
        System.out.print("Nhap so luong ve: ");
        n = Integer.parseInt(input.nextLine());
        
        for(int i = 0; i < n; i++) {
            VeMayBay ticket = new VeMayBay();
            ticket.input();
            list.add(ticket);
        }
        return list;
    }
    
    public static void displayTicket(List<VeMayBay> list) {
        list.forEach((vmb) -> {
            vmb.display();
        });
    }
    
    public static void writeFile(List<VeMayBay> list) {
        VeMayBay[] arr = new VeMayBay[list.size()];
        arr = list.toArray(arr);
        
        try {
            File f = new File("C:/Users/PC/OneDrive/Documents/NetBeansProjects/1811E-Java/src/pkg1811e/java/DuLieuBay.txt");
            FileOutputStream fos = new FileOutputStream("C:/Users/PC/OneDrive/Documents/NetBeansProjects/1811E-Java/src/pkg1811e/java/DuLieuBay.txt");
            ObjectOutputStream objos = new ObjectOutputStream(fos);
            objos.writeObject(arr);
            objos.close();
        } catch(IOException ioe) {
            System.out.println("Save error");
        } 
    }
    
    public static void readFile() {
        VeMayBay[] arr = null;
        try {
            FileInputStream fis = new FileInputStream("C:/Users/PC/OneDrive/Documents/NetBeansProjects/1811E-Java/src/pkg1811e/java/DuLieuBay.txt");
            ObjectInputStream objis = new ObjectInputStream(fis);
            arr = (VeMayBay[])objis.readObject();
            objis.close();
        } catch(IOException ioe) {
            System.out.println("Read Error");
        } catch(ClassNotFoundException e) {
            System.out.println("Not found");
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
    
    public static void sortByPrice(List<VeMayBay> list) {
        Collections.sort(list, new Comparator<VeMayBay>() {
            @Override
            public int compare(VeMayBay o1, VeMayBay o2) {
                if(o1.getTkprice() < o2.getTkprice()) {
                    return 1;
                } else {
                    if(o1.getTkprice() == o2.getTkprice()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }
    
    public static void main(String[] args) {
        List<VeMayBay> ticketList = new ArrayList<>();
        
        ticketList = inputTicket();
        displayTicket(ticketList);
        writeFile(ticketList);
        readFile();
        sortByPrice(ticketList);
    }
}
