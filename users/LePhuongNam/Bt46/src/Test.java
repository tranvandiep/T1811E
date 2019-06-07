
import computer.Computer;
import house.House;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hlamg
 */
public class Test {
    public static void main(String[] args) {
        
        //Bai 1
        List<Computer> arrComputer = new ArrayList<>();
        
        arrComputer.add(new Computer());
        arrComputer.add(new Computer("Dell M4700", "i7-3470QM", "8GB", "500GB", "Quardo K1000M"));
        
        //Bai 2
        List<House> arrHouse = new ArrayList<>();
        
        arrHouse.add(new House());
        arrHouse.add(new House("18 Tran Hung Dao, Binh Giang, HD", 100, 2, 2005));
    }
}
