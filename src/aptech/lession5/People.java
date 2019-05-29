/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession5;

/**
 *
 * @author Diep.Tran
 */
public class People implements Action{
    public static int x;
    public int y;
    
    public People() {
    }
    
    public static void abc() {
        System.out.println("Abc");
    }
    
    public void running() {
        System.out.println("People is running");
    }
}
