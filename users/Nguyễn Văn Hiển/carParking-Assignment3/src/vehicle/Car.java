/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author PC
 */
public class Car extends Vehicle {

    public Car() {
    }
    
    public void checkType() {
        if(super.getLength() == 3 && super.getWidth() == 2) {
            System.out.println("Loai xe: Xe con");
        }
    }
    
    public int getCarWid() {
        return 2;
    }
    
    public int getCarLeng() {
        return 3;
    }

    public double crossCar() {
        double S;
        S = (2+1)*3;
        return S;
    }
    
    public double straightCar() {
        double S;
        S = (2+1)*3;
        return S;
    }
    
    public double horizonCar() {
        double S;
        S = 2*(3+1);
        return S;
    }
    
    public double crossCarLeng() {
        double L;
        L = Math.sqrt((Math.pow(3, 2)/2));
        return L;
    }
    
    public double horizonCarLeng() {
        double L;
        L = 2;
        return L;
    }
    
    public void displayCar(String a) {
        String s = "Car";
        System.out.print(s+"-"+a+"  ");
    }
    

    public Car(String brand, String license, int manufacture, int ownerId, int length, int width) {
        super(brand, license, manufacture, ownerId, length, width);
    }
}
