
package jogo;

import java.util.Scanner;

/**
 *
 * @author Garcia
 */
public class Jogo {

   public static void main(String[] args) {
       
    /**
     * menu inicial do jogo
     */

        int opcao = 1;
        Scanner entrada = new Scanner(System.in);
        
        while (opcao!= 0) {
        System.out.println("\t === MENU PRINCIPAL ====");
        System.out.println("* 0. Fim                 *");
        System.out.println("* 1. Escolhe personagem  *");
        System.out.println("* 2. Escolhe itens       *");
        System.out.println("* 3. Batalhar            *");
        System.out.println("* 4. Consulta            *");
        System.out.println("* Opcao:                 *");
        System.out.println("==========================");
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
            System.out.println("Escolha personagem:");
            System.out.println("\t === PERSONAGENS ====");
            System.out.println("* 1. MAGO             *");
            System.out.println("* 2. TEMPLARIO        *");
            System.out.println("* 3. BARBARO          *");
            System.out.println("====================== ");
            int e = 0;
                e = entrada.nextInt();
                if ( e == 1){
                    
                    Mago m = new Mago();
                    System.out.println("Você escolheu o MAgo");
                }if (e == 2){
                    Templario t = new Templario();
                    System.out.println("Você escolheu o Templario");
                }if (e == 3){
                    Barbaro b = new Barbaro();
                    System.out.println("Você escolheu o Barbaro");
                }
                break;
                
            case 2:
                
                break;
                
            case 3:
                CampoBatalha batlle = new CampoBatalha();
                batlle.batalha();
                break;
                
            case 4:
                
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        }
    }
}

