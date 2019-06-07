
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
public class fibonaci {
    public static void main(String[] args) {
     int SoNhapVao;
        int[] array = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số : ");
        SoNhapVao = Integer.parseInt(input.nextLine());
        int i;
        int x = 0;
        for(i = 1; x < SoNhapVao; i++){
        array[0] = 0;
        array[1] =1;
        x = array[i];
        array[i+1] = array[i] +array[i-1];
       System.out.printf("%d \n", array[i-1]);
        }
    }
}
