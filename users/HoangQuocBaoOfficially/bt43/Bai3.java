/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT43;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Bai3 {
    public static int max(int x, int y) {
        if (x >y) return x;
        else return y;
    }
    
    public static int min(int x, int y) {
        if (x <y) return x;
        else return y;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int x;
        int y;
        
        System.out.printf("Nhap so x: ");
        x = Integer.parseInt(input.nextLine());
        
        System.out.printf("Nhap so y: ");
        y = Integer.parseInt(input.nextLine());
            
        max(x ,y);
        min(x, y);
    }
}
