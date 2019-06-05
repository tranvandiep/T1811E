/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech;

/**
 *
 * @author Diep.Tran
 */
public class Test {
    enum LIGHT_STATUS {
        SANG,
        TAT,
        CHAY
    }
    
    public static void main(String[] args) {
        LIGHT_STATUS status = LIGHT_STATUS.TAT;
        
        System.out.println("Testing.....");
        
        String fullname = "Tran Van A";
        String address = "Nam Dinh";
        
        System.out.println("Ten : " + fullname + ", Dia chi : " + address);
        System.out.println("Dia chi : " + address);
        
        System.out.printf("Ten : %s, dia chi : %s", fullname, address);
    }
}
