/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jogo;

/**
 *
 * @author Gustavo
 */
public class Arco extends Armamento{

    public Arco(int peso, String nome) {
        super(peso, nome);
    }

    public void equipar(Personagem personagem, String mao) {
        personagem.setMaoDireita(this);
        personagem.setMaoEsquerda(this);
        this.personagem = personagem;
    }
    
}
