/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai43BaiTapCoBan;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author Duy Lumiere
 */
public class Bai43Bai6InSoDuoiDangChu {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        String KetQua;
        int numI;
        String numS;
        String nghin;
        String tram;
        String chuc;
        String donvi;
        String K = "0";
        String M = "1";
        String B = "4";
        String N = "5";
               
        do{
            System.out.println("\nNhập số (tối đa 4 chữ số): ");
            numI = Integer.parseInt(in.nextLine());
            numS = Integer.toString(numI);
            
            if(numS.length()>4){
                showAMess();
            }
            else if((numS.length() <= 4)&&(numS.length() > 0)){
                        switch(numS.length()){
                            case 4:
                                nghin = Character.toString(numS.charAt(0));
                                tram = Character.toString(numS.charAt(1));
                                chuc = Character.toString(numS.charAt(2));
                                donvi = Character.toString(numS.charAt(3));
                                
                                if((Pattern.matches("[0-9]",nghin))
                                        &&(Pattern.matches("[0-9]",tram))
                                        &&(Pattern.matches("[0-9]",chuc))
                                        &&(Pattern.matches("[0-9]",donvi)))
                                {
                                    KetQua = (exchangeNumToString(nghin) + " nghìn ");    
                                    
                                    KetQua += (exchangeNumToString(tram) + " trăm ");
                                    
                                    if(chuc.equals(K)){
                                        KetQua += ("linh ");
                                    }
                                    else if(chuc.equals(M)){
                                        KetQua += "Mười ";
                                    }
                                    else{
                                        KetQua += (exchangeNumToString(chuc) + " mươi ");
                                    };
                                    
                                    if((!chuc.equals(M))&&(!chuc.equals(K))&&(donvi.equals(M))){
                                        KetQua += "Mốt";
                                    }
                                    else if((chuc.equals(K))&&(donvi.equals(M))){
                                        KetQua += "Một";
                                    }
                                    else if((chuc.equals(M))&&(donvi.equals(K))){
                                        KetQua += "";
                                    }
                                    else if((chuc.equals(M))&&(donvi.equals(B))){
                                        KetQua += "Bốn";
                                    }
                                    else if((chuc.equals(K))&&(donvi.equals(N))){
                                        KetQua += "Năm";
                                    }
                                    else if(donvi.equals(B)){
                                        KetQua += "Tư";
                                    }
                                    else if(donvi.equals(N)){
                                        KetQua += "Lăm";
                                    }
                                    else{
                                        KetQua += exchangeNumToString(donvi);
                                    };
                                    
                                    if((tram.equals(K))&&(chuc.equals(K))&&(donvi.equals(K))){
                                        KetQua = (exchangeNumToString(nghin) + " nghìn ");;
                                    }
                                    
                                    System.out.println(KetQua);
                                }
                                else{
                                    showAMess();
                                };
                                break;

                            case 3:
                                tram = Character.toString(numS.charAt(0));
                                chuc = Character.toString(numS.charAt(1));
                                donvi = Character.toString(numS.charAt(2));
                                
                                if((Pattern.matches("[0-9]",tram))
                                        &&(Pattern.matches("[0-9]",chuc))
                                        &&(Pattern.matches("[0-9]",donvi)))
                                {
                                    KetQua = (exchangeNumToString(tram) + " trăm ");
                                    
                                    if(chuc.equals(K)){
                                        KetQua += ("linh ");
                                    }
                                    else if(chuc.equals(M)){
                                        KetQua += "Mười ";
                                    }
                                    else{
                                        KetQua += (exchangeNumToString(chuc) + " mươi ");
                                    };
                                    
                                    if((!chuc.equals(M))&&(!chuc.equals(K))&&(donvi.equals(M))){
                                        KetQua += "Mốt";
                                    }
                                    else if((chuc.equals(K))&&(donvi.equals(M))){
                                        KetQua += "Một";
                                    }
                                    else if((chuc.equals(M))&&(donvi.equals(K))){
                                        KetQua += "";
                                    }
                                    else if((chuc.equals(M))&&(donvi.equals(B))){
                                        KetQua += "Bốn";
                                    }
                                    else if((chuc.equals(K))&&(donvi.equals(N))){
                                        KetQua += "Năm";
                                    }
                                    else if(donvi.equals(B)){
                                        KetQua += "Tư";
                                    }
                                    else if(donvi.equals(N)){
                                        KetQua += "Lăm";
                                    }
                                    else{
                                        KetQua += exchangeNumToString(donvi);
                                    };
                                    
                                    if((chuc.equals(K))&&(donvi.equals(K))){
                                        KetQua = (exchangeNumToString(tram) + " trăm ");
                                    }
                                    
                                    System.out.println(KetQua);
                                }
                                else{
                                    showAMess();
                                };
                                break;

                            case 2:
                                chuc = Character.toString(numS.charAt(0));
                                donvi = Character.toString(numS.charAt(1));
                                
                                if((Pattern.matches("[0-9]",chuc))
                                        &&(Pattern.matches("[0-9]",donvi)))
                                {
                                    if(chuc.equals(M)){
                                        KetQua = "Mười ";
                                    }
                                    else{
                                        KetQua = (exchangeNumToString(chuc) + " mươi ");
                                    };
                                    
                                    if((!chuc.equals(M))&&(donvi.equals(M))){
                                        KetQua += "Mốt";
                                    }
                                    else if((chuc.equals(M))&&(donvi.equals(K))){
                                        KetQua += "";
                                    }
                                    else if((chuc.equals(M))&&(donvi.equals(B))){
                                        KetQua += "Bốn";
                                    }
                                    else if(donvi.equals(B)){
                                        KetQua += "Tư";
                                    }
                                    else if(donvi.equals(N)){
                                        KetQua += "Lăm";
                                    }
                                    else{
                                        KetQua += exchangeNumToString(donvi);
                                    };
                                    
                                    System.out.println(KetQua);
                                }
                                else{
                                    showAMess();
                                };
                                break;

                            case 1:
                                donvi = Character.toString(numS.charAt(0));
                                if((Pattern.matches("[0-9]",donvi)))
                                {
                                    KetQua = (exchangeNumToString(donvi));
                                    System.out.println(KetQua);
                                }
                                else{
                                    showAMess();
                                };
                                break; 
                        }
                    }
                    else{
                        showAMess();
                    };
            }
        
        while(true);
    }
        

    
    public static void showAMess(){
        System.out.print("Bạn đã nhập sai. Vui lòng nhập số trong khoảng từ 0->9999\n");
    }
    
    public static String exchangeNumToString(String x){
        switch(x){
            case "0":
                return "Không";
            case "1":
                return "Một";
            case "2":
                return "Hai";
            case "3":
                return "Ba";
            case "4":
                return "Bốn";
            case "5":
                return "Năm";
            case "6":
                return "Sáu";
            case "7":
                return "Bảy";
            case "8":
                return "Tám";
            case "9":
                return "Chín";
            default:
                return "";
        }
    }
}