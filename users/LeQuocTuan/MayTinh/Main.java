/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.buoi2.ThucHanhBuoi2;

import java.util.Scanner;

/**
 *
 * @author LQT
 */
public class Main {

    public static void main(String[] args) {
        Calculator pheptinh = new Calculator();
        int choose;
        Scanner input = new Scanner(System.in);
        pheptinh.inputNumber();
        do {
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    int resultSum = pheptinh.resultSum();
                    System.out.printf("tong la %d \n", resultSum);
                    break;

                case 2:
                    int resultSub = pheptinh.resultSub();
                    System.out.printf("Hieu la %d \n", resultSub);
                    break;

                case 3:
                    int resultMul = pheptinh.resultMul();
                    System.out.printf("Tich la %d \n", resultMul);
                    break;

                case 4:
                    int resultDiv = pheptinh.resultDiv();
                    System.out.printf("Thuong la %d \n", resultDiv);
                    break;
            }
        } while (choose != 5);

    }

    static void showMenu() {
        System.out.println("1. Ket qua phep cong");
        System.out.println("2. Ket qua phep tru");
        System.out.println("3. Ket qua phep nhan");
        System.out.println("4. Ket qua phep chia");
        System.out.println("5. Thoat");
    }

}
