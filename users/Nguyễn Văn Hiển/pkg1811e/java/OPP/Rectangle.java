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

public class Rectangle {
    int length;
    int width;
    int perimeter;
    int acreage;
    
    public Rectangle() {
    
    }
    
    public void setLength(int L) {
        this.length = L;
    }
    public void setWidth(int W) {
        this.width = W;
    }
    
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public int getPerimeter() {
        this.perimeter = (this.length + this.width)*2;
        return this.perimeter;
    }
    public int getAcreage() {
        this.acreage = this.length * this.width;
        return this.acreage;
    }
    
    public void display() {
        System.out.printf("Dien tich HCN la S = %d\n", this.acreage);
        System.out.printf("Chu vi HCN la A = %d\n", this.perimeter);
    }
    
    
}