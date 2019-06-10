/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment522;

import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class Car implements Infor{

    String carName;
    String color;

    public Car() {
    }

    public Car(String tenCar, String mauCar) {
        this.carName = tenCar;
        this.color = mauCar;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String tenCar) {
        this.color = tenCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String mauCar) {
        this.color = mauCar;
    }

    @Override
    public String toString() {
        return "Car{" + "carName=" + carName + ", color=" + color + '}';
    }
    
    @Override
    public void showInfor() {
        System.out.println(toString());
    }
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ten xe : ");
        setCarName(scanner.nextLine());
        
        System.out.println("Nhap mau sac : ");
        setColor(scanner.nextLine());
    }
}
