/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt138;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Bt138 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str;
        String strCover = "";
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap vao chuoi : ");
        str = scanner.nextLine();
        
        for (int i = (str.length() - 1); i >= 0; i--) {
            strCover += str.charAt(i);
        }
        
        System.out.println(strCover);
    }
    
}
