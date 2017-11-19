
package jogo;

/**
 *
 * @author Garcia
 */

import java.util.Random;

public class Templario extends Personagem{
    
    Random random = new Random();
   
    
    private int aurea = random.nextInt(6) + 1;
    private int talento = random.nextInt(4) + 1;
    
    public void  atacar(int forca){
        this.forca += this.talento;
    }
    
    public void  defender (int forca){
        this.defesa += this.talento;
    }
    
    public void ataque (int atacar){
        this.vidaUs-= (atacar - this.aurea);
    }
}
