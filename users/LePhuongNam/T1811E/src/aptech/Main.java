/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech;

import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        String chuoi1 = scanner.nextLine();
        String chuoi2 = "";
        
        for (int i = chuoi1.length() - 1; i >= 0; i--) {
            chuoi2 += chuoi1.charAt(i);
        }
        
        System.out.println(chuoi2);
    }
    
}
