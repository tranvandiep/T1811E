/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Zoo extends ZooCage {
    List<ZooCage> cageList = new ArrayList<>();
    ZooCage cage = new ZooCage();
    Scanner input = new Scanner(System.in);

    public Zoo() {
    }

    public List<ZooCage> getCageList() {
        return cageList;
    }

    public void setCageList(List<ZooCage> cageList) {
        this.cageList = cageList;
    }
    
    public void deleteCage() {
        System.out.print("Nhap ma chuong can xoa: ");
        int a = Integer.parseInt(input.nextLine());
        for(int i = 0; i < cageList.size(); i++) {
            if(cageList.get(i).getCageId() == a) {
                cageList.remove(i);
            }
        }
    }
    
        
    
}
