/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author mac
 */
public class De661 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat ();
        hcn.input_chieudai();
        hcn.input_chieurong();
        
        hcn.chuvi();
        hcn.dientich();
    }
    
}
