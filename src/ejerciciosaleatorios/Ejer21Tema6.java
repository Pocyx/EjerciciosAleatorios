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
public class Ejer21Tema6 {
    /**
     * Realiza un programa que genere una secuencia de cinco monedas de curso
        legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
        5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
        posiciones posibles son cara y cruz.
     */
    public static void aleMonedas() {

        System.out.println("··················································");
        System.out.println("|||||||||      Secuencia de monedas     ||||||||||");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        // Todavía no se han visto los arrays y por eso el ejercicio está
        // implementado exclusivamente con variables. Con arrays podría
        // ser mucho más corto.

        String moneda = "";
        String posicion = "";

        for (int i = 0; i < 5; i++) {
          switch((int)(Math.random() * 8)) {
            case 0:
              moneda = "1 céntimo";
              break;
            case 1:
              moneda = "2 céntimos";
              break;
            case 2:
              moneda = "5 céntimos";
              break;
            case 3:
              moneda = "10 céntimos";
              break;
            case 4:
              moneda = "20 céntimos";
              break;
            case 5:
              moneda = "50 céntimos";
              break;
            case 6:
              moneda = "1 euro";
              break;
            case 7:
              moneda = "2 euros";
            default:
          }

          switch((int)(Math.random() * 2)) {
            case 0:
              posicion = "cara";
              break;
            case 1:
              posicion = "cruz";
              break;
            default:
          }

          System.out.println(moneda + " - " + posicion);
        }
        System.out.println("");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("··················································");
  }
}
