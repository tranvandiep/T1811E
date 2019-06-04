/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt65;
import java.util.Scanner;
/**
 *
 * @author mac
 */
public class Calculator {
    int x;
    int y;

    public Calculator() {
    }
    
    
    Scanner input = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap so thu nhat:");
        x = Integer.parseInt(input.nextLine());
        System.out.println("Nhap so thu hai:");
        y = Integer.parseInt(input.nextLine());
    }
    
    public void cong(){
        int a = x + y;
        System.out.printf("Tong 2 so la: %d\n", a);
    }
    
    public void tru(){
        int b;
        if(x>y){
            b = x - y;
        }
        else{
            b = y-x;
        }
        System.out.printf("Hieu 2 so la: %d\n",b);
    }
    
    public void nhan(){
        int c;
        c = x * y ;
        System.out.printf("Tich 2 so la: %d\n",c);
    }
    
    public void chia(){
        int d;
        if ( y == 0){
            System.out.printf("Khong chia het cho 0\n");
        }
        else{
            d = x/y;
            System.out.printf("Thuong 2 so la: %d", d);
        }
    }
}
