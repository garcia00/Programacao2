
package jogo;

/**
 *
 * @author Garcia
 */
abstract public class Personagem {
    
    int forca;
    int defesa;
    private int destresa;
    private int inteligencia;
    private int sabedoria;
    private int carisma;
    int vidaUs;
    private int nivel;
    private Mochila mochila;
    
    private Armamento maoEsquerda;
    private Armamento maoDireita;
    
    public void ataque(Personagem personagem){
        
        
    }

    public Armamento getMaoEsquerda() {
        return maoEsquerda;
    }

    public void setMaoEsquerda(Armamento maoEsquerda) {
        this.maoEsquerda = maoEsquerda;
    }

    public Armamento getMaoDireita() {
        return maoDireita;
    }

    public void setMaoDireita(Armamento maoDireita) {
        this.maoDireita = maoDireita;
    }
    
    
    
    
}
