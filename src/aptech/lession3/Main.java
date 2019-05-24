/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession3;

/**
 *
 * @author Diep.Tran
 */
public class Main {
    public static void main(String[] args) {
        Student std;
        
        std  = new Student();//Ham tao.
        
//        std.fullname = "Linh";
        std.age = 23;
        std.email = "linh@gmail.com";
        std.address = "Ha Noi";
        std.rollNo = "123456";
        
        std.display();
        std.running();
        std.learning();
        
//        Student std2 = new Student("Tran Van A");
//        System.out.println("Ten : " + std2.fullname);

        Animal animal = new Animal();
        
        animal.setName("Tiger");
        animal.setAge(10);
        
        System.out.println("Name : " + animal.getAge());
    }
}
