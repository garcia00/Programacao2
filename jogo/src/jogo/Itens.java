
package jogo;

/**
 *
 * @author 201611140011
 */

import java.util.Random;


public abstract class Itens {
    
    Random rand = new Random();
    
    private final int peso;
    private int armas;
    private int armaduras;
    private String nome;
    
    public Itens(int peso){
        
        if (peso < 0){
            
              throw new IllegalArgumentException("Ação negada!");
        }
           
        this.peso = peso;
    }
    
 
    
}
