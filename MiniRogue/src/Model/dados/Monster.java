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
public class Monster extends Carta {
    private final int level, dmg, rewardXp;
    private int hp;
    
    public Monster(Jogo j){
        nome = "Monster";
        this.level = j.getLevel();
        dmg = j.getLevel() * 2;
        hp = j.getArea() + Dado.lancaDado();
        if(j.getLevel() == 5)
            rewardXp = 3;
        else
            if(j.getLevel() < 3 )
                rewardXp = 1;
            else
                rewardXp = 2;
        
    }
    
    public int getLevel(){return level;}
    public int getDmg(){return dmg;}
    public int getRewardXp(){return rewardXp;}
    public int getHp(){return hp;}
    
    public void setHp(int hp){ this.hp = hp;}
    
    public void Ataca(Jogo j){
        j.getPersonagem().setHp((j.getPersonagem().getHp()-(dmg - j.getPersonagem().getArmor()))); // retira os pontos da armor ao damage do boss e retira os pontos hp consoanto o dmg resultante
    }
    
    public void recebeRecompensa(Jogo j){
        j.getPersonagem().setGold((j.getPersonagem().getXp()+getRewardXp()));
    }
    
    public void desenhaCarta(){
        System.out.print("+");
        for (int i = 0; i < 36; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.println("+\t\tMonster\t\t     +");
        System.out.println("+\t\t\t\t     +");
        System.out.println("+\t\t\t\t     +");
        System.out.println("+\t\t\t\t     +");
        System.out.println("+\t\t\t\t     +");
        System.out.println("+\t\t\t\t     +");
        System.out.println("+\t\t\t\t     +");
        System.out.println("+\t\t\t\t     +");
        System.out.println("+\t\t\t\t     +");
        System.out.println("+\t\t\t\t     +");
        System.out.println("+\t\t\t\t     +");
        System.out.println("+\t\t\t\t     +");
        System.out.println("+\t\t\t\t     +");
        System.out.println("+  Level\t\tDMG  REWARD  +");
        System.out.println("+\033[31m  1. Undead Soldier     2    1 XP   \033[0m+");
        System.out.println("+\033[31m  2. Skeleton           4    1 XP   \033[0m+");
        System.out.println("+\033[31m  3. Undead Knight      6    2 XP   \033[0m+");
        System.out.println("+\033[31m  4. Serpent Knight     6    2 XP   \033[0m+");
        System.out.println("+ \033[31m 5. Og's Sanctum Guard 6    2 XP   \033[0m+");
        System.out.println("+\t\t\t\t     +");
        System.out.println("+\t\t\t\t     +");
        System.out.print("+");
        for (int i = 0; i < 36; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    
}
