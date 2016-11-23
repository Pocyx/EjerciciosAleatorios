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
public class Ejer3Tema6 {
    /**
     * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
        de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
     */
    public static void sacarCarta() {
        
        System.out.println("··················································");
        System.out.println("|||||||||Una carta de la baraja española||||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        String palo = "";
        String carta = "";

        switch((int)(Math.random()*4)) {
          case 0:
            palo = "oros";
            break;
          case 1:
            palo = "copas";
            break;
          case 2:
            palo = "bastos";
            break;
          case 3:
            palo = "espadas";
          default:
        }

        int numeroCarta = (int)(Math.random()*11) + 1;

        switch(numeroCarta) {
          case 1:
            carta = "As";
            break;
          case 8:
            carta = "Sota";
            break;
          case 9:
            carta = "Caballo";
            break;
          case 10:
            carta = "Rey";
            break;
          default:
            carta = String.valueOf(numeroCarta);
        }

        System.out.println(carta + " de " + palo);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
    }
    
    
}
