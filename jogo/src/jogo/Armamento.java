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
public abstract class Armamento extends Item {

    protected Personagem personagem;
    
    public Armamento(int peso, String nome) {
        super(peso, nome);
    }
            
    /**
     * Este método equipa o armamento no personagem passado por parâmetro.
     * @param personagem personagem que será equipado a arma.
     * @param mao Só pode ser "esqueda" e "direita"
     */
    public abstract void equipar(Personagem personagem, String mao);
    
}
