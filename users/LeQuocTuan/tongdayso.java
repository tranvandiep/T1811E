
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LQT
 */
public class tongdayso {

    public static void main(String[] args) {
        int Tong = 0;
        int[] array = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu can tinh tong : ");
        int n = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.println("nhap phần tử thứ " + i);
            array[i] = Integer.parseInt(input.nextLine());
            Tong = Tong + array[i];
        }
        System.out.printf("Tong la %d", Tong);
    }
}
