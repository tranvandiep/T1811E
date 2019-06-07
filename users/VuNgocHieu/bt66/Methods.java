/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT66;
import java.lang.Math;
/**
 *
 * @author Admin
 */
public class Methods {
    public void Circle(int r) {
        
        System.out.println("Dien tich hinh tron la: " + Math.PI*Math.pow(r, 2));
    }
    public void circumference(int r) {
        System.out.println("Chu vi hinh tron la: " + 2*Math.PI*r);
    }
    
    public void perimeterRectangle(int dai, int rong) {
        System.out.println("Ban kinh hinh chu nhat la: " + ((dai+rong)*2));
        
    }
    public void areaRectangle(int dai, int rong) {
        System.out.println("Dien tich hinh chu nhat la: " + dai*rong);
    }
}