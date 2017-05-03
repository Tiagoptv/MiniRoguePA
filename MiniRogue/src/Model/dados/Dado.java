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
public class Dado {
    
    Dado(){}
    
    public static int lancaDado(){
        return (int)(Math.random()*6) + 1;
    }
}
