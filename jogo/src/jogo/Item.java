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
public abstract class Item {
    private final int peso;
    private final String nome;

    
    public Item(int peso, String name) {
        if(peso < 0)
            throw new IllegalArgumentException("Não pode criar itens com peso negativo.");
        this.peso = peso;
        this.nome = name;
    }

    public String getName() {
        return nome;
    }
    public int getPeso() {
        return peso;
    }
    
    
}
