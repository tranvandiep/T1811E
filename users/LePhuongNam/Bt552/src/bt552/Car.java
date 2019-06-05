/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt552;

import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Car implements IInfor{

    String tenCar;
    String mauCar;

    public Car() {
    }

    public Car(String tenCar, String mauCar) {
        this.tenCar = tenCar;
        this.mauCar = mauCar;
    }

    public String getTenCar() {
        return tenCar;
    }

    public void setTenCar(String tenCar) {
        this.tenCar = tenCar;
    }

    public String getMauCar() {
        return mauCar;
    }

    public void setMauCar(String mauCar) {
        this.mauCar = mauCar;
    }

    @Override
    public String toString() {
        return "Car{" + "tenCar=" + tenCar + ", mauCar=" + mauCar + '}';
    }
    
    @Override
    public void showInfor() {
        System.out.println(toString());
    }
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ten Car : ");
        setTenCar(scanner.nextLine());
        
        System.out.println("Nhap mau Car : ");
        setMauCar(scanner.nextLine());
    }
}
