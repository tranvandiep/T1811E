/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap434;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author DELL
 */
public class BaiTap434 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aNumber, bNumber;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        aNumber = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        bNumber = scanner.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -bNumber / aNumber;
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
    }
 
}
   
