/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaleatorios;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PocyxDesigner
 */
public class Ejer12Tema6 {
    /**
     * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
        con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
        convertir un entero en un carácter.
     */
    public static void pintarMatrix() {
        System.out.println("··················································");
        System.out.println("||||||||              MATRIX             |||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        int linea = 0;

        System.out.print("\033[32m"); // pinta en verde

        for(int i = 0; i < 8000; i++) {
          System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));

          if (linea++ == 60) {
            linea = 0;
              try {
                  Thread.sleep(50);
              } catch (InterruptedException ex) {
                  Logger.getLogger(Ejer12Tema6.class.getName()).log(Level.SEVERE, null, ex);
              }
            System.out.println();
          }
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
    }
}
