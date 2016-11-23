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
public class Ejer9Tema6 {
    /**
     * Realiza un programa que vaya generando números aleatorios pares entre 0
        y 100 y que no termine de generar números hasta que no saque el 24. El
        programa deberá decir al final cuántos números se han generado.
     */
    public static void alePares() {
        System.out.println("··················································");
        System.out.println("|||||||Saca aleatorios pares entre 0 y 100||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int n = 0;
        int cuentaNumeros = 0;

        while (n != 24) {
          n = (int)(Math.random() * 51) * 2;
          System.out.print(n + " ");
          cuentaNumeros++;
        }
        System.out.println("\nSe han generado " + cuentaNumeros + " numeros.");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
  }
}
