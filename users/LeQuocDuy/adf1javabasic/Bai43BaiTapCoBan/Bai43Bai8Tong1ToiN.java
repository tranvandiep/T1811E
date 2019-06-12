/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.Bai43BaiTapCoBan;
import java.util.Scanner;
/**
 *
 * @author Duy Lumiere
 */
public class Bai43Bai8Tong1ToiN {
                public static void main(String[] args){
                                Scanner in = new Scanner(System.in);
                                int N;
                                int Tong=0;
                                boolean rep = false;
                                boolean rep2 = false;
                                char check;
                                char y = "y".charAt(0);
                                char n = "n".charAt(0);
                                
                                do{
                                            System.out.print("\nNhập N: ");
                                            N = in.nextInt();
                                            if(N<=1){
                                                            System.out.println("Bạn đã nhập sai điều kiện! Vui lòng thử lại");
                                                            rep = true;
                                            }
                                            else{
                                                            for(int i = 1; i<=N; i++){
                                                                            Tong+=i;
                                                            };
                                                            System.out.print("Tổng từ 1 đến " + N + " là: " + Tong + "\n");
                                                            do{
                                                                            System.out.print("Dừng chương trình? (y/n): ");
                                                                            check = in.next().charAt(0);
                                                                            if(check==y){
                                                                                      System.exit(0);
                                                                            }
                                                                            else if(check==n){
                                                                                        rep = true;
                                                                                        rep2 = false;
                                                                            }
                                                                            else{
                                                                                        rep2 = true;
                                                                            }
                                                            }
                                                            while(rep2==true);
                                                            
                                            };
                                }
                                while(rep==true);
                                
                }
}
