/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author linhn
 */
public abstract class People implements IInfor{
    String ten;
    int age;
    String diaChi;

    public People() {
    }

    public People(String ten, int age, String diaChi) {
        this.ten = ten;
        this.age = age;
        this.diaChi = diaChi;
    }
    public abstract void input();
}
