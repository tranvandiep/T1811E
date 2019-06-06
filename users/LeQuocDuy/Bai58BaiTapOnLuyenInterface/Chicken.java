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
public class Chicken extends Animal{
    private int numberOfLeg;
    
    public void Chicken(){
        
    };

    public int getNumberOfLeg() {
        return numberOfLeg;
    }

    public void setNumberOfLeg(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void input() {
        Scanner in = new Scanner(System.in);
        int numleg;
        super.input();
        System.out.println("Nhập số chân gà: ");
        numleg = in.nextInt();
        setNumberOfLeg(numleg);
    }
    
    
    
}
