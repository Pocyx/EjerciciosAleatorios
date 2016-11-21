/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaleatorios;

import java.util.ArrayList;
import java.util.Scanner;
import static ejerciciosaleatorios.Dados.dado;
import static ejerciciosaleatorios.Partida.jugadores;
/**
 *
 * @author PocyxDesigner
 */
public class EjerciciosAleatorios {
    
    Dados dado = new Dados();
    Jugador jugador;
    static int N;
    Partida partida = new Partida(dado, jugador);
    
    /**
     *Constructor de la interfaz.
     */
    public EjerciciosAleatorios() {
        Partida partida = new Partida(dado, jugador);
        
    }

    /**
     *Main
     * @param args main
     */
    public static void main(String[] args) { 
        EjerciciosAleatorios cli = new EjerciciosAleatorios();
        cli.run();
    } //fin método main
    
    /**
     *
     */
    public void run(){
        Scanner s = new Scanner(System.in);
        String juego;
       

        boolean datosCorrectos = true;

        // Recogida de datos /////////////////////////////////////
        do {
          System.out.println("");
          System.out.print("Elija un juego (dados, cartas) o numero de ejercicio del tema6, q para salir. ");
          juego = s.nextLine();
          if(juego.equals("q")){
              break;
          }


          switch(juego) {
            case "dados":
            case "1":
                System.out.print("DADOS, pierde quien saque menos. ");
                introducirNJugadores();
                partida.agregarJugador(N);
                introducirNombres();
                System.out.println("\nJugadores introducidos:");
                mostrarJugadores();
                do {
                    do{           
                        System.out.println("\n Nueva ronda\n");
                        do{
                            tirarDadosJugador();
                            Ronda.ganarPartida();

                            break;
                        }while(true);
                        System.out.println("\n   Fin de ronda\n");
                        mostrarJugadores();
                        System.out.println("\nHa perdido la ronda: "+Ronda.perderRonda());

                        break;
                    }while(true);    
                    break;
                    //if(jugadores.size()==1)break;
                }while(true);
                System.out.println("\nFIN DE LA PARTIDA");
                
              //break;
            case "cartas":
            case "2":
     
              break;
            case "chocolate":
            case "3":
     
           
              break;


          }
          
        } while (datosCorrectos);
    // Fin de la recogida de datos ///////////////////////////
    }
        

             
        
    
    
    /**
     *El usuario introduce por teclado el numero de jugadores.
     * @return N, numero de jugadores.
     */    
    /**
     *El usuario introduce por teclado el numero de jugadores.
     * @return N, numero de jugadores.
     */
    public static int introducirNJugadores(){
        Scanner s = new Scanner(System.in);
        //se pide por teclado el número de jugadores a leer.
        do {
            System.out.print("Número de jugadores? ");
            N = Integer.parseInt(s.nextLine());
        } while (N < 0);
        return N;
    }
    
    /**
     *El usuario introduce por teclado los nombres de los jugadores.
     * Guarda cada nombre en cada jugador.
     */
    public static void introducirNombres(){
        Scanner s = new Scanner(System.in);
        String nombre;
        for(Jugador jugador: jugadores){  
            System.out.println("Nombre: ");
            nombre = s.nextLine();          
            jugador.setNombre(nombre);
        }       
    }
    
    /**
     *Lanza los dados.
     * @return puntos
     */
    public static int tirarDados(){
        Scanner s = new Scanner(System.in);
        Jugador tira = new Jugador();
        int puntos;
        puntos = tira.getPuntos();
        s.nextLine();
        Dados dado = new Dados();
        //dado.tirar();
        puntos=dado.puntuacion();
        tira.setPuntos(puntos);
        return puntos;
    }
    
    /**
     *Cada jugador tira los dados.
     */
    public static void tirarDadosJugador(){
        int i =0;
        for(Jugador jugador: jugadores){  
            int puntos = jugador.getPuntos() ;
            if(jugador.getOn()==true);
            System.out.println(" Enter para lanzar los dados PLAYER: "+jugadores.get(i).getId()+"  "+jugadores.get(i).getNombre());
            puntos =  tirarDados();
            System.out.println("\n");
            jugador.setPuntos(puntos);
            i++;
        }       
    }
    
    /**
     *Método para mostrar todos los jugadores.
     */
    public void mostrarJugadores(){        
            for(int i = 0; i< jugadores.size(); i++){
                System.out.println(" "+jugadores.get(i));  //se invoca el método toString de la clase Jugador
            }    
           
    }
    
}
