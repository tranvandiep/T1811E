///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package pkg1811e.java.OPP;
//
///**
// *
// * @author PC
// */
import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhap chieu dai L = ");
            int L = input.nextInt();
            rectangle.setLength(L);
            System.out.print("Nhap chieu dai W = ");
            int W = input.nextInt();
            rectangle.setWidth(W);
            if(rectangle.getLength() < rectangle.getWidth()) {
                System.out.println("Nhap chieu dai phai lon hon chieu rong");
            }
        } while(rectangle.getLength() < rectangle.getWidth());
        
        rectangle.getAcreage();
        rectangle.getPerimeter();
        rectangle.display();
    }
}
