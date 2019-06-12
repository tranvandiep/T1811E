/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf2javaadvance.bt102.bt102b1;
import java.util.Scanner;

/**
 *
 * @author Duy Lumiere
 */
public class bt102b1 {
    public static void main(String[] args) {
        String source;
        String searching;
        
        int strt = 0;
        int count = -1;
        int idx = -1;
        
        Scanner z = new Scanner(System.in);
        
        System.out.print("Nhập chuỗi SOURCE: ");
        source = z.nextLine();
        
        System.out.print("Nhập chuỗi SEARCHING: ");
        searching = z.nextLine();
        
        while (strt != -1)
        {
            strt = source.toLowerCase().indexOf(searching.toLowerCase(), idx + 1);
            count += 1;
            idx = strt;
        }
        
        System.out.println("Số lần xuất hiện của chuỗi '" + searching + "' trong chuỗi '" + source + "' là: " + count);
    }
}
