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
public class Ejer5Tema6 {
    /**
     * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
        separados por espacios. Muestra también el máximo, el mínimo y la media
        de esos números.
    */
    public static void ale10019950() {
        System.out.println("··················································");
        System.out.println("|||||||||     50 num entre 100 y 199    ||||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int maximo = 100;
        int minimo = 199;
        int suma = 0;
        int n;

        for (int i = 0; i < 50; i++) {
          n = (int)(Math.random()*100) + 100;
          System.out.print(n + " ");
          suma += n;

          if (n < minimo) {
            minimo = n;
          }

          if (n > maximo) {
            maximo = n;
          }
        }

        System.out.println("\nMinimo: " + minimo + "\nMaximo: " + maximo + "\nMedia: " + suma / 50);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
      }
}
