/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan3_Loop;

import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class BT43_Main {
    public static void main(String[] args) {
/* Practice 1:
        System.out.println("Hello, this is my first appliation");
    
---------------------------------------------------*/
/* Practice 2:
        int i;
        double db;
        char ch;
        String str;
        Scanner input = new Scanner(System.in);
        System.out.printf("Input integer variable: ");
        i = Integer.parseInt(input.nextLine());
        System.out.printf("Input double variable: ");
        db = Double.parseDouble(input.nextLine());
        System.out.printf("Input char variable: ");
        ch = input.next().charAt(0);
        System.out.println("Input String variable: ");
        str = input.nextLine();
        System.out.printf("Integer variable is: " + i);
        System.out.printf("Double variable is: " + db);
        System.out.printf("Char variable is: " + ch);
        System.out.printf("String variable is: " + str);
---------------------------------------------------*/
/* Practice 3:
        Scanner input = new Scanner(System.in);
        int n;
        int[] myArr;
        System.out.printf("Input number of Array: ");
        n  = Integer.parseInt(input.nextLine());
        myArr = new int[n];
        for(int i =0; i<n; i++){
           System.out.printf("Input number " + i + ": ");
           myArr[i] = Integer.parseInt(input.nextLine());
        }
        int min = myArr[0];
        int max = myArr[0];
        for(int i = 0; i < n; i++){
           if( myArr[i] < min){
               min = myArr[i];
           }
           if( myArr[i] > max){
               max = myArr[i];
           }
        }
        System.out.println("The min number in Array is: " + min);
        System.out.println("The max number in Array is: " + max);
------------------------------------------------------*/
/* Practice 4 Giải phương trình bậc nhất    ax + b = 0.
        int a, b, x;
        Scanner input = new Scanner(System.in);
        System.out.printf("Input number a: ");
        a = Integer.parseInt(input.nextLine());
        System.out.printf("Input number b: ");
        b = Integer.parseInt(input.nextLine());
        x = -(b/10);
        System.out.println("The argument of equation ax + b = 0 is: " + x);
 --------------------------------------------------------------*/
/* Practice 5 Giải phương trình bậc 2 ax^2 + bx +c = 0.
        int a, b, c;
        float delta, x1 ,x2;
        Scanner input = new Scanner(System.in);
        System.out.println("Input number a: ");
        a = Integer.parseInt(input.nextLine());
        System.out.println("Input number b: ");
        b = Integer.parseInt(input.nextLine());
        System.out.println("Input number c: ");
        c = Integer.parseInt(input.nextLine());
        if(a==0){
            System.out.println("The equation haven't variable");
        } else if((a+b+c) == 0){
            x1 = 1;
            x2 = c/a;
            System.out.println("The equation have x1 is: " + x1);
            System.out.println("The equation have x1 is: " + x2);
        } else if((a-b+c) == 0){
            x1 = -1;
            x2 = -(c/a);
            System.out.println("The equation have x1 is: " + x1);
            System.out.println("The equation have x1 is: " + x2);
        }
        delta = b*b - 4 * a * c;
        if(delta < 0){
            System.out.println("The equation haven't variable");
        } else if(delta == 0){
            x1 = x2 = -(b/2*a);
            System.out.println("The equation have x1 is: " + x1);
            System.out.println("The equation have x1 is: " + x2);
        } else if(delta > 0){
            x1 = (-b + delta)/ 2*a;
            x2 = (-b - delta)/ 2*a;
            System.out.println("The equation have x1 is: " + x1);
            System.out.println("The equation have x1 is: " + x2);
        }
--------------------------------------------------------------*/
        int a,b,c,d, n;
        Scanner input = new Scanner(System.in);
        System.out.printf("Input number: ");
        n = Integer.parseInt(input.nextLine());
        a = n%10;
        b = n/10;
        c = (n/10)/10;
        b = n/100;
        switch(c)
	{
            case 1:
                System.out.printf("Mot nghin");break;
            case 2:
                System.out.printf(" Hai nghin"); break;
            case 3:
                System.out.printf(" Ba nghin"); break;
            case 4:
                System.out.printf(" Bon nghin"); break;
            case 5:
                System.out.printf(" Nam nghin"); break;
            case 6:
                System.out.printf(" Sau nghin"); break;
            case 7:
                System.out.printf(" Bay nghin"); break;
            case 8:
                System.out.printf(" Tam nghin"); break;
            case 9:
                System.out.printf(" Chin nghin"); break;
	}
        switch(c)
	{
            case 1:
                System.out.printf("Mot tram");break;
            case 2:
                System.out.printf(" Hai tram"); break;
            case 3:
                System.out.printf(" Ba tram"); break;
            case 4:
                System.out.printf(" Bon tram"); break;
            case 5:
                System.out.printf(" Nam tram"); break;
            case 6:
                System.out.printf(" Sau tram"); break;
            case 7:
                System.out.printf(" Bay tram"); break;
            case 8:
                System.out.printf(" Tam tram"); break;
            case 9:
                System.out.printf(" Chin tram"); break;
	}
        switch(b)
	{
            case 1:
                System.out.printf("Muoi");break;
            case 2:
                System.out.printf(" Hai muoi"); break;
            case 3:
                System.out.printf(" Ba muoi"); break;
            case 4:
                System.out.printf(" Bon muoi"); break;
            case 5:
                System.out.printf(" Nam muoi"); break;
            case 6:
                System.out.printf(" Sau muoi"); break;
            case 7:
                System.out.printf(" Bay muoi"); break;
            case 8:
                System.out.printf(" Tam muoi"); break;
            case 9:
                System.out.printf(" Chin muoi"); break;
	}
        switch(a)
	{
            case 0:
                System.out.printf("Khong");break;
            case 1:
                System.out.printf("Mot");break;
            case 2:
                System.out.printf(" Hai "); break;
            case 3:
                System.out.printf(" Ba"); break;
            case 4:
                System.out.printf(" Bon "); break;
            case 5:
                System.out.printf(" Nam "); break;
            case 6:
                System.out.printf(" Sau "); break;
            case 7:
                System.out.printf(" Bay "); break;
            case 8:
                System.out.printf(" Tam "); break;
            case 9:
                System.out.printf(" Chin "); break;
	}
/*Practice 7 Tính tổng từ 1 đến 100
        int x;
        int sum = 0;
        for( int i = 1; i <= 100; i++){
            sum = i + sum;
        }
        System.out.println("The sum of 1 to 100: "+sum);
---------------------------------------------------------------*/

    }     
}
