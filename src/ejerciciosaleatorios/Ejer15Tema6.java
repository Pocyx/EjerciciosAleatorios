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
public class Ejer15Tema6 {
    /**
     * Realiza un generador de melodía con las siguientes condiciones:
        a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
        sol, la y si.
        b) Una melodía está formada por un número aleatorio de notas mayor o igual
        a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
        c) Cada grupo de 4 notas será un compás y estará separado del siguiente
        compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
        con dos barras.
        d) La última nota de la melodía debe coincidir con la primera.
     */
    public static void generarMelodia() {
        System.out.println("··················································");
        System.out.println("|||||||||     Generador de melodias     ||||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int notas = 4 * (int)(Math.random() * 7 + 1);
        String nota = "";
        String primeraNota = "";

        for (int contadorNota = 1; contadorNota <= notas; contadorNota++) {
          switch((int)(Math.random() * 7)) {
            case 0:
              nota = "do";
              break;
            case 1:
              nota = "re";
              break;
            case 2:
              nota = "mi";
              break;
            case 3:
              nota = "fa";
              break;
            case 4:
              nota = "sol";
              break;
            case 5:
              nota = "la";
              break;
            case 6:
              nota = "si";
              break;
            default:
          }

          if (contadorNota == 1) {
            primeraNota = nota;
          }

          if (contadorNota == notas) {
            nota = primeraNota;
          }

          System.out.print(nota + " ");

          if ( contadorNota == notas ) {
            System.out.print("||");
          } else if ( contadorNota % 4 == 0 ) {
            System.out.print("| ");
          }

        } // for
        
        System.out.println("");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
    }
}
