/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Garcia
 */
public class Batalha extends Personagem{
    
    int vidaUs = 100;
    int vidaPc = 100;
    int rounds = 3;
    

    
    public void imprimeVida(int vidaUS, int vidaPc){
        
        System.out.println("Nivel de vida Usuario" + vidaUs);
        System.out.println("Nivel de vida Maquina" + vidaPc);
        
  
    }
    
    public void exebatle(){
        
        while ((rounds < 3) || (vidaPc <= 0)|| (vidaUs <= 0)){
    
    
    
}
    }
    
    
}
