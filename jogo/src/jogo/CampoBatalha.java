
package jogo;

/**
 *
 * @author 201611140011
 */

import java.util.Random;
import java.util.Scanner;



public class CampoBatalha {
    Personagem Usu;
    Personagem Pc;
    
    
   public int ataqueUsu(){
           Scanner ler = new Scanner(System.in);
           System.out.println("Escolha seu Ataque");
           System.out.println("1 ");
           System.out.println("2 ");
           System.out.println("3 ");
           return ler.nextInt();
   
   } 
   
   public int atakPc(){
       Random rand = new Random();
       return rand.nextInt(3)+1; // retorna un numero de um a 3
   }
   
   public void imprimeHP(int hpUs, int hpPc){
       System.out.println("HP Usuario = "+hpUs);
       System.out.println("HP Maquina = "+hpPc);
   }
   
   public void batalha(){
       int hpUs = 100;
       int hpPc = 100;
       while (hpUs >= 0 && hpPc >= 0){
           imprimeHP(hpUs, hpPc);
          int  escolhaAtak = ataqueUsu();
           
           switch(escolhaAtak){
           case 1:
               System.out.println("Aplicar Ataque corporal!");
               hpPc -= 7;
               break;
            case 2:
               System.out.println("Aplicar Ataque com arma!");
               hpPc -= 10;
               break;
            case 3:
               System.out.println("Aplicar Ataque especial!");
               hpPc -= 40;
               hpUs -= 10;
               break;
               default:
               System.out.println("opção invalida! ");
               break;
       }
           
           if (hpPc > 0){
               
          escolhaAtak = atakPc();
           
           switch(escolhaAtak){
           case 1:
               System.out.println("Chute ");
               hpUs -= 7;
               break;
            case 2:
               System.out.println(" soco!");
               hpUs -= 10;
               break;
            case 3:
               System.out.println("Chute ");
               hpUs -= 40;
               hpPc -= -10;
               break;
               default:
               System.out.println("opção invalida! ");
               
               break;
            }
             
          }
           else {
                  System.out.println(" Acabou");
            }
   }
   }  
}
