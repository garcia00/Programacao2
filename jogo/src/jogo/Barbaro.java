
package jogo;

/**
 *
 * @author Garcia
 */


import java.util.Random;

public class Barbaro extends Personagem {
    
    Random random = new Random();
    int i; 
    
    Itens[] bolca = new Itens[5];   
     
    private int reducao;
    private int instinto = random.nextInt(3) + 1;
    private int furia = random.nextInt(5) + 1;
    

    public void  atacar(int forca){
        this.forca += this.furia;
    }
    
    public void  defender (int forca){
        this.defesa += this.instinto;
    }
    
    public void ataque (int atacar){
        this.vidaUs-= (atacar - this.defesa);
    }
}
 
