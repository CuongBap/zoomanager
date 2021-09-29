/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author ASUS
 */
public class AnimalList {
    ArrayList<Animals> list;
    String filename="Animals.txt";
    
    public AnimalList(){
//        list=FileAnimals.openFile(filename); 
        list = new ArrayList();
    }

    public ArrayList<Animals> getList() {
        return list;
    }

    public void setList(ArrayList<Animals> list) {
        this.list = list;
    }
    
    public boolean addAnimals(Animals ani1 ){
       FileAnimals.writeFile(list);
       boolean result =  list.add(ani1);
        
        return result;
    }
    
    public Animals findAnimals(String id){
        for(Animals animal: list)
            if(animal.getId().equals(id))
                return animal;
        return null;
        
    }
    
    public boolean removeAnimals(String id){
       
        Animals kp2 = findAnimals(id);
        if(kp2!=null){
            list.remove(kp2);
            System.out.println("deleted successfully");
        }else{
            System.out.println("deleted not successfully");
            
            
        }
        return false;
        
    }
    
    public boolean updateAnimals(String id){
        Animals kq=findAnimals(id);
        if(kq!=null){
            Scanner sc = new Scanner(System.in);
            System.out.println("input new name: ");
            id=sc.nextLine();
            if(id.length()>0){
            kq.setName(id);
            }else;
            
             sc= new Scanner(System.in);
              System.out.println("input new color: ");
              id=sc.nextLine();
              if(id.length()>0){
            kq.setColor(id);
              }else;
              
              
            sc= new Scanner(System.in);
             System.out.println("input new gender: ");
             id=sc.nextLine();
             if(id.length()>0){
            kq.setGender(id);
             }else;
            
            sc= new Scanner(System.in);
             System.out.println("input new weight: ");
             id=sc.nextLine();
             if(id.length()>0){
                 double b = Double.parseDouble(id);
            kq.setWeight(b);
             }else;
             
             System.out.println("Enter chose Group");
             int choice=0;
             {
                 System.out.println("1.O-legged Animals");
                 System.out.println("2.Bipedal- Flighttless animals");
                 System.out.println("3.Bipedal-flying animals");
                 System.out.println("4.4-legged animals");
                 int Choice= sc.nextInt();
                 switch(choice){
                     case 1:
                         
                 }
                 
             }
             
            return true;
             
        }else{
            System.out.println("don't find id");
        }
        return false;
    }
    
  /* public ArrayList<Animals>  findAnimals1(ArrayList<Animals> list, String namcantim){
        String nameCantim;
        ArrayList<Animals> listAnifindbyname = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap name can tim: ");
        nameCantim=sc.nextLine();
        for(Animals animal: list){
            // check student have name conttains input
            if(animal.getName().contains(nameCantim)){
                listAnifindbyname.add(animal);
            }
        }
        return listAnifindbyname;
        
    }*/
    
    public void printByname(){
        String chosenName;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chosenName: ");
        chosenName=sc.nextLine();
        System.out.println("Result: ");
        int count=0;
        for(Animals a: list)
            if(a.name.indexOf(chosenName)>=0){
                a.output();
                count++;
            }
        if(count>0) System.out.println(count + "animal.");
        else System.out.println("No result is found");
    
                        
    }
    
    public void printweight(){
        double weight1, weight2;
       Scanner sc = new Scanner(System.in);
        System.out.println("input weight1: ");
        System.out.println("weight1: ");
        weight1=Double.parseDouble(sc.nextLine());
        System.out.println("input weight2: ");
        System.out.println("weight2: ");
        weight2=Double.parseDouble(sc.nextLine());
        
        if(weight1 > weight2){
           double t= weight1;
        weight1=weight2;
        weight2=t;
        }
        for(Animals a : list){
            double weight=a.getWeight();
            if(weight >= weight1 && weight <= weight2)
                a.output();
        }
        
    }
    
    public Animals findAnimals1(String group){
     
        for(Animals x: list)
            if(x.getType().equals(group))
                x.output();
        return null;
        
    }
    
    
public void displayAll(){
    for(Animals animal : list)
        animal.output();
    
}
}
