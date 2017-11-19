/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jogo;

import java.util.ArrayList;

/**
 *
 * @author Garcia
 */
public class Mochila {
    private final int capacidade_q;
    private final int capacidade_p;
    private int quantidade;
    private int peso_total;
    private final ArrayList<Item> itens;

    public Mochila(int capacidade_q, int capacidade_p) {
        this.capacidade_q = capacidade_q;
        this.capacidade_p = capacidade_p;
        itens = new ArrayList<>(capacidade_q);
        quantidade = 0;
        peso_total = 0;
    }
    
    public boolean inserirItem(Item item){
        System.out.println("inserirItem");
        if(quantidade >= capacidade_q){
            return false;
        }
        if(peso_total+item.getPeso() > capacidade_p){
            return false;
        }
        //TODO: fazer verificação do peso.
        itens.add(item);
        peso_total+=item.getPeso();
        quantidade++;
        return true;
        
    }
    
    public Item removerItem(int indice){
        try{
            Item item = itens.remove(indice);
            peso_total -= item.getPeso();
            quantidade--;
            return item;
        }catch (ArrayIndexOutOfBoundsException e){
            return null;
        }
    }

    
    public String[] listarItens(){
        String[] itens = new String[quantidade];
        for (int i=0; i<quantidade; i++) {
            itens[i] = this.itens.get(i).getName();
        }
        return itens;
    }
            
}   
