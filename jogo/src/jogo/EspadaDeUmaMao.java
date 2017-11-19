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
public class EspadaDeUmaMao extends Armamento{

    
    public EspadaDeUmaMao(int peso, String nome) {
        super(peso, nome);
    }

    
    @Override
    public void equipar(Personagem personagem, String mao) {
        if(mao.equals("esquerda")){
            personagem.setMaoEsquerda(this);
        }else if(mao.equals("direita")){
            personagem.setMaoDireita(this);
        }else{
            throw new IllegalArgumentException("Apenas as strings \"esqueda\" e \"direita\" são aceitas na variavel mao.");
        }
        this.personagem = personagem;
    }
    
    
    
    
}
