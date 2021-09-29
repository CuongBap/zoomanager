/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author ASUS
 */
public class AnimalsType {

        public String type;
    public String numberleg;
    public Boolean poisonous;
    public Boolean makesound;
    public Boolean heroic;
    public Boolean danger;
  
    
    public AnimalsType(){
        type="";
        numberleg="";
        poisonous=true;
        makesound=true;
        heroic=true;
        danger=true;
        
    }

    public AnimalsType(String type, String numberleg, Boolean poisonous, Boolean makesound, Boolean heroic, Boolean danger) {
        this.type = type;
        this.numberleg = numberleg;
        this.poisonous = poisonous;
        this.makesound = makesound;
        this.heroic = heroic;
        this.danger = danger;
    }

    public String getType() {
        return type;
    }

  

    public Boolean getPoisonous() {
        return poisonous;
    }

    public void setPoisonous(Boolean poisonous) {
        this.poisonous = poisonous;
    }

  

    public String getNumberleg() {
        return numberleg;
    }

    
    public Boolean getMakesound() {
        return makesound;
    }

    public Boolean getHeroic() {
        return heroic;
    }

    public Boolean getDanger() {
        return danger;
    }

    public void setType(String type) {
        this.type = type;
    }

   
    
    public void setNumberleg(String numberleg) {
        this.numberleg = numberleg;
    }


    public void setMakesound(Boolean makesound) {
        this.makesound = makesound;
    }

    public void setHeroic(Boolean heroic) {
        this.heroic = heroic;
    }

    public void setDanger(Boolean danger) {
        this.danger = danger;
    }

  
    
    
}
