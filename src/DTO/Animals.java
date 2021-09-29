/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Animals extends AnimalsType {
    public String id;
    public String name;
    public String color;
    public String gender;
    public double weight;
    
    public Animals(){
        id="";
        name="";
        color="";
        gender="";
        weight=0;
    }

    public Animals(String id, String name, String color, String gender, double weight) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.weight = weight;
    }

    Animals(String string, String ran, String den, String x, int i, String legged_animals, String leg, boolean b, boolean b0, boolean b1, boolean b2, boolean b3) {
        
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    public void input(){
         Scanner sc= new Scanner(System.in);
         System.out.println("nhập id: ");
         id =sc.nextLine();
         
         sc= new Scanner(System.in);
         System.out.println("nhap name: ");
         name=sc.nextLine();
         
         sc= new Scanner(System.in);
         System.out.println("nhap gender: ");
         gender=sc.nextLine();
         
          
         
       sc= new Scanner(System.in);
         System.out.println("nhap color: ");
         color=sc.nextLine();
         
    
         
         sc= new Scanner(System.in);
         System.out.println("nhap Weight");
         weight=sc.nextDouble();
         
         System.out.println("chon group animal: ");
         {
             System.out.println("1.O-legged Animals");
             System.out.println("2.Bipedal- Flighttless animals");
             System.out.println("3.Bipedal-flying animals");
             System.out.println("4.4-legged animals");
            int choice=sc.nextInt();
             switch(choice){
                 case 1:
                     setType("0-legged animals");
                     setNumberleg("0 leg");
                     setPoisonous(true);;
                     setMakesound(false);
                     setHeroic(false);
                     setDanger(true);
                     break;
                     
                 case 2:
                     setType("Bipedal Flighttless animals");
                     setNumberleg("2 leg");
                     setPoisonous(false);
                     setMakesound(true);
                     setHeroic(false);
                     setDanger(false);
                     break;
                     
                 case 3:
                     setType("Bipedal flying animals");
                     setNumberleg("2 leg");
                     setPoisonous(false);
                     setHeroic(true);
                     setMakesound(false);
                     setDanger(false);
                     
                     break;
                     
                 case 4:
                 setType("4-legged animals");
                     setNumberleg("4 leg");
                     setPoisonous(false);
                     setMakesound(false);
                     setHeroic(false);
                     setDanger(true);
                     break;
                 
             }
             
         }
     }

    public void output(){
        System.out.print("id: " + id);
        System.out.print(", name: " + name);
        System.out.print(", gender: " + gender);
        System.out.print(", color: " + color );
        System.out.print(", weight: " + weight);
        System.out.print(", type: " + type);
        System.out.print(", numberleg: " + numberleg);
        System.out.print(", poisonous: " +poisonous);
        System.out.print(", makesound: " + makesound);
        System.out.print(", heroic: " + heroic);
        System.out.println(", danger: " + danger);
        
  
    }

   
  

   
    
    
    
    
    
}
