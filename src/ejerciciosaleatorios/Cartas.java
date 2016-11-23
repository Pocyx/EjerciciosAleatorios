/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaleatorios;
import java.util.Random;
/**
 *
 * @author PocyxDesigner
 */
public class Cartas {

    private Carta mazo[]; //Array de Objetos tipo Carta
    //static int[] mazo2 = new int[2];
    private int cartaActual; //Indice de la próxima carta a ser repartida
    private final int NUMERO_DE_CARTAS = 52;
    private Random numeroAleatorio; //Genera número aleatorio
    public Cartas(){
        String valor[] = {"As", "Tres", "Cuatro", "Cinco", "Seis", "Siete" , "Ocho", "Nueve", "Diez","J", "Q", "K" };
        String figura[] = {"Corazones", "Diamantes", "Picas", "Trebol"};
        
        
        //mazo = new ArrayList<Carta>();
        mazo = new Carta[NUMERO_DE_CARTAS]; //Crea un Array de Objetos 

        cartaActual = 0; //Asignar a la carta actual el valor mazo[0]
        numeroAleatorio = new Random(); //Generar número aleatorio

        //Obtengo el valor y figura de las cartas a través de un for
        for( int contador = 0; contador < mazo.length; contador++){
            
            
            mazo[contador] = new Carta( valor[ contador % 13 ], figura[ contador/13 ] );
            /**El resultado de contador % 13 (modulo)  es un número entre 0 y 12
             * y el resultado de contador/13 (división)  es un número entre 0 y 3
             */
        }
    } //Fin del Constructor

    /**
    public void mostrarCarta(){
        mazo2 = new int[2];
        mazo2[0]=(int)(numeroAleatorio.nextInt(13) + 1);
        mazo2[1]=(int)(numeroAleatorio.nextInt(4) + 1);
        //dado[2]=(int)(generador.nextInt(6) + 1);
    }*/
    
    public void barajar(){
        //Antes de barajar el repartidor debe iniciar en mazo[0] nuevamente
        cartaActual = 0;

        //Para cada carta, al mostrar otra aleatoriamente debe intercambiarse
        //por la anterior
        for( int primera = 0; primera < mazo.length; primera++ ){

            //Seleccionar una carta de manera aleatoria entre 0 y 51
            int segunda = numeroAleatorio.nextInt( NUMERO_DE_CARTAS );

            //Intercambiar carta actual por la seleccionada aleatoriamente
            Carta temporal = mazo[ primera ];
            mazo[ primera ] = mazo[ segunda ];
            mazo[ segunda ] = temporal;
        }
    }

    public Carta repartirCartas(){
        //Determinar si la carta pertenece al mazo
        if( cartaActual < mazo.length )
            return mazo[ cartaActual++ ]; //Retorna carta actual en el array
        else
            return null; //Indica que todas las cartas han sido repartidas
    }
} //Fin de la Clase
