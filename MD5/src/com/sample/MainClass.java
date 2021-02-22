package com.sample;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        String str = sc.nextLine();  //要加密的字串
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
            'B', 'C', 'D', 'E', 'F'};

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("UTF-8"));
            //Hash計算, 產生128位的長整數
            byte[] bytes = messageDigest.digest();
            StringBuilder sb = new StringBuilder(bytes.length * 2);
            for (byte b : bytes) {
                //右移四位, 取字節中前四位轉換
                sb.append(hexDigits[(b >> 4) & 0x0f]);
                //取字節中後四位轉換
                sb.append(hexDigits[b & 0x0f]);
            }
            //輸出 602965cf9dd0e80ca28269257a6aba87
            System.out.println(sb.toString());
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
        }
    }

}
