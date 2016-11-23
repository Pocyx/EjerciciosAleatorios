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
public class Ejer23Tema6 {
    /**
     * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
        Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
     */
    public static void generarDadoPoker() {
        System.out.println("··················································");
        System.out.println("|||||||||          Dado de poker        ||||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        String dado = "";

        for (int i = 0; i < 5; i++) {
          switch((int)(Math.random() * 6)) {
            case 0:
              dado = "As";
              break;
            case 1:
              dado = "K";
              break;
            case 2:
              dado = "Q";
              break;
            case 3:
              dado = "J";
              break;
            case 4:
              dado = "7";
              break;
            case 5:
              dado = "8";
              break;
            default:
          }
          System.out.print(dado + " ");
        }
        System.out.println("");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
    }
}
