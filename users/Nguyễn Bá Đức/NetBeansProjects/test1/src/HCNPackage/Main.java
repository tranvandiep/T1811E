/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HCNPackage;

/**
 *
 * @author HP ENVY
 */
public class Main{ 
    float chieuDai;
    float chieuRong;

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    
        interface HCNPackage {
            void dienTichHCN();
            void getChieudai();
            void getChieuRong();
        }
        
        abstract class testInterface implements HCNPackage {
            public float dienTichHCN () {
                return chieuDai * chieuRong;
            }
            public void getChieudai() {
                
            }
            
        }

    public static void main(String[] args) {
        
    }
}
