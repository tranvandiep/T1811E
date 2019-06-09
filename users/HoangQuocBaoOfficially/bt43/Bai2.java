/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt43;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Bai2 {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        int so;
        double soso;
        String chuoi;
        
        System.out.printf("Nhap so: ");
        so = Integer.parseInt(input.nextLine());
        
        System.out.printf("Nhap soso: ");
        soso = Double.parseDouble(input.nextLine());
        
        System.out.printf("Nhap chuoi: ");
        chuoi = input.nextLine();
        
        System.out.printf("So: %d\n", so);
        System.out.printf("So: %5f\n", soso);
        System.out.printf("So: %s\n", chuoi);
    }
}
