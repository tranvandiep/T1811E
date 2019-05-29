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

public class Circle {
    int radius;
    double pi;
    double perimeter;
    double acreage;

    public void setRadius(int rad) {
        this.radius = rad;
    }  
        
    public int getRadius() {
        return radius;
    }
    public double getPi() {
        this.pi = Math.PI;
        return pi;
    }
    public double getPerimeter() {
        this.perimeter = 2*this.radius*this.pi;
        return perimeter;
    }
    public double getAcreage() {
        this.acreage = Math.pow(this.radius, 2)*this.pi;
        return acreage;
    }
    
    public void display() {
        System.out.printf("Chu vi hinh tron la C = %f\n", perimeter);
        System.out.printf("Dien tich hinh tron la S = %f\n", acreage);
    }
    
    public Circle() {
        
    }
}




