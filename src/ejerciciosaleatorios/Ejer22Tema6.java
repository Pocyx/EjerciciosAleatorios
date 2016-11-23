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
public class Ejer22Tema6 {
    /**
     * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
        aleatorio. La cabeza se representará con el carácter @ y se debe colocar
        exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
        el cuerpo irá serpenteando de la siguiente manera: se generará de forma
        aleatoria un valor entre tres posibles que hará que el siguiente carácter se
        coloque una posición a la izquierda del anterior, alineado con el anterior o una
        posición a la derecha del anterior. La longitud de la serpiente se pedirá por
        teclado y se supone que el usuario introducirá un dato correcto.
     */
    public static void pintarSerpiente() {
        System.out.println("··················································");
        System.out.println("|||||||||           Serpiente           ||||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca la longitud de la serpiente en ");
        System.out.print("caracteres contando la cabeza: ");
        int longitud = Integer.parseInt(s.nextLine());

        // pinta la cabeza
        System.out.println("            @");

        // pinta el cuerpo
        int i;
        int x = 13;

        while (longitud > 1) {
          // suma -1, 0 o 1 a la variable x
          x += (int)(Math.random() * 3) - 1;

          // pinta x - 1 espacios
          for (i = 1; i < x; i++) {
            System.out.print(" ");
          }

          // pinta el cuerpo
          System.out.println("#");

          longitud--;
        }
        System.out.println("");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
  }
}
