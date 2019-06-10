/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession7;

/**
 *
 * @author Diep.Tran
 */
public class Dog extends Animal implements IRuning{

    @Override
    public void showSound() {
        System.out.println("Go go!!!");
    }

    @Override
    public void onRunning() {
        System.out.println("Dog is running");
    }
    
}
