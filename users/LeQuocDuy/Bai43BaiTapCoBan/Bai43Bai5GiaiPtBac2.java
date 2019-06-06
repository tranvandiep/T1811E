/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai43BaiTapCoBan;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Duy Lumiere
 */
public class Bai43Bai5GiaiPtBac2 {

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        double a,b,c,x1,x2,delta,xa;
	
        System.out.printf("This is program to find X in a quadratic equation");
        System.out.printf("\nQuadratic equation was browsered in: ax^2 + bx + c = 0");
	
        System.out.printf("\nInsert a: ");
        a = in.nextFloat();
	
        System.out.printf("\nInsert b: ");
        b = in.nextFloat();
	
        System.out.printf("\nInsert c: ");
        c = in.nextFloat();
        
        System.out.printf("\nYour equation is: %.1fx^2 + %.1fx + %.1f = 0",a,b,c);
	
        if((a==0)&&(b==0))
        {
            System.out.printf("\nX can be everynumber.");
        }
	
        else if((a==0)&&(b!=0)&&(c==0))
        {
            System.out.printf("\nX = 0");
        }
	
        else if((a==0)&&(b!=0)&&(c!=0))
        {
            xa=(-c)/b;
            System.out.printf("\nEquation become a simple equation with X = %.1f",xa);
        }
	
        else if(a!=0)
        {
            delta=b*b-4*a*c;
		
            //now let's check delta
		
            if(delta<0)
            {
                System.out.printf("\nEquation has no X");
            }
		
            else if(delta==0)
            {
                System.out.printf("\nEquation have dual X");
                x1=x2=(-b)/(2*a);
                System.out.printf("\nX1 = X2 = %.1f",x1);
            }
		
            else
            {
                System.out.printf("\nEquation have two separate X");
                x1=(-b+Math.sqrt(delta))/(2*a);
                x2=(-b-Math.sqrt(delta))/(2*a);
                System.out.printf("\nX1 = %.1f",x1);
                System.out.printf("\nX2 = %.1f",x2);
            };
        };
    };
};
