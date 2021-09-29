/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Reptile extends Animals {
     public boolean knowCows;
    
     public Reptile(){
         super();
         knowCows= true;
         
         
     }

    public Reptile(boolean knowCows,String id, String name, String color, String gender, double weight){
        super(id, name, color, gender, weight);
        this.knowCows = knowCows;
        
    }

    public boolean isKnowCows() {
        return knowCows;
    }

    public void setKnowCows(boolean knowCows) {
        this.knowCows = knowCows;
    }
    
    public void input(){
        super.input();
      Scanner  sc= new Scanner(System.in);
        System.out.println("knowCows: ");
        knowCows=sc.nextBoolean();
    }

    public void output(){
        super.output();
        System.out.println("knowCows: " + knowCows);
    }
        
    
}
