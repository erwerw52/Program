/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author NUCT-電子工程系
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human boss = new Human();
        Human player = new Human();
        Scanner sc = new Scanner(System.in);
        System.out.println("歡迎來到遊戲十八仔");
        System.out.print("請先輸入姓名 : ");
        player.setName(sc.nextLine());
        System.out.printf("%s先生(小姐)你好%n",player.getName());
        System.out.println("請開始執骰(按下Enter)");
        String s = sc.nextLine();
        boss.setDice();
        player.setDice();
        if(s.equals("")){
            System.out.println("老闆骰出的是"+boss.getDice());
            System.out.printf("%s骰出的是%s%n",player.getName(),player.getDice());
            System.out.println("Boss total = "+boss.getTotal()+"\nPlayer total = "+player.getTotal());
            if(boss.getTotal() < player.getTotal()){
                System.out.println("Win");
            }
            else if(boss.getTotal() > player.getTotal()){
                System.out.println("Lose");
            }
            else{
                System.out.println("Drow");
            }
        }    
    }

}
