/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.Bai7OnLuyenVeOOP.BaiTap2QuanLySoThu;

/**
 *
 * @author Duy Lumiere
 */
public class Tiger extends Animal{
    public Tiger(){
        
    }

    public Tiger(String Ten) {
        super(Ten);
    }

    public Tiger(String Ten, int Tuoi) {
        super(Ten, Tuoi);
    }

    public Tiger(String Ten, int Tuoi, String MoTa) {
        super(Ten, Tuoi, MoTa);
    }
    
    @Override
    void TiengKeu() {
        System.out.println("Grawwwww!!!");
    }
    
}
