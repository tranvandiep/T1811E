/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llnfor;

import java.util.Scanner;

/**
 *
 * @author DuongQuangHuy
 */
public class Cat implements IInfor {
    String NameCat;
    String color;

    public Cat() {
    }

    public Cat(String NameCat, String color) {
        this.NameCat = NameCat;
        this.color = color;
    }

    public String getNameCat() {
        return NameCat;
    }

    public void setNameCat(String NameCat) {
        this.NameCat = NameCat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("nhap ten meo : ");
        NameCat = input.nextLine();
        System.out.println("nhap mau con meo :  ");
        color = input.nextLine();
    }

    @Override
    public void showInfor() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Cat{" + "NameCat=" + NameCat + ", color=" + color + '}';
    }

 
}
