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
public class BossMonster extends Carta{
    private final int level, dmg, rewardGold, rewardXp;
    private int hp;
    
    public BossMonster(Jogo j){
        nome = "BossMonster";
        this.level = j.getLevel();
        hp = 5 + (j.getLevel() * 5);
        if(j.getLevel() == 5)
            dmg = 12;
        else{
            dmg = j.getLevel() * j.getLevel() + 1;
        }
        if(j.getLevel() < 3)
            rewardGold = 2;
        else
            rewardGold = 3;
        rewardXp = j.getLevel() + 1;
    }
    
    public int getLevel(){return level;}
    public int getHp(){return hp;}
    public int getDmg(){return dmg;}
    public int getRewardGold(){return rewardGold;}
    public int getRewardXp(){return rewardXp;}
    
    public void setHp(int hp){this.hp = hp;}
    
    public void Ataca(Jogo j){
        j.getPersonagem().setHp((j.getPersonagem().getHp()-(dmg - j.getPersonagem().getArmor()))); // retira os pontos da armor ao damage do boss e retira os pontos hp consoanto o dmg resultante
    }
    
    public void recebeRecompensa(Jogo j){
        j.getPersonagem().setGold((j.getPersonagem().getGold()+getRewardGold()));
        j.getPersonagem().setGold((j.getPersonagem().getXp()+getRewardXp()));
        
        for (int i = 0; i < j.getCartas().size();i++) {
            if(j.getCartas().get(i).getNome().equals(this.getNome())){
                j.getCartas().set(i, new Treasure());
            }
        }
    }
    
    public void desenhaCarta(){
        
    }
}
