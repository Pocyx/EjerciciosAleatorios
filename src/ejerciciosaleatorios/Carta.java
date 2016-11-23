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
public class Carta {

    private String valor; //Valor de la Carta As, dos…
    private String figura; //Trebol, Diamante…

    //Constructor de la clase
    public Carta( String cardValor, String cardFigura ){
        valor = cardValor; //Inicializa el valor de la carta
        figura = cardFigura; //Inicializa la figura de la carta
    }

    //Retorna un String del valor y figura de la carta
    public String toString(){
        return valor + " de " + figura;
    }
} //Fin de la Clase Carta
