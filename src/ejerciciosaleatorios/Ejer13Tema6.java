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
public class Ejer13Tema6 {
    /**
     * Escribe un programa que simule la tirada de dos dados. El programa deberá
        continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
        dados tengan el mismo valor.
     */
    public static void tirarDadosIguales() {
        System.out.println("··················································");
        System.out.println("||||||||Tira dados hasta que sean iguales|||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int dado1, dado2;

        do {
          dado1 = (int)(Math.random() * 6) + 1;
          dado2 = (int)(Math.random() * 6) + 1;
          System.out.println(dado1 + " " + dado2);
        } while (dado1 != dado2);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
    }

}
