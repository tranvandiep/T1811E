/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession3.step2;

import aptech.lession3.Student;

/**
 *
 * @author Diep.Tran
 */
public class Test {
    public static void main(String[] args) {
        Student std = new Student();
        
//        std.age = 23;
        std.email = "linh@gmail.com";
        std.address = "Ha Noi";
        std.rollNo = "123456";
        
        std.display();
        std.running();
        std.learning();
    }
}
