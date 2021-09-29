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
public class Birds extends Animals {
    public boolean canFly;
     
    public Birds(){
        super();
        canFly =true;
    }

    public Birds(boolean canFly, String id, String name, String color, String gender, double weight){
        super(id, name, color, gender, weight);
        this.canFly=canFly;
    }
    public boolean isCanFly() {
        return canFly;
    }

   

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

   public void input(){
       super.input();
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap canFly: ");
        canFly=sc.nextBoolean();
    }
      
   
   public void output(){
       super.output();
       System.out.println("canfly: " + canFly);
   }
   }
    
    
    
    

