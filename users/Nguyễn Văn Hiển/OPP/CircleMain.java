/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ban kinh R = ");
        int R = input.nextInt();
        circle.setRadius(R);
        circle.getPi();
        circle.getPerimeter();
        circle.getAcreage();
        circle.display();
    }
}
