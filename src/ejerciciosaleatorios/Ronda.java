/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaleatorios;

import java.util.ArrayList;
import static  ejerciciosaleatorios.Partida.jugadores;

/**
 *
 * @author POCYX
 */
public class Ronda {
    
    
    
    /**
     *Si la puntuacion es 69 el jugador gana, y por tanto se sale de la partida.
     */
    public static void ganarPartida(){      
            for(int i = 0; i< jugadores.size(); i++){
                if(jugadores.get(i).getPuntos() >= 69){
                    System.out.println("\nHa ganado la partida: \n"+ jugadores.get(i));
                    jugadores.remove(i);
                }             
            }
    }
    
    /**
     *Si el jugador tiene 0 mondadientes; gana y se sale de la partida.
     */
    public static void sinMondadientes(){      
            for(int i = 0; i< jugadores.size(); i++){
                if(jugadores.get(i).getMondadientes()<1){
                    System.out.println("\nHa ganado la partida: \n"+ jugadores.get(i));
                    jugadores.remove(i);
                }         
            }
    }
    
    
    
    /**
     *Comprueba el jugador con menor puntos y lo retorna. 
     * @return menor
     */
    public static Jugador perderRonda(){
        Jugador menor = jugadores.get(0);
        for(int i=0; i<jugadores.size(); i++) {
            Jugador jugador = (Jugador) jugadores.get(i);
            for(int j=i+1; j<jugadores.size(); j++) {
                Jugador jugador2 = (Jugador) jugadores.get(j);
                if (jugador.getPuntos() < jugador2.getPuntos()) {
                    menor = jugador;
                }
                else if (jugador2.getPuntos() < jugador.getPuntos()) {
                    menor = jugador2;
                }
            }
        }
        return menor; 
    }
    
    /**
     *Le da el numero de jugadores activos en mondadientes al jugador con menor puntos.
     * @param menor jugadr con menor puntos
     */
    public static void darMondadientesPerdedor(Jugador menor){
        int mondadientes = menor.getMondadientes();  
        mondadientes = mondadientes + jugadores.size();
        menor.setMondadientes(mondadientes);
    }
    
    /**
     *Le quita un mondadiente a todos los jugadores.
     */
    public static void quitarMondadiente(){
        for(int i = 0; i< jugadores.size(); i++){  
            Jugador otro = jugadores.get(i);
            int mondadientes = otro.getMondadientes();
            mondadientes = mondadientes - 1;
            otro.setMondadientes(mondadientes);
        }
    }
}
