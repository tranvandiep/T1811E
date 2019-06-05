/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap435;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class BaiTap435 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
    String ketQua = "";
    Scanner scanner = new Scanner(System.in);
     
    System.out.println("Giải phương trình ax^2 + bx + c = 0");
         
    do {
        System.out.print("Nhập a (a # 0): ");
        a = scanner.nextDouble();
    } while (a == 0);
    System.out.print("Nhập b: ");
    b = scanner.nextDouble();
    System.out.print("Nhập c: ");
    c = scanner.nextDouble();
         
    // tính delta = b * b - 4 * a * c;
    delta = Math.pow(b, 2) - 4 * a * c;
         
    // kiểm tra nếu delta < 0 thì phương trình vô nghiệm
    // delta = 0 thì phương trình có nghiệm kép
    // delta > 0 thì phương trình có 2 nghiệm phân biệt
    if (delta < 0) {
        ketQua = "Phương trình vô nghiệm!";
    } else if (delta == 0) {
        x1 = x2 = -b/ (2*a);
    } else {
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        ketQua = "Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2;
    }
         
    System.out.println(ketQua);
}

}


    
    

