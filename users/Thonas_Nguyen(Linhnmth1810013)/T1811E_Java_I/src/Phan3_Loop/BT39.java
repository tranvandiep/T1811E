/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan3_Loop;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class BT39 {
    public static void main(String[] args) {
/*Practice 1:
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
           System.out.println("Element " + i + "is:");
           arr[i] = Integer.parseInt(input.nextLine());
           sum = arr[i] + sum;
        }
        System.out.println("Sum of array is:" + sum);
-------------------------------------------------------*/
/*Practice 2:
        int n;
        Scanner input = new Scanner(System.in);
        System.out.printf("input array number: ");
        n = Integer.parseInt(input.nextLine());
        int sum = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Element " + i + " is:");
            arr[i] = Integer.parseInt(input.nextLine());
            if((arr[i]%3) == 0 ){
                sum = arr[i] + sum;
            }  
        }
        System.out.println("Sum of array can devine 3: " + sum);
--------------------------------------------------------*/
/*Practice 3:
        int n;
        Scanner input = new Scanner(System.in);
        System.out.printf("Input number :");
        n = Integer.parseInt(input.nextLine());
        for(int i = 0; i<n; i++){
            System.out.println();
            for(int j =0; j<i+15; j++){
                System.out.printf("*");
            }
        }
--------------------------------------------------------*/
/*Practice 4:
        int max;
        Scanner input = new Scanner(System.in);
        System.out.printf("Input max: ");
        max = Integer.parseInt(input.nextLine());
        int[] F = new int[max];
        for(int i = 0; i<max; i++){
            if( i == 0 || i == 1){
                F[i] = 1 ;
            } else 
                F[i] = F[i-1]+F[i-2];
            if(F[i] < max){
                System.out.println("The number of Fibonaci lower than max is:" +
                         F[i]);
             }
        }
---------------------------------------------------------*/ 
        int n;
        int p;
        int tmpSort;
        Scanner input = new Scanner(System.in);
        System.out.printf("Input N: ");
        n = Integer.parseInt(input.nextLine());
        int[] myArr;
        myArr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("The number of myArr["+i+"] is: ");
            myArr[i] = Integer.parseInt(input.nextLine());           
        }
        System.out.printf("What do you wanna sort myArr by DESC(1)/ASC(2)?:");
        p = Integer.parseInt(input.nextLine());
        if(p == 1){
           System.out.println("The myArry sort by DESC is: ");
           for(int i =0; i < n -1; i++){
               for(int j = n -1; j>= 1; j--){
                if(myArr[j] < myArr[j - 1]){
                    tmpSort = myArr[j];
                    myArr[j] = myArr[j-1];
                    myArr[j - 1] = tmpSort;
                }
               }
           }
           for(int i =0; i < n; i++){
               System.out.printf("The number of myArr["+i+
                              "] after sort by DESC is:" );
                System.out.println(myArr[i]);
            }
        }
        
    }
}
