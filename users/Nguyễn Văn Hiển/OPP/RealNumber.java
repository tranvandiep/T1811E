/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

/**
 *
 * @author PC
 */
import java.util.Scanner;

interface inputDisplay {
    void input();
}

public class RealNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        inputDisplay realNumber = new inputDisplay() {
            double[] numArr = new double[2];
            @Override
            public void input() {
                try {
                    for(int i = 0; i < 2; i++) {
                        System.out.printf("Nhap so thu %d: ", i+1);
                        numArr[i] = input.nextDouble();
                    }
                } catch(Exception e) {
                    System.out.println("Error " +e.getMessage());
                } finally {
                    for(double num : numArr) {
                        System.out.println(num);
                    }
                }
            };
        };
        realNumber.input();
    }
}
