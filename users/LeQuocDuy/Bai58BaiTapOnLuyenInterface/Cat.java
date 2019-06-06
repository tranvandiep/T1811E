/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai58BaiTapOnLuyenInterface;
import java.util.Scanner;

/**
 *
 * @author Duy Lumiere
 */
public class Cat extends Animal{
    private String color;
    
    public void Cat(){
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public void input(){
        Scanner in = new Scanner(System.in);
        
        super.input();
        System.out.println("Nhập màu sắc cho mèo: ");
        color = in.nextLine();
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Màu sắc: " + color);
    }
    
}
