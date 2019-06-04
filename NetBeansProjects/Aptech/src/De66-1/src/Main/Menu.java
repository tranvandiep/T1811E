/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;
/**
 *
 * @author mac
 */
public class Menu {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        HinhChuNhat hcn = new HinhChuNhat ();
        boolean cont = true;
        do{
            System.out.printf("Nhap chuc nang tu 1 den 7: ");
            
            int n = Integer.parseInt(input.nextLine());
            
            switch (n) {
            case 1:
                circle.input();
                break;
            case 2:
                circle.chuvi();
                break;
            case 3:
                circle.dientich();
                break;
            case 4:
                hcn.input_chieudai();
                hcn.input_chieurong();
                break;
            case 5:
                hcn.chuvi();
                break;
            case 6:
                hcn.dientich();
                break;
            case 7:
                System.out.printf("Thoat");
            }
        }while(cont);
        
    }
}
