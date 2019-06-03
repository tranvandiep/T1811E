/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession7;

import com.sun.xml.internal.messaging.saaj.util.Base64;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Diep.Tran
 */
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String source = "Sinh vien aptech";
        //ma hoa
        byte[] sBytes = source.getBytes("utf8");
        byte[] encodeBytes = Base64.encode(sBytes);
        String encodeStr = new String(encodeBytes);
        
        System.out.println(encodeStr);
        
        //dich nguoi
        String decode = Base64.base64Decode(encodeStr);
        System.out.println(decode);
    }
}
