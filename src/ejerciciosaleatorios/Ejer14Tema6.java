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
public class Ejer14Tema6 {
    /**
     * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
        El programa intentará adivinar el número que estás pensando - un número
        entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
        programa debe preguntar si el número que estás pensando es mayor o menor
        que el que te acaba de decir.
     */
    public static void adivinarMiNumero() {
        System.out.println("··················································");
        System.out.println("||||Hola, soy la maquina y adivinare tu numero||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Scanner s = new Scanner(System.in);
        int oportunidades = 5;
        int numeroPensado;
        int minimo = 0;
        int maximo = 100;
        boolean acertado = false;
        int mayorMenorOIgual;

        System.out.println("Piensa un numero del 0 al 100. Intentar adivinarlo en 5 intentos.");
        System.out.println("Pulsa la tecla INTRO cuando estes preparado.");
        s.nextLine();

        do {
          numeroPensado = (int)(Math.random() * (maximo - minimo) + minimo);
          System.out.println("¿Es el " + numeroPensado + "?");
          System.out.print("El numero que estas pensando es 1) mayor 2) menor 3) el mismo: ");
          mayorMenorOIgual = Integer.parseInt(s.nextLine());
          oportunidades--;

          if ( (mayorMenorOIgual == 1) && (oportunidades > 0) )
            minimo = numeroPensado + 1;

          if ( (mayorMenorOIgual == 2) && (oportunidades > 0) )
            maximo = numeroPensado - 1;

          if (mayorMenorOIgual == 3) {
            acertado = true;
            System.out.println("¡Bien! ¡he acertado!");
          }
        } while(!acertado && (oportunidades > 0));

        if (!acertado) {
          System.out.println("Vaya, no he conseguido acertar el numero.");
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
    }

}
