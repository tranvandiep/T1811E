/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap433;
/**
 *
 * @author DELL
 */
public class BaiTap433 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int number[]= new int[] {12,22,44,55,11,223,66,88};
       int min=number[0];
       int max=number[0];
       for(int i=0;i < number.length;i++){
           if(number[i]<min){
               min=number[i];
           }
           if(number[i]>max){
               max=number[i];
           }
       }
        System.out.println("Gia tri nho nhat la: " +min);
        System.out.println("Gia tri lon nhat la " +max);
    }
    
}
