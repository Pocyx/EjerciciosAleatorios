/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaleatorios;

import java.util.ArrayList;
import java.util.Scanner;
import static ejerciciosaleatorios.Dados.dado;
//import static ejerciciosaleatorios.Dados.pun;
import static ejerciciosaleatorios.Partida.jugadores;
import java.util.Random;
/**
 *
 * @author PocyxDesigner
 */
public class EjerciciosAleatorios {
    private Random numeroAleatorio; //Genera número aleatorio
    
    Dados dado = new Dados();
    Jugador jugador;
    static int N;
    Partida partida = new Partida(dado, jugador);
    //Cartas cartas = new Cartas(Carta carta);
    /**
     *Constructor de la interfaz.
     */
    public EjerciciosAleatorios() {
        Partida partida = new Partida(dado, jugador);
        //Cartas carta = new Cartas();
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
          System.out.println("--------------------------------------------------");
          System.out.println("----------EJERCICIOS TEMA 6 (ALEATORIOS)----------");
          System.out.println("--------------------------------------------------");
          System.out.println("");
          System.out.println("Elija un juego (dados, cartas) o numero de ejercicio del tema6. ");
          System.out.println("Pulsa i para mostrar informacion. ");
          System.out.println("Pulsa q para salir.");
          System.out.print("----->");
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
                
              continue;
            case "cartas":
            case "2":
                Ejer2Tema6.sacarCarta();
                break;
            
            case "3":
                Ejer3Tema6.sacarCarta();
                break;
                
            case "4":
                Ejer4Tema6.ale01020();
                break;

            case "5":
                Ejer5Tema6.ale10019950();
                break;
                
            case "6":
                Ejer6Tema6.adivinarSuNumero();
                break;
                
            case "7":
                Ejer7Tema6.echarQuiniela();
                break;
                
            case "8":
                Ejer8Tema6.echarQuinielaProbabilidades();
                break;
                
            case "9":
                Ejer9Tema6.alePares();
                break;
            case "10":
                Ejer10Tema6.pintarLineas();
                break;
            case "11":
                Ejer11Tema6.darNotas();
                break; 
            case "12":
                Ejer12Tema6.pintarMatrix();
                break; 
            case "13":
                Ejer13Tema6.tirarDadosIguales();
                break; 
            case "14":
                Ejer14Tema6.adivinarMiNumero();
                break; 
            case "15":
                Ejer15Tema6.generarMelodia();
                break;
            case "16":
                Ejer16Tema6.simularTragaperra();
                break; 
            case "17":
                Ejer17Tema6.hacerPecera();
                break; 
            case "18":
                Ejer18Tema6.aleColores();
                break; 
            case "19":
                Ejer19Tema6.ale10020050();
                break; 
            case "20":
                Ejer20Tema6.llenarCuba();
                break; 
            case "21":
                Ejer21Tema6.aleMonedas();
                break; 
            case "22":
                Ejer22Tema6.pintarSerpiente();
                break; 
            case "23":
                Ejer23Tema6.generarDadoPoker();
                break; 
            case "24":
                Ejer24Tema6.aleDigito();
                break; 
            case "25":
                Ejer25Tema6.ale10200100();
                break; 
            case "i":
                Introduccion.verIntro();
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
