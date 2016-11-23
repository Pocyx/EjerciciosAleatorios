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
public class Ejer4Tema6 {
    /**
     * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
        por espacios.
     */
    public static void ale01020() {
        System.out.println("··················································");
        System.out.println("|||||||||      20 num entre 0 y 10      ||||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        for (int i = 0; i < 20; i++) {
          System.out.print((int)(Math.random()*11) + " ");
        }

        System.out.println();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
    }
}
