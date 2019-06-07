/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt48;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Program {
    public static void main(String[] args) {
        int choose;
        CTivi myTivi = new CTivi();
        Scanner scanner = new Scanner(System.in);
        
        do {
            showMenu();
            choose = Integer.parseInt(scanner.nextLine());
            
            switch (choose) {
                case 1 :
                    myTivi.Switch();
                    break;
                case 2 : 
                    int n;
                    String channel;
                    
                    System.out.println("Nhap vao so kenh muon khoi tao : ");
                    n = Integer.parseInt(scanner.nextLine());
                    while (n < 0) {                        
                        System.out.println("So kenh sai!!! Nhap lai : ");
                        n = Integer.parseInt(scanner.nextLine());
                    }
                    
                    String[] channelList = new String[n];
                    for (int i = 0; i < n; i++) {
                        System.out.printf("Nhap ten kenh thu %d : ", i+1);
                        channelList[i] = scanner.nextLine();
                    }
                    myTivi = new CTivi(channelList);
                    
                    System.out.println("Nhap kenh khoi dong khi tivi duoc bat : ");
                    channel = scanner.nextLine();
                    myTivi.Switch(channel);
                    myTivi.Show();
                    break;
                case 3 :
                    myTivi.On();
                    myTivi.Show();
                    break;
                case 4 :
                    myTivi.Off();
                    myTivi.Show();
                    break;
                case 5 : 
                    myTivi.nextChannel();
                    myTivi.Show();
                    break;
                case 6 :
                    myTivi.previousChannel();
                    myTivi.Show();
                    break;
                case 7 :
                    System.out.println(myTivi.toString());
                    break;
                case 8 : 
                    System.out.println("GoodBye!!!");
                    break;
                default:
                    System.err.println("Nhap sai!!!");
                    break;
            }
        } while (choose != 8);
    }
    
    static void showMenu(){
        System.out.println("1. Chuyen trang thai (switch)");
        System.out.println("2. Chuyen trang thai kem theo kenh");
        System.out.println("3. Bat tivi");
        System.out.println("4. Tat tivi");
        System.out.println("5. Chuyen kenh tiep");
        System.out.println("6.  Chuyen kenh truoc");
        System.out.println("7. Xem thong tin Tivi");
        System.out.println("8. Ket thuc");
        System.out.println("Choose : ");
    }
}
