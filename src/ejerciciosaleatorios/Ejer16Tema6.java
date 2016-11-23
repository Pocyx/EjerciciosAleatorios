/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaleatorios;

/**
 *
 * @author PocyxDesigner
 */
public class Ejer16Tema6 {
    /**
     * Realiza un simulador de máquina tragaperras simplificada que cumpla los
        siguientes requisitos:
        a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
        figuras posibles: corazón, diamante, herradura, campana y limón.
        b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
        ha perdido”.
        c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
        ha recuperado su moneda”.
        d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
        10 monedas”.
     */
    public static void simularTragaperra() {
        System.out.println("··················································");
        System.out.println("|||||||||         Tragaperras           ||||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int figura;
        int figura1 = 0;
        int figura2 = 0;
        int figura3 = 0;

        for (int i = 0; i < 3; i++) {
          figura = (int)(5 * Math.random());

          switch(figura) {
            case 0:
              System.out.print("corazón ");
              break;
            case 1:
              System.out.print("diamante ");
              break;
            case 2:
              System.out.print("herradura ");
              break;
            case 3:
              System.out.print("campana ");
              break;
            case 4:
              System.out.print("limón ");
              break;
            default:
          }

          switch(i) {
            case 0:
              figura1 = figura;
              break;
            case 1:
              figura2 = figura;
            break;
            case 2:
              figura3 = figura;
            break;
            default:
          }
        }

        if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
          System.out.println("\nLo siento, ha perdido.");
        } else if ((figura1 == figura2) && (figura2 == figura3)) {
          System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
        } else {
          System.out.println("\nBien, ha recuperado su moneda.");
        }
        System.out.println("");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
    }
}
