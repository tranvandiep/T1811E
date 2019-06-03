/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai47;

/**
 *
 * @author Minh
 */
public class Test {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.input();

        Employee employee2 = new Employee("Minh", "Nam", "HaNoi", "NhanVien", 5000000);

        employee1.dishplay();
        employee2.dishplay();
    }
}
