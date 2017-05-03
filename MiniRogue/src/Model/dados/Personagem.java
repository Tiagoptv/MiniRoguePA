/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dados;

/**
 *
 * @author Diogo
 */
public class Personagem {
    private int hp, xp, armor, gold, food, rank;
    private int fire, ice, poison, heal;
    
    public Personagem(){
        hp = xp = armor = gold = food = rank = 0;
        fire = ice = poison = heal = 0;
    }
    
    public int getHp(){return hp;}
    public int getXp(){return xp;}
    public int getArmor(){return armor;}
    public int getGold(){return gold;}
    public int getFood(){return food;}
    public int getFire(){return fire;}
    public int getIce(){return ice;}
    public int getPoison(){return poison;}
    public int getHeal(){return heal;}
    public int getRank(){return rank;}
    
    
    public void setHp(int hp){ this.hp = hp;}
    public void setXp(int xp){ this.xp = xp;}
    public void setArmor(int armor){ this.armor = armor;}
    public void setGold(int gold){ this.gold = gold;}
    public void setFood(int food){ this.food = food;}
    public void setFire(int fire){ this.fire = fire;}
    public void setIce(int ice){ this.ice = ice;}
    public void setPoison(int poison){ this.poison = poison;}
    public void setHeal(int heal){ this.heal = heal;}
    public void setRank(int rank){this.rank = rank;}

}
