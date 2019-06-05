/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap436;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class BaiTap436 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String number="";
        System.out.println("Nhap mot chuoi ");
        number=scanner.nextLine();
        for(int i=0;i<4;i++){
            switch(i){
                case 0: System.out.print(number.charAt(i) +  " nghin ");
                    break;
                case 1: System.out.print(number.charAt(i) +  " tram ");
                    break;
                case 2: System.out.print(number.charAt(i) +  " muoi ");
                    break;
                case 3: System.out.print(number.charAt(i) +  " don vi");
                    break;
                default: ;
            }
        }
        
    }
    
}
