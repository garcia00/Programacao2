

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author Garcia
 */

public class Janelas extends JFrame{
    public Janelas(){
    
    add(new JButton("Iniciar"));
    setTitle("RPG");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,400);
    setLocationRelativeTo(null);
    setVisible(true);
    
    }
}
