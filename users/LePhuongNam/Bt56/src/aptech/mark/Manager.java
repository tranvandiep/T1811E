/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.mark;

import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Manager {

    public static void main(String[] args) {
        int choose;
        Scanner scanner = new Scanner(System.in);
        
        do {            
            choose = Integer.parseInt(scanner.nextLine());
            
            switch (choose) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;
        }
        } while (choose != 5);
    }

    static void showMenu() {
        System.out.println("1. Input n information of Aptech’s student.");
        System.out.println("2. Input m exam marks for these students");
        System.out.println("3. Sort by Student’s name and display the list.");
        System.out.println("4. Find information of exam marks by student’s id");
        System.out.println("5. Exit");
        System.out.println("Choose : ");
    }
}
