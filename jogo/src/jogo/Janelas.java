/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Garcia
 */
class Janelas extends JFrame{
  

    public Janelas(){
    
    add(new JButton("Iniciar"));
    
    setTitle("RPG");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(700,500);
    setLocationRelativeTo(null);
    setVisible(true);
    
    }
}
    
