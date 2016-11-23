/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaleatorios;

import java.util.Scanner;

/**
 *
 * @author PocyxDesigner
 */
public class Ejer6Tema6 {
    /**
     * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
        debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
        fallido, el programa dirá cuántas oportunidades quedan y si el número introducido
        es menor o mayor que el número secreto.
     */
    public static void adivinarSuNumero() {
        System.out.println("··················································");
        System.out.println("|||||||||     Adivinas mi numero?       ||||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Scanner s = new Scanner(System.in);
        int oportunidades = 5;
        int numeroIntroducido;
        boolean acertado = false;
        int numeroMisterioso = (int)(Math.random() * 101);

        System.out.println("Estoy pensando un numero del 0 al 100, intenta adivinarlo. Tienes 5 oportunidades.");

        do {
          System.out.print("Introduce un numero: ");
          numeroIntroducido = Integer.parseInt(s.nextLine());
          oportunidades--;

          if ( (numeroIntroducido > numeroMisterioso) && (oportunidades > 0) ){
            System.out.println("El numero que estoy pensando es menor que " + numeroIntroducido);
            System.out.println("Te quedan " + oportunidades + " oportunidades.");
          }

          if ( (numeroIntroducido < numeroMisterioso) && (oportunidades > 0) ){
            System.out.println("El numero que estoy pensando es mayor que " + numeroIntroducido);
            System.out.println("Te quedan " + oportunidades + " oportunidades.");
          }

          if (numeroIntroducido == numeroMisterioso) {
            acertado = true;
            System.out.println("Enhorabuena! has acertado!");
          }
        } while (!acertado && (oportunidades > 0));

        if (!acertado) {
          System.out.println("Lo siento, no has acertado, el numero que estaba pensando era el " + numeroMisterioso);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
    }

}
