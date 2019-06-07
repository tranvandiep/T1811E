/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HCNPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class HCNTest extends Hinhchunhat{
    public static void main(String[] args) {
        List<Hinhchunhat> arrHcn = new ArrayList<>(); 
        int n;
        Scanner scanner = new Scanner(System.in);
        
        do {            
            System.out.println("Nhap so hinh chu nhat muon tao : ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 1);
        
        for (int i = 0; i < n; i++) {
            Hinhchunhat hcn = new Hinhchunhat();
            
//            System.out.printf("Nhap thong tin hcn thu %d : ", i+1);
            System.out.println("Nhap thong tin hcn thu " + (i+1) + " : ");
            hcn.setDaiRong();
            System.out.println("");
            
            hcn.dientichHCN();
            arrHcn.add(hcn);
        }
        
        arrHcn.forEach((t) -> {
            t.display();
        });
        
        Collections.sort(arrHcn, new Comparator<Hinhchunhat>() {
            @Override
            public int compare(Hinhchunhat o1, Hinhchunhat o2) {
                if (o1.getDienTich() > o2.getDienTich()) {
                    return -1;
                }
                return 1;
            }
        });
        
        System.out.println("Thong tin HCN co dien tich lon nhat la : ");
        System.out.println(arrHcn.get(0));
    }
}
