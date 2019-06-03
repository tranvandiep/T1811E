/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession7;

/**
 *
 * @author Diep.Tran
 */
public class Test2 {
    public static void main(String[] args) {
        ISleeping sleeping = new ISleeping() {
            @Override
            public void sleeping(String message) {
                System.out.println("Message : " + message);
            }
        };
        sleeping.sleeping("123");
        
        ISleeping sleeping2 = (String message) -> {
            System.out.println("Message : " + message);
        };
        sleeping2.sleeping("321");
        
        ISleeping sleeping3 = (message) -> {
            System.out.println("Message : " + message);
        };
        sleeping3.sleeping("321");
        
        ISleeping sleeping4 = (message) -> System.out.println("Message : " + message);
        sleeping4.sleeping("321");
    }
}
