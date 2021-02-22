/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.ArrayList;
import java.util.Collections;

public class Human {
    private ArrayList<Integer> dice = new ArrayList();
    private int total;
    private String name;

    public ArrayList<Integer> getDice() {
        Collections.sort(dice);
        return dice;
    }

    public void setDice() {
        int sum = 0;
        for(int i=0;i<4;i++){
            int random =(int)((Math.random()*6)+1);
            dice.add(random);
            sum += dice.get(i);
        }
        for(int i=0;i<4;i++){
            for(int j=i+1;j<4;j++){
                if(dice.get(i)==dice.get(j)){
                    total = sum-2*dice.get(j);
                }
            }
        }
        if(total == 3){
                total = 0;
            }
        
        if(dice.get(0)==dice.get(1)&&dice.get(1)==dice.get(2)||dice.get(1)==dice.get(2)&&dice.get(2)==dice.get(3)){
                total = 0;
            }
       
        
    }

    public int getTotal() {
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
}
