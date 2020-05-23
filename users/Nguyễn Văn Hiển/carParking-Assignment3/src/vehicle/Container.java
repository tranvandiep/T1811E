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
public class Container extends Vehicle {

    public Container() {
    }
    
    public int getConWid() {
        return 3;
    }
    
    public int getConLeng() {
        return 5;
    }
    
    public void checkType() {
        if(super.getLength() == 5 && super.getWidth() == 3) {
            System.out.println("Loai xe: Xe container");
        }
    }
    
    public double crossCon() {
        double S;
        S = (3+1)*5;
        return S;
    }
    
    public double straightCon() {
        double S;
        S = (3+1)*5;
        return S;
    }
    
    public void displayCon(String a) {
        String s = "Con";
        System.out.print(s+"-"+a+"   ");
    }
    
    public double horizonCon() {
        double S;
        S = 3*(5+1);
        return S;
    }
    
    public double crossConLeng() {
        double L;
        L = Math.sqrt((Math.pow(5, 2)/2));
        return L;
    }
    
    public double horizonConLeng() {
        double L;
        L = 3;
        return L;
    }
    
    public Container(String brand, String license, int manufacture, int ownerId, int length, int width) {
        super(brand, license, manufacture, ownerId, length, width);
    }
}
