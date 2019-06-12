/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.Bai66DienTichChuViHinhTronHinhChuNhat;
import java.util.Scanner;
/**
 *
 * @author Duy Lumiere
 */
public class MenuChuongTrinh {
                public static void main(String[] args){
                     Scanner in = new Scanner(System.in);
                                
                     int Select;
                     char Select2;
                     char y = "y".charAt(0);
                     char n = "n".charAt(0);
                     boolean repeat = false;
                     float BanKinh = 0;
                     Circle HinhTron = new Circle();
                     HinhTron.getPI();
                     
                     int ChieuDai = 0;
                     int ChieuRong = 0;
                     Rectangle HinhChuNhat = new Rectangle();
                     
                     
                     do{
                                System.out.println("\n\n===CHƯƠNG TRÌNH TÍNH THÔNG TIN CÁC HÌNH===");
                                System.out.println("1. Nhập THÔNG TIN hình tròn");
                                System.out.println("2. Tính CHU VI hình tròn");
                                System.out.println("3. Tính DIỆN TÍCH hình tròn");
                                System.out.println("4. Nhập THÔNG TIN hình chữ nhật");
                                System.out.println("5. Tính CHU VI hình chữ nhật");
                                System.out.println("6. Tính DIỆN TÍCH hình chữ nhật");
                                System.out.println("7. Thoát chương trình");
                                System.out.print("\nMời bạn chọn: ");
                                
                                Select = in.nextInt();
                                
                                System.out.println("");
                                
                                switch(Select){
                                    case 1:
                                        System.out.println("- Nhập bán kính hình tròn: ");
                                        BanKinh = in.nextFloat();
                                        HinhTron.InputRad(BanKinh);
                                        break;
                                    
                                    case 2:
                                        if(BanKinh==0){
                                            System.out.println("Bạn chưa nhập Bán kính, vui lòng thử lại và chọn bước số 1!");
                                        }
                                        else{
                                            System.out.println("Chu vi hình tròn là: " + HinhTron.CirclePerimeter());
                                        };
                                        break;
                                    
                                    case 3:
                                        if(BanKinh==0){
                                            System.out.println("Bạn chưa nhập Bán kính, vui lòng thử lại và chọn bước số 1!");
                                        }
                                        else{
                                            System.out.println("Diện tích hình tròn là: " + HinhTron.CircleSquare());
                                        };
                                        break;
                                    
                                    case 4:
                                        System.out.println("Nhập Chiều dài của Hình chữ nhật: ");
                                        ChieuDai = in.nextInt();
                                        HinhChuNhat.RecWidInp(ChieuDai);
                                        
                                        System.out.println("Nhập Chiều rộng của Hình chữ nhật: ");
                                        ChieuRong = in.nextInt();
                                        HinhChuNhat.RecHeiInp(ChieuRong);
                                        
                                        System.out.println("Bạn đã nhập: - Chiều dài: " + ChieuDai + " - Chiều rộng: " + ChieuRong);
                                        break;
                                    case 5:
                                        if((ChieuDai==0)||(ChieuRong==0)){
                                            System.out.println("Bạn chưa nhập Chiều dài hoặc Chiều rộng, vui lòng thử lại và chọn bước số 4!");
                                        }
                                        else{
                                            System.out.println("Chu vi Hình chữ nhật là: " + HinhChuNhat.RectanglePerimeter());
                                        }
                                        break;
                                    case 6:
                                        if((ChieuDai==0)||(ChieuRong==0)){
                                            System.out.println("Bạn chưa nhập Chiều dài hoặc Chiều rộng, vui lòng thử lại và chọn bước số 4!");
                                        }
                                        else{
                                            System.out.println("Diện tích Hình chữ nhật là: " + HinhChuNhat.RectangleSquare());
                                        }
                                        break;
                                    case 7:
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Vui lòng chọn đúng theo Menu đề bài!");
                                        do{
                                            System.out.print("(y/n): ");
                                            Select2 = in.next().charAt(0);
                                            if(Select2==y){
                                                repeat = false;
                                            }
                                            else if(Select2==n){
                                                System.exit(0);
                                            }
                                            else{
                                                repeat = true;
                                            }
                                        }
                                        while(repeat==true);
                                        break;
                                }
                     }
                     while(true);
                }
}
