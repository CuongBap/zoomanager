/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.AnimalList;
import DTO.Animals;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tester {
    
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        AnimalList obj = new AnimalList();
        do {
            System.out.println("1.Add new animal");
            System.out.println("2.Update animal");
            System.out.println("3.Delete animal");
           System.out.println("4.find animals by name or weight ");
            System.out.println("5.find show type");
            System.out.println("6.Exit");
            System.out.println("Nhap choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Animals newAnimal = new Animals();
                    newAnimal.input();
                    if (obj.addAnimals(newAnimal) == true) {
                        System.out.println("added");
                    } else {
                        System.out.println("fail");
                    }

                    break;

                case 2:
                    
                   String idcansua;
                   sc = new Scanner(System.in);
                    System.out.println("Nhap idcansua: ");
                    idcansua=sc.nextLine();
                    if(idcansua==null|| idcansua.length()==0){
                        System.out.println("animal doesn't exist");
                    }else{
                    obj.updateAnimals(idcansua);}
                    break;

                case 3:
                    String idAnicanxoa;
                    sc = new Scanner(System.in);
                    System.out.println("nhap id Animal Can Xoa: ");
                    idAnicanxoa = sc.nextLine();
                     if(idAnicanxoa==null|| idAnicanxoa.length()==0){
                        System.out.println("animal doesn't exist");
                    }else{
                    obj.removeAnimals(idAnicanxoa);}
                    break;
                    
 
                    
                case 4:
                boolean kt=false;
                
                do{
                    System.out.println("Enter '1' find animal by name" );
                    System.out.println("Enter '2' find animal by weight");
                    System.out.println("Enter '3' Exist");
                    
                    System.out.println("nhap op: ");
                    int op=sc.nextInt();
                    if(op==1){
                    
                            obj.printByname();
                            kt=true;
                    
                    }
                    else if(op==2){
                        
                            obj.printweight();
                    kt=true;
                }else{
                        System.out.println("exited.");
                        
                  kt=false;
                    
                }
                }while(kt);
                 break;
                
                case 5:
                    boolean kt2=false;
                    sc= new Scanner(System.in);
                    do{
                        System.out.println("ENter '1' show all list");
                        System.out.println("Enter '2' show by type");
                        System.out.println("exited");
                        System.out.println("Nhap lc: ");
                        int lc =sc.nextInt();
                        if(lc==1){
                            obj.displayAll();
                            kt2=true;
                        }else if(lc==2){
                        
                    boolean ns3= false;
                            
                    do{
                        System.out.println("Enter '1' 0-legged Animals");
             System.out.println("Enter '2' Bipedal- Flighttless animals");
             System.out.println("Enter '3' Bipedal-flying animals");
             System.out.println(" Enter '4' 4-legged animals");
                        System.out.println("Enter '5' exited");
             System.out.println("nhap tmp: ");
                 int tmp=sc.nextInt();
                if(tmp==1){
                      String result="0-legged animals";
                      Animals kp=obj.findAnimals1(result);
                      if(kp!=null){
                          kp.output();
                          
                      }else{
                          System.out.println("Don't find animals type.");
                      }
                      ns3=true;
                }
                      
                else if(tmp==2){
                         String result2= "Bipedal Flighttless animals";
                         Animals kp2=obj.findAnimals1(result2);
                         if(kp2!=null){
                             kp2.output();
                         }else{
                             System.out.println("Don't find animals type");
                         }
                         ns3=true;
                }
                         
                else if(tmp==3){
                         String result3="Bipedal flying animals";
                         Animals kp3=obj.findAnimals1(result3);
                         if(kp3!=(kp3)){
                             kp3.output();
                         }else{
                             System.out.println("Don't find animals type");
                         }
                         ns3=true;
                }
                
                         
                else if(tmp==4){
                         String result4="4-legged animals";
                         Animals kp4=obj.findAnimals1(result4);
                         if(kp4!=null){
                             kp4.output();
                         }else{
                             System.out.println("Don't find animals type");
                         }
                         ns3=true;
                }else{
                    System.out.println("Exited");
                    ns3=false;
                }
                }
                    while(ns3);
                    kt2=true;
                        }else{
                            System.out.println("Exited");
                            kt2=false;
                        }
                    }while(kt2);
                break;
                         
                     
                 
                   
                case 6:
                    System.exit(0);
                    break;
                        



            

        
                    }

}while(choice<=6);

        
    }
    
}
