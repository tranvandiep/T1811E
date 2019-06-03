/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Scanner1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap n la so chan hay le ");
        n=Integer.parseInt(scanner.nextLine());
        if(n%2==0){
            System.out.println("So : "+n+" là số chẵn");
        }
        else{
            System.out.println("So : "+n+" là số lẻ");
        }
    }

}
