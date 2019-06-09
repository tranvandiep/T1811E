/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai46;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Car {
    String maXe;
    String hangXe;

    public Car() {
    }

    public Car(String maXe, String hangXe) {
        this.maXe = maXe;
        this.hangXe = hangXe;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ma may: ");
        maXe = input.nextLine();
        System.out.println("Nhap ten hang: ");
        hangXe = input.nextLine();
    }

    @Override
    public String toString() {
        return "Car{" + "maXe=" + maXe + ", hangXe=" + hangXe + '}';
    }

    public void display() {
        System.out.println(toString());
    }
}
