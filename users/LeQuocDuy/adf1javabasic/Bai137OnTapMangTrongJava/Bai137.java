/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.Bai137OnTapMangTrongJava;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Duy Lumiere
 */
public class Bai137 {
                public static void main(String[] args){
                                Scanner in = new Scanner(System.in);
                                int N;
                                boolean repeat = false;
                                int Sum = 0;
                                int Sum2 = 0;
                                int Count = 0;
                                ArrayList<Integer> ArrDivThree = new ArrayList<>();
                                
                                System.out.print("- Nhập N: ");
                                N = in.nextInt();
                                int[] Arr = new int[N];
                                System.out.println("\nBạn đã tạo thành công 1 mảng số nguyên với " + N + " phần tử.");
                                System.out.println("Vui lòng nhập giá trị cho mảng (lưu ý nhập số dương): \n");
                                
                                for(int i = 0; i < N; i++){
                                                do{
                                                            System.out.print("Nhập giá trị cho phần tử thứ " + (i+1) + ": ");
                                                            Arr[i] = in.nextInt();
                                                            if(Arr[i]<=0){
                                                                        System.out.println("Bạn đã nhập sai yêu cầu, vui lòng thử lại!\n");
                                                                        repeat = true;
                                                            }
                                                            else{
                                                                        repeat = false;
                                                            };
                                                }
                                                while(repeat==true);
                                                
                                                Sum+= Arr[i];
                                                
                                                if(Arr[i]%3==0){
                                                            Count++;
                                                            Sum2+=Arr[i];
                                                            ArrDivThree.add(Arr[i]);
                                                };
                                }
                                
                                System.out.println("\nMảng gồm " + N + " phần tử số nguyên dương bạn vừa nhập là: ");
                                System.out.println(Arrays.toString(Arr));
                                System.out.println("Tổng tất cả các phần tử trong mảng là: " + Sum);
                                System.out.println("Có " + ArrDivThree.size() + " phần tử trong mảng chia hết cho 3: ");
                                System.out.println(ArrDivThree);
                                System.out.println("Tổng tất cả các phần tử chia hết cho 3 trong mảng là: " + Sum2);                
                }
}
