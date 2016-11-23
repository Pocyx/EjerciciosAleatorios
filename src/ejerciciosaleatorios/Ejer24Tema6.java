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
public class Ejer24Tema6 {
    /**
     * Escribe un programa que, dado un número introducido por teclado, elija al azar
        uno de sus dígitos.
     */
    public static void aleDigito() {
        System.out.println("··················································");
        System.out.println("|||||||||         Digito al azar        ||||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numeroIntroducido = Long.parseLong(s.nextLine());

        long numero = numeroIntroducido;

        // calcula la longitud del número
        int longitud = 0;

        do {
          numero /= 10;
          longitud++;
        } while (numero > 0);

        // elige una posición al azar dentro del número
        int posicion = (int)(Math.random() * longitud) + 1;

        // extrae el dígito de esa posición
        System.out.println((numeroIntroducido / (long)(Math.pow(10, longitud - posicion))) % 10);
        System.out.println("");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
    }
}
