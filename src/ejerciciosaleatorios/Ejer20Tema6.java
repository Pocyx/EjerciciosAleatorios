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
public class Ejer20Tema6 {
    /**
     * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
        agua. La capacidad será indicada por el usuario. La cuba se llenará con una
        cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
        pueda admitir. El ancho de la cuba no varía.
     */
    public static void llenarCuba() {
        System.out.println("··················································");
        System.out.println("|||||||||    Rellena la cuba de agua    ||||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        int capacidad = Integer.parseInt(s.nextLine());

        // Rellena la cuba con unos litros aleatorios
        // teniendo en cuenta no pasarse de la capacidad.
        int litros = (int)(Math.random() * (capacidad + 1));  

        for (int i = 0; i < capacidad; i++) {
          if (i < (capacidad - litros)) {
            System.out.println("#    #");
          } else {
            System.out.println("#====#");
          }
        }

        System.out.println("######"); // fondo de la cuba
        System.out.print("La cuba tiene una capacidad de " + capacidad);
        System.out.print(" litros y contiene " + litros + " litros de agua.");
        System.out.println("");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
  }
}
