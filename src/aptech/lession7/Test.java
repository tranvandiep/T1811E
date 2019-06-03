/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Diep.Tran
 */
public class Test {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.showSound();
//        
//        doRunning(dog);
        //Cach 1
        IRuning runing = new IRuning() {
            @Override
            public void onRunning() {
                System.out.println("Test is running");
            }
        };
        doRunning(runing);
        //Cach 1 - 1
//        IRuning runing01 = () -> {
//            System.out.println("Test is running");
//        };
        //Cach 1 -2 
        IRuning runing01 = () -> System.out.println("Test is running");
        doRunning(runing01);
        
        //Cach 2
        doRunning(new IRuning() {
            @Override
            public void onRunning() {
                System.out.println("Test is running");
            }
        });
        
        //Cach 2 - 1
        doRunning(() -> {
            System.out.println("Test is running");
        });
        
        doRunning(() -> System.out.println("Test is running"));
        
//        Animal dog = new Animal() {
//            @Override
//            public void showSound() {
//                System.out.println("Go go!!!");
//            }
//        };
//        dog.showSound();
//        
//        Dog dog2 = new Dog() {
//            @Override
//            public void showSound() {
//                System.out.println("go go go!!!");
//            }
//        };
//        dog2.showSound();
        
//        List<Integer> list = new ArrayList<>();
//        
//        list.add(12);
//        list.add(45);
        
//        list.forEach((x) -> {
//            System.out.println("list[] = " + x);
//        });
        
//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer t) {
//                System.out.println("list[] = " + t);
//            }
//        });
    }
    
    private static void doRunning(IRuning iRuning) {
        iRuning.onRunning();
    }
}
