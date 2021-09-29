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
public class BirdSwiming extends Animals {
    public boolean canSwim;
    
    public BirdSwiming(){
         super();
         canSwim= true;
         
     }

    public BirdSwiming(boolean canSwim, String id, String name, String color, String gender, double weight) {
        super(id, name, color, gender, weight);
        this.canSwim = canSwim;
        
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }
    
    public void input(){
        super.input();
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap canSwim: ");
        canSwim= sc.nextBoolean();
    }

   public void output(){
       super.output();
       System.out.println("canSwim: " + canSwim);
    }
    
    
}
