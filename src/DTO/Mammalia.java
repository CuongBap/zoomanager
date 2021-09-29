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
public class Mammalia extends Animals{
    public boolean canHunt;
    
    public Mammalia(){
        super();
        canHunt= true;
         
    }

    public Mammalia(boolean canHunt, String id, String name, String color, String gender, double weight) {
        super(id, name, color, gender, weight);
        this.canHunt = canHunt;
        
    }

    public boolean isCanHunt() {
        return canHunt;
    }

    public void setCanHunt(boolean canHunt) {
        this.canHunt = canHunt;
    }
    
  public void input(){
    super.input();
    Scanner sc=new Scanner(System.in);
      System.out.println("nhap canHunt: ");
      canHunt= sc.nextBoolean();
 }

   public void output(){
       super.output();
       System.out.println("canHunt: " + canHunt);
    }
    
}
