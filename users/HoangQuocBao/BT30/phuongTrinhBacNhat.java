/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt30;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PhuongTrinhBacNhat {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in); 
        float a;
        float b;
        
        System.out.printf("Nhap so a: ");
        a = Float.parseFloat(input.nextLine());
        
        System.out.printf("Nhap so b: ");
        b = Float.parseFloat(input.nextLine());
        
        if (a == 0 && b == 0) System.out.printf("ptrinh co vo so nghiem x");
        else if (a == 0 && b != 0) System.out.printf("ptrinh vo nghiem");
        else if (a != 0) {
            float c = (-b /a);
            System.out.printf("ptrinh co nghiem x duy nhat co gia tri bang: %f\n", c);
        }
    }
}
