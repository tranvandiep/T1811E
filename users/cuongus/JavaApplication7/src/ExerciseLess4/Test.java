/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciseLess4;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author anthony_jsc
 */
public class Test {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong cuon sach can nhap: ");
        do{
            n = Integer.parseInt(input.nextLine());
            if(n<0){
                System.out.println("So luong cuon sach la so nguyen duong");
            }
        }while(n < 0);
        
        AptechBook apt = new AptechBook();
        ArrayList<AptechBook> aptechBookList = new ArrayList<>();
        for (int i = 0; i < n; i++){
           apt.input();
           aptechBookList.add(apt);
        }
        
//        for (int i = 0; i < aptechBookList.size(); i++){
        for (int i = 0; i < n; i++){
            AptechBook apt2 = aptechBookList.get(i);
            
            apt2.display();
        }
    }
}
