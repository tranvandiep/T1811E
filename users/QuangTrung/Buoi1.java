/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

/**
 *
 * @author Admin
 */
public class Buoi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int x=5;
    int y=x++;
    int z=++x;
    int t=y++ + ++y - --z;
    System.out.printf("x=%d, y=%d, Z=%d,t=%d", x, y, z, t);
    }
}
