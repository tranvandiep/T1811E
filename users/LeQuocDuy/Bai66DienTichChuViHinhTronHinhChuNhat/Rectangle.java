/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai66DienTichChuViHinhTronHinhChuNhat;

/**
 *
 * @author Duy Lumiere
 */
public class Rectangle {
                public int RecWid;
                public int RecHei;
                
                public int RecPer;
                public int RecSqr;
                
                public void RecWidInp(int x){
                                RecWid = x;
                }
                
                public void RecHeiInp(int x){
                                RecHei = x;
                }
                
                public int RectanglePerimeter(){
                                this.RecPer = this.RecWid + this.RecHei;
                                return RecPer;
                };
                
                public int RectangleSquare(){
                                this.RecSqr = this.RecWid*this.RecHei;
                                return RecSqr;
                };
    
}
