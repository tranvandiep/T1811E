/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class CustomerManager extends Customer {
    List<Customer> customList = new ArrayList<>();

    public CustomerManager() {
    }

    public void inputInfo() {
        System.out.print("Nhap no luong khach hang: ");
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++) {
            Customer custom = new Customer();
            custom.inputCustom();
            customList.add(custom);
        }
    } 
    
    public void showInfo() {
        customList.forEach((custom) -> {
            System.out.println(custom.toString());
        });
    }
    
    public CustomerManager(int id, String name, int age, String address, String gender, int birthYear) {
        super(id, name, age, address, gender, birthYear);
    }
}
