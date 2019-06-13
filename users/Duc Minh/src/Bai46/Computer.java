/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai46;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Computer {

    String maMay;
    String hangMay;

    public Computer() {
    }

    public Computer(String maMay, String hangMay) {
        this.maMay = maMay;
        this.hangMay = hangMay;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getHangMay() {
        return hangMay;
    }

    public void setHangMay(String hangMay) {
        this.hangMay = hangMay;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ma may: ");
        maMay = input.nextLine();
        System.out.println("Nhap ten hang: ");
        hangMay = input.nextLine();
    }

    @Override
    public String toString() {
        return "Computer{" + "maMay=" + maMay + ", hangMay=" + hangMay + '}';
    }

    public void display() {
        System.out.println(toString());
    }

}
