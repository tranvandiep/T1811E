/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diep.Tran
 */
public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        
//        list.stream().forEach((t)-> {
//            System.out.println("t = " + t);
//        });
        list.stream().forEach(System.out::println);
        
        list.parallelStream().forEach((t) -> {
            System.out.println("t = " + t);
        });
        list.parallelStream().forEach(System.out::println);
    }
}
