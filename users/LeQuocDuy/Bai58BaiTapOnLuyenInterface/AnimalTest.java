/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai58BaiTapOnLuyenInterface;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Duy Lumiere
 */
public class AnimalTest {
    static List<Animal> Array = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choose;

        do{
            System.out.println("1. Add to Array");
            System.out.println("2. Display Array");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            choose = in.nextInt();

            switch(choose){
                case 1:
                    inputDataForAnimal();
                    break;
                case 2:
                    displayDataOfAnimal();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Wrong input!");
            };
        }
        while(true);   
    }
    
    public static void inputDataForAnimal(){
        Scanner in = new Scanner(System.in);
        int choose;
        boolean repeat = true;
        
        do{
            System.out.println("Choose your input type: ");
            System.out.println("1. Animal");
            System.out.println("2. Cat");
            System.out.println("3. Chicken");
            System.out.println("4. Done");
            System.out.print("Choose: ");
            choose = in.nextInt();

            switch(choose){
                case 1:
                    Animal ani = new Animal();
                    ani.input();
                    Array.add(ani);
                    break;
                case 2:
                    Cat cat = new Cat();
                    cat.input();
                    Array.add(cat);
                    break;
                case 3:
                    Chicken chic = new Chicken();
                    chic.input();
                    Array.add(chic);
                    break;
                case 4:
                    repeat = false;
                    break;
                default:
                    System.out.println("You choose wrong!");
                    break;
            };
        }
        while(repeat == true);
    }
    
    public static void displayDataOfAnimal(){
        Array.forEach((a) -> a.display());
    }
}
