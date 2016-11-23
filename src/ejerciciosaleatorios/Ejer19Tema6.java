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
public class Ejer19Tema6 {
    /**
     * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
        entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
        luego el máximo de los pares el mínimo de los impares y la media de todos los
        números generados.
     */
    public static void ale10020050() {
        System.out.println("··················································");
        System.out.println("|||||||||    50 num entre -100 y 200    ||||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int numero;
        int maximoPar = -100;
        int minimoImpar = 200;
        int suma = 0;

        for (int i = 0; i < 50; i++) {
          numero = (int)(Math.random() * 301) - 100;

          System.out.print(numero + " ");

          if (numero % 2 == 0) { // el número es par
            if (numero > maximoPar) maximoPar = numero;
          } else { // el número es impar
            if (numero < minimoImpar) minimoImpar = numero;
          }

          suma += numero;
        }

        System.out.println("\nMáximo de los pares: " + maximoPar);
        System.out.println("Mínimo de los impares: " + minimoImpar);
        System.out.println("Media: " + suma / 50);
        System.out.println("");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
  }
}
