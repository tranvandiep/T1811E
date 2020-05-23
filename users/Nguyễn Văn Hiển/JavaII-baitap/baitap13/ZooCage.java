/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class ZooCage extends ZooAnimal {
    int cageId;
    List<ZooAnimal> zooCage = new ArrayList<>();

    public ZooCage() {
        
    }

    public int getCageId() {
        return cageId;
    }

    public void setCageId(int cageId) {
        this.cageId = cageId;
    }

    public List<ZooAnimal> getZooCage() {
        return zooCage;
    }

    public void setZooCage(List<ZooAnimal> zooCage) {
        this.zooCage = zooCage;
    }
    
    public void inputCage() {
        System.out.print("Nhap so luong chuong: ");
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++) {
            System.out.printf("Nhap chuong thu %d:\n", i+1);
            System.out.print("Nhap ma chuong: ");
            this.cageId = Integer.parseInt(input.nextLine());
            zooCage.add(this);
        }
    }
    
    public void inputAnimal() {
        System.out.print("Nhap so con can them: ");
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++) {
            System.out.printf("Nhap con vat thu %d:\n", i+1);
            System.out.print("Nhap loai con vat can them: ");
            String type = input.nextLine();
            if(type.equalsIgnoreCase("cat")) {
                ZooAnimal anm = new ZooCat();
                anm.inputInfo();
                zooCage.add(anm);
            }
            if(type.equalsIgnoreCase("dog")) {
                ZooAnimal anm = new ZooDog();
                anm.inputInfo();
                zooCage.add(anm);
            }
            if(type.equalsIgnoreCase("tiger")) {
                ZooAnimal anm = new ZooTiger();
                anm.inputInfo();
                zooCage.add(anm);
            }
        }
    }
    
    public void showAnimal() {
        for(int i = 0; i < zooCage.size(); i++) {
            zooCage.get(i).showInfo();
            zooCage.get(i).sound();
        }
    }
    
    public void deleteAnimal() {
        System.out.print("Nhap ten dong vat can xoa: ");
        String name = input.nextLine();
        for(int i = 0; i < zooCage.size(); i++) {
            if(zooCage.get(i).getName().equalsIgnoreCase(name) == true) {
                zooCage.remove(i);
            }
        }
        
        
    }

    public ZooCage(int cageId, ZooTiger tiger, ZooDog dog, ZooCat cat) {
        this.cageId = cageId;
    }

    @Override
    public void sound() {
        
    }
    
         
}
