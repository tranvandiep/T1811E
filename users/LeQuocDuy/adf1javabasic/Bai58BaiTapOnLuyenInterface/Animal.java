/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.Bai58BaiTapOnLuyenInterface;
import java.util.Scanner;

/**
 *
 * @author Duy Lumiere
 */
public class Animal implements IAnimal{
        private String Name;
        private double Weight;
        
        public void Animal(){
            
        }

        

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public double getWeight() {
            return Weight;
        }

        public void setWeight(double Weight) {
            this.Weight = Weight;
        }
        
        public void input(){
            Scanner in = new Scanner(System.in);
            
            System.out.println("Nhập tên con vật: ");
            Name = in.nextLine();
            System.out.println("Nhập cân nặng con vật: ");
            Weight = in.nextDouble();
        }
        
        public void display(){
            System.out.println("Tên con vật là: " + Name);
            System.out.println("Cân nặng con vật là: " + Weight);
        }
        
        
}
