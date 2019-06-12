/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.Bai66DienTichChuViHinhTronHinhChuNhat;

/**
 *
 * @author Duy Lumiere
 */
public class Circle {           
            public float PI ;
            public float getPI(){
                        PI = 3.14f;
                        return PI;
            };
            public float Rad;
            public float PCircle;
            public float SCircle;
            
            public void InputRad(float x){
                        Rad = x;
            };
            public float CirclePerimeter(){
                        PCircle = 2*PI*Rad;
                        return PCircle;
            };
            public float CircleSquare(){
                        SCircle = PI*Rad*Rad;
                        return SCircle;
            };
            
}
