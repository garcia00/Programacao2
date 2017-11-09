
package jogo;

/**
 *
 * @author Garcia
 */

import java.util.Random;

public class Mago extends Personagem{
    
    Random random = new Random();
    
 
    private int magia = random.nextInt(5) + 1;
    private int feitico = random.nextInt(7) + 2;
    
    public void  atacar(int fmagia){
        this.magia += this.feitico;
    }
    
    public void  defender (int forca){
        this.defesa += this.feitico;
    }
    
    public void ataque (int atacar){
        this.vidaUs-= (atacar - this.magia);
    }
}
