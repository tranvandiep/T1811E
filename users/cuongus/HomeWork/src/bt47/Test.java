/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt47;

/**
 *
 * @author anthony_jsc
 */
public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.input();
        
        Employee employee2 = new Employee("A", "Man", "HN", "CEO", 1);
        
        employee1.display();
        employee2.display();
    }
}
