/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaleatorios;


import java.util.ArrayList;

/**
 *
 * @author POCYX
 */
public class Partida {  
    //jugadores = new ArrayList<Jugador>();
    static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();


    
    /**
     *Constructor de partida
     * @param dado tipo Dado
     * @param jugador tipo Jugador
     */
    public Partida(Dados dado, Jugador jugador) {
        jugadores = new ArrayList<Jugador>();
    }
    
    
    /**
     *Método para crear jugadores e introducirlos en el array.
     * @param N numero de jugadores
     */
    public void agregarJugador(int N){
        //Declaración de variables para leer los datos de los jugadores
        int puntos;
        int mondadientes;
        int id;
        boolean on;
        //Variable auxiliar que contendrá la referencia a cada jugador nuevo.
        Jugador jugador;
        int pD1 = 0;
        for (int i = 1; i <= N; i++) {       
            //leer datos de cada jugador
            pD1++;
            puntos = 0;
            id = pD1;           
            mondadientes=5;
            on = true;
            jugador = new Jugador(); //Se crea un objeto Jugador y se asigna su referencia a jugador
            //se asignan valores a los atributos del nuevo objeto
            jugador.setPuntos(puntos);
            jugador.setMondadientes(mondadientes);
            jugador.setId(id);
            jugador.setOn(on);
           //se añade el objeto al final del array
            jugadores.add(jugador);
        }
        
        
    } 
    
    
    
    
}//
